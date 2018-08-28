package com.example.demo.service;

import com.example.demo.dao.*;
import com.example.demo.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xhou on 2018/8/24.
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private InvestmentRepository investmentRepository;

    @Autowired
    private ProgramRepository programRepository;

    @Autowired
    private ImageRepository imageRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    public LoginResponse login(String userName, String password){
        LoginResponse loginResponse = new LoginResponse();
        try{
            UserDao userdao = userRepository.findByUserName(userName);
            if(null==userdao){
                loginResponse.setCode(1001);
                loginResponse.setMessage("您的账号不存在");
                return loginResponse;
            }else{
                String dbPassword = userdao.getPassword();
                if(!dbPassword.equals(password)){
                    loginResponse.setCode(1002);
                    loginResponse.setMessage("您的密码错误");
                    return loginResponse;
                }
            }
            String userId = String.valueOf(userdao.getUserId());
            String personalRateReturn = userdao.getPersonalRateReturn();
            loginResponse.setUserId(userId);
            loginResponse.setPersonal_rate_return(personalRateReturn);
            loginResponse.setUsername(userName);
            loginResponse.setCode(200);
            loginResponse.setMessage("成功");
        }catch(Exception e){
            throw e;
        }
        return loginResponse;
    }

    public ProgramAllResponse getProgramAll(){
        ProgramAllResponse programAllResponse = new ProgramAllResponse();
        List<ProgramDao> list = new ArrayList<>();
        try{
            List<ProgramDao> programDaoList = programRepository.findAll();
            if(0==programDaoList.size()){
                programAllResponse.setCode(1007);
                programAllResponse.setMessage("没有任何项目");
                return programAllResponse;
            }
            for(int i=0; i< programDaoList.size(); i++){
                ProgramDao programDao = programDaoList.get(i);
                list.add(programDao);
            }
            programAllResponse.setCode(200);
            programAllResponse.setMessage("成功");
            programAllResponse.setProgramDaoList(list);
        }catch(Exception e){
            throw e;
            }
        return programAllResponse;
    }

    public ProgramResponse getProgram(String programId){
        ProgramResponse programResponse = new ProgramResponse();
        try{
            ProgramDao programDao = programRepository.findByProgramId(Integer.valueOf(programId));
            if(null==programDao){
                programResponse.setCode(1004);
                programResponse.setMessage("通过programId没有找到项目");
                return programResponse;
            }
            programResponse.setCode(200);
            programResponse.setMessage("成功");
            programResponse.setAddress(programDao.getAddress());
            programResponse.setDetail(programDao.getDetail());
            programResponse.setOwner(programDao.getOwner());
            programResponse.setProgramName(programDao.getProgramName());
            programResponse.setProgramRateReturn(programDao.getProgramRateReturn());
        }catch(Exception e){
            throw e;
        }
        return programResponse;
    }

    public ProgramImageResponse getProgramImage(String programId){
        ProgramImageResponse programImageResponse = new ProgramImageResponse();
        try{
            List<ImageDao> imageList = imageRepository.findByProgramId(Integer.valueOf(programId));
            if (0==imageList.size()) {
                programImageResponse.setCode(1005);
                programImageResponse.setMessage("该项目没有图片");
                return programImageResponse;
            } else {
                List<String> list = new ArrayList<>();
                for (int i = 0; i < imageList.size(); i++) {
                    String imageLocation = imageList.get(i).getImage();
                    list.add(imageLocation);
                }
                programImageResponse.setCode(200);
                programImageResponse.setMessage("成功");
                programImageResponse.setImages(list);
            }
        }catch(Exception e){
            throw e;
        }
        return programImageResponse;
    }

    public ProgramPersonalResponse getProgramPersonal(String userId){
        ProgramPersonalResponse programPersonalResponse = new ProgramPersonalResponse();
        try{
            List<InvestmentDao> investmentDao=investmentRepository.findByUserIdAndStatus(Integer.valueOf(userId),0);
            if(0==investmentDao.size()){
                programPersonalResponse.setCode(1003);
                programPersonalResponse.setMessage("本期没有参与任何项目");
                return programPersonalResponse;
            }else{
                programPersonalResponse.setCode(200);
                programPersonalResponse.setMessage("成功");
                programPersonalResponse.setSubscription(investmentDao.get(0).getSubscription());
                programPersonalResponse.setStartDate(investmentDao.get(0).getStartDate());
                programPersonalResponse.setEndDate(investmentDao.get(0).getEndDate());
                List<Integer> list = new ArrayList<>();
                for(int i=0; i<investmentDao.size();i++){
                    Integer programId = investmentDao.get(i).getProgramId();
                    list.add(programId);
                }
                programPersonalResponse.setProgramIds(list);
            }
        }catch(Exception e){
            throw e;
        }
        return programPersonalResponse;
    }

    public ProgramHistoryResponse getProgramPersonalHistory(String userId){
        ProgramHistoryResponse programHistoryResponse = new ProgramHistoryResponse();
        try{
            List<InvestmentDao> investmentDao = investmentRepository.findByUserIdAndStatus(Integer.valueOf(userId),1);
            if(0==investmentDao.size()){
                programHistoryResponse.setMessage("没有历史投资项目");
                programHistoryResponse.setCode(1006);
                return programHistoryResponse;
            }else{
                List<String> list = new ArrayList<>();
                for(int i=0; i<investmentDao.size();i++){
                    int programId = investmentDao.get(i).getProgramId();
                    ProgramDao programDao = programRepository.findByProgramId(programId);
                    if(null==programDao){
                        programHistoryResponse.setCode(1004);
                        programHistoryResponse.setMessage("通过programId没有找到项目");
                        return programHistoryResponse;
                    }else{
                        String programName = programDao.getProgramName();
                        list.add(programName);
                    }
                }
                programHistoryResponse.setCode(200);
                programHistoryResponse.setMessage("成功");
                programHistoryResponse.setProgramHistory(list);
            }
        }catch(Exception e){
            throw e;
        }
        return programHistoryResponse;
    }
}

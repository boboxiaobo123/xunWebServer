package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xhou on 2018/8/25.
 */

@Repository
public interface ProgramRepository extends JpaRepository<ProgramDao, Long> {

    ProgramDao findByProgramId(int programId);
    List<ProgramDao> findAll();
}

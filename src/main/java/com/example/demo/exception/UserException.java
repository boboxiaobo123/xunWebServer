package com.example.demo.exception;

/**
 * Created by xhou on 2018/8/25.
 */


public class UserException extends RuntimeException{

    private String message;

    private int code;

    public UserException(int code, String message){
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

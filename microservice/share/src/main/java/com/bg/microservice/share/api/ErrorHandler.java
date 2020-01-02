package com.bg.microservice.share.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;
import com.bg.microservice.share.response.StatusCode;



public class ErrorHandler {

    private static final Logger logger = LoggerFactory.getLogger(StatusCode.class);

    public static Result error(int errorCode) {
        Result result = new Result<>(new Info(""));
        result.getInfo().setCode(errorCode).setCodeMessage(StatusCode.codeMap.get(errorCode));
        return result;
    }

    public static Result error(int errorCode,String parameter) {
        Result result = new Result<>(new Info(""));
        result.getInfo()
                .setCode(errorCode)
                .setCodeMessage(String.format(StatusCode.codeMap.get(errorCode), parameter));
        return result;
    }
}

package com.bg.microservice.share.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bg.microservice.share.response.Info;
import com.bg.microservice.share.response.Result;
import com.bg.microservice.share.response.StatusCode;


/**
 * api resource base method
 */
public class BaseResource {

    protected Logger logger;

    protected ApiProtocol apiProtocol;

    public BaseResource(ApiProtocol apiProtocol) {
        this.logger = LoggerFactory.getLogger(this.getClass());
        this.apiProtocol = apiProtocol;
    }

    public Object parameterIntCheck(ApiProtocol apiProtocol, String parameter) {
        if (apiProtocol.getParameters().containsKey(parameter)) {
            try {
                return Integer.parseInt(apiProtocol.getParameters().get(parameter).get(0));
            } catch (NumberFormatException e) {
                logger.error(e.getMessage());
                return error(StatusCode.PARAM_FORMAT_ERROR, parameter);
            }
        } else {
            return error(StatusCode.PARAM_CAN_NOT_BE_NULL, parameter);
        }
    }

    protected Result error(int code) {
        return ErrorHandler.error(code);
    }

    protected Result error(int code, String parameter) {
        return ErrorHandler.error(code, parameter);
    }

    protected Result success() {
        return new Result<>(new Info("Success"));
    }

    protected Result success(int code) {
        Result result = new Result<>(new Info("Success"));
        result.getInfo().setCode(code).setCodeMessage(StatusCode.codeMap.get(code));
        return result;
    }

}

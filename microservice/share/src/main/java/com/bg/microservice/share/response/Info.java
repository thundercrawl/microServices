package com.bg.microservice.share.response;

public class Info {
    private int code = 200;
    private String codeMessage;
    public Info(String msg)
    {
    	this.codeMessage = msg;
    }
    public int getCode() {
        return code;
    }

    public Info setCode(int error) {
        this.code = error;
        return this;
    }

    public String getCodeMessage() {
        return codeMessage;
    }

    public void setCodeMessage(String codeMessage) {
        this.codeMessage = codeMessage;
    }
}

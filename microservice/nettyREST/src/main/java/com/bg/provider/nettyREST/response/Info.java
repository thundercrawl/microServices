package com.bg.provider.nettyREST.response;

public class Info {
    private int code = 200;
    private String codeMessage;

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

package com.bg.microservice.share.response;

public class ListInfo extends Info {
    public ListInfo(String msg) {
		super(msg);
	}

	private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
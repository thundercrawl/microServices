package com.bg.provider.nettyREST.response;



import java.util.List;

import com.bg.provider.nettyREST.BaseEntity;


public class ListResult extends Result {

    protected List<? extends com.bg.provider.nettyREST.BaseEntity> item;

    public List<? extends BaseEntity> getItem() {
        return item;
    }

    public void setItem(List<? extends BaseEntity> item) {
        this.item = item;
    }

    public ListResult(Info info) {
        super(info);
    }
}

package com.example.account.cmd;

import org.apache.kafka.common.protocol.types.Field;

public abstract class BaseEvent{
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

package com.example.account.cmd;

public class ConcreteEvennt extends BaseEvent {
    private String name;
    public ConcreteEvennt(String name, String id){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

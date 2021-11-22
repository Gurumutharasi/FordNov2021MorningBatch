package com.ford1.springcore.nov_22_2021.Gurumutharasi.annotation;

public class ClientImpl implements Client{
Service service;

    public ClientImpl(Service service) {
        this.service = service;
    }

    @Override
    public void getClientInfo() {
        System.out.println("returning client info");
        String str = service.getServiceInfo();
    }
}

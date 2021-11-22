package com.ford1.springcore.nov_22_2021.Gurumutharasi.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
    @Bean("client1")
    public Client getClient1(Service service){
        return new ClientImpl(service);
    }

    @Bean("service1")
    public Service getService1(){
        return new ServiceImpl();
    }

}

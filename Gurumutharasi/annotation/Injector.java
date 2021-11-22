package com.ford1.springcore.nov_22_2021.Gurumutharasi.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Injector {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.ford1.springcore.nov_22_2021.Gurumutharasi.annotation.AppConfig.class);
        Client client =(Client) context.getBean("client1");
        client.getClientInfo();

        Service service = (Service) context.getBean("service1");
        String serviceInfo = service.getServiceInfo();
        System.out.println(serviceInfo);

    }
}

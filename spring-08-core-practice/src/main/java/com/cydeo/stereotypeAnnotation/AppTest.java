package com.cydeo.stereotypeAnnotation;

import com.cydeo.stereotypeAnnotation.config.Appconfig;
import com.cydeo.stereotypeAnnotation.model.DataStructure;
import com.cydeo.stereotypeAnnotation.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
    public static void main(String[] args) {


    ApplicationContext container =new AnnotationConfigApplicationContext(Appconfig.class);

    DataStructure ds =container.getBean(DataStructure.class);
ds.getTotalHours();
    Microservice microservice=container.getBean(Microservice.class);
   microservice.getTotalHours();
}
}
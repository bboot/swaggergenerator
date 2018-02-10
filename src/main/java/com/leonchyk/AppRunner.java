package com.leonchyk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
 * @author Bohdan Leonchyk
 */
public class AppRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("bean.xml");
        SwaggerConfig swaggerConfig = (SwaggerConfig) applicationContext.getBean("swaggerConfig");
        // print json on console
        swaggerConfig.printSwaggerJson();
        // generate json file
        swaggerConfig.createSwaggerJsonFile();
    }
}

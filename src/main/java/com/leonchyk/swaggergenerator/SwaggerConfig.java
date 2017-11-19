package com.leonchyk.swaggergenerator;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.util.Json;

import javax.ws.rs.core.Application;
import java.io.FileWriter;
import java.io.IOException;

public class SwaggerConfig extends Application {
    private static BeanConfig beanConfig = new BeanConfig();

    public SwaggerConfig() {
        beanConfig.setTitle("myTitle");
        beanConfig.setResourcePackage("com.leonchyk.swaggergenerator");
        beanConfig.setScan(true);
        beanConfig.scanAndRead();
    }

    void printSwaggerJson() {
        System.out.println(Json.pretty(beanConfig.getSwagger()));
    }

    void createSwaggerJsonFile() {
        try (FileWriter fileWriter = new FileWriter("swagger.json")) {
            fileWriter.write(Json.pretty(beanConfig.getSwagger()));
            fileWriter.flush();
            System.out.println("File swagger.json successfully created");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

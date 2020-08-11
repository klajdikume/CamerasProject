package com.rayonit.CamerasProject;

import com.mongodb.client.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class AppConfig {

    /*
    @Bean
    public MongoClient mongoClient(){
        return new MongoClient("localhost");
    }

    @Bean
    public MongoTemplate mongoTemplate(){
        return  new MongoTemplate(mongoClient(), "CameraDb");
    }
    */


}

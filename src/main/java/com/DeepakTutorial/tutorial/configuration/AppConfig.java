package com.DeepakTutorial.tutorial.configuration;

import com.DeepakTutorial.tutorial.DB;
import com.DeepakTutorial.tutorial.DevDB;
import com.DeepakTutorial.tutorial.ProdDB;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="project.mode" , havingValue = "development")
public class AppConfig {
    @Bean
    public DB getDevDBBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name="project.mode" , havingValue = "production")
    public DB prodDBBean(){
        return new ProdDB();
    }

    @Bean

    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}

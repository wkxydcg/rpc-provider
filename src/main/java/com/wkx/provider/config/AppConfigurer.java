package com.wkx.provider.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppConfigurer implements EnvironmentAware{

    private static Environment environment;

    @Override
    public void setEnvironment(Environment ev) {
        environment=ev;
    }

    public static String getProperty(String key){
        return environment.getProperty(key);
    }
}

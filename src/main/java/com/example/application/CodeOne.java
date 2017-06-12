package com.example.application;

import com.example.commons.ConfigLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Ashutosh on 09-03-2017.
 */
@Component
public class CodeOne {

    private static final Logger logger= LoggerFactory.getLogger(CodeOne.class);

    private String databaseurl;
    private String jdbcDriver;

    @Autowired
    ConfigLoader configLoader;

    @PostConstruct
    public void init(){

        databaseurl=configLoader.getDatabaseUrl();
        jdbcDriver=configLoader.getJdbcDriver();
    }

    public int myapplication(){

        int x=0;

        if(true){

            x=10;
        }

        return x;
    }

}

package com.example.commons;

import com.example.security.Decrypter;
import com.example.security.SecurityConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Ashutosh on 09-03-2017.
 */
@Component
public class ConfigLoader {

    private static final Logger logger= LoggerFactory.getLogger(ConfigLoader.class);
    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${database.url}")
    private String databaseUrl;

    @Value("${database.user}")
    private String databaseUser;

    @Value("${database.password}")
    private String databasePassword;

    public String getJdbcDriver() {
        return jdbcDriver;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getDatabaseUser() {
        return databaseUser;
    }

    public String getDatabasePassword() {
        return Decrypter.decrypt(SecurityConstants.KEY,SecurityConstants.INIT_VECTOR,databasePassword);
    }
}

package com.soaint.fogacoop.configuration;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
public class PersistenceConfigApp {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public JndiPropertyHolder primary() {
        return new JndiPropertyHolder();
    }

    @Profile({"dev","prod","test"})
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(primary().getDriverClassName());
        dataSource.setUrl(primary().getUrl());
        dataSource.setUsername(primary().getUsername());
        dataSource.setPassword(primary().getPassword());
        dataSource.setSchema(primary().getSchema());

        return dataSource;
    }

    @Data
    @Getter
    @Setter
    @ToString
    private static class JndiPropertyHolder {
        private String jndiName;
        private String url;
        private String username;
        private String password;
        private String driverClassName;
        private String maxActive;
        private String maxIdle;
        private String minIdle;
        private String initialSize;
        private String removeAbandoned;
        private String schema;

    }

}

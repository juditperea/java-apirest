package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.repository")
class MongoDBConfig extends AbstractMongoClientConfiguration {
    @Value("${spring.data.mongodb.database}")
    private String users;

    @Override
    protected String getDatabaseName() {
        System.out.println("Estoy aqui" + users);
        return users;
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        // Configure the MongoClientSettings
        builder.applyConnectionString(new ConnectionString("mongodb://localhost:27017"));
        System.out.println("Se ha conectado");
    }

}
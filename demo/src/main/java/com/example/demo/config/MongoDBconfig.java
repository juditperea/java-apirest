package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo.repository")
class MongoDBConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "users";
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        // Configure the MongoClientSettings
        builder.applyConnectionString(new ConnectionString("mongodb://localhost:27017"));
    }

}
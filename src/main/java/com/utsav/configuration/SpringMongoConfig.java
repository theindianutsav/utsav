package com.utsav.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoOptions;

@Configuration
public class SpringMongoConfig {

	public @Bean MongoDbFactory mongoDbFactory() throws Exception {
		UserCredentials credentials=new UserCredentials("admin", "admin");
		MongoOptions options=new MongoOptions();
		return new SimpleMongoDbFactory(new MongoClient("127.0.0.1",27017), "test",credentials);
	}

	public @Bean MongoTemplate mongoTemplate() throws Exception {

		MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

		return mongoTemplate;

	}

}
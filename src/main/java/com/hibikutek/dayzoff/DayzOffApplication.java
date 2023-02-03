package com.hibikutek.dayzoff;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class DayzOffApplication extends AbstractReactiveMongoConfiguration {
	@Bean
	public MongoClient mongoClient() {
		return MongoClients.create();
	}

	@Bean
	public ReactiveMongoTemplate reactiveMongoTemplate(ReactiveMongoDatabaseFactory factory) {
		return new ReactiveMongoTemplate(factory);
	}

	public static void main(String[] args) {
		SpringApplication.run(DayzOffApplication.class, args);
	}

	@Override
	protected String getDatabaseName() {
		return "dayzoff";
	}
}

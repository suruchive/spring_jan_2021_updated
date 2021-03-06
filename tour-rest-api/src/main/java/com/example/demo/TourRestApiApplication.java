package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Tour;
import com.example.demo.repos.TourRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Tour Service Rest API"))
public class TourRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourRestApiApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		
		return new CommandLineRunner() {
			
			@Autowired
			TourRepository repo;
			@Override
			public void run(String... args) throws Exception {
			
				repo.save(new Tour(101,"lanka",45000));
				repo.save(new Tour(102,"thailand",55000));
				repo.save(new Tour(103,"ladakh",25000));
				
			}
		};
		
	}
}

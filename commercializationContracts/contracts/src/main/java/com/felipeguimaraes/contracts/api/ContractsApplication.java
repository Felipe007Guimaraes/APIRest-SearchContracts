package com.felipeguimaraes.contracts.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.modelmapper.ModelMapper;


@SpringBootApplication
@RestController
public class ContractsApplication {

	@Bean
	public ModelMapper modelMapper(){
		var modelmapper = new ModelMapper();
		modelmapper.getConfiguration().setSkipNullEnabled(true);
		return modelmapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(ContractsApplication.class, args);
	}

}


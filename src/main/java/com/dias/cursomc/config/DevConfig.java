package com.dias.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dias.cursomc.services.DBService;
import com.dias.cursomc.services.EmailService;
import com.dias.cursomc.services.SmtpEmailService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private DBService dbService;

//houveram problemas com essa anotacao, onde a injecao nao era reconhecida
//	@Value("${spring.jpa.hibernate.dll-auto}")
//	private String strategy;
	
	@Bean
	public boolean instantiateDatabase() throws ParseException {
		
//		if(!"create".equals(strategy)) {
//			return false;
//		}
		
		dbService.instantiateTestDatabase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}

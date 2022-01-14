package com.sk.projekat2.reservationservice.client.mailservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

@Configuration
public class MailServiceClientConfiguration {
	
	@Bean
	public RestTemplate mailServiceRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.setUriTemplateHandler(new DefaultUriBuilderFactory("http://localhost:8081/api"));
        return restTemplate;
	}

}

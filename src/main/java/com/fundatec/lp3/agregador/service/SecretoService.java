package com.fundatec.lp3.agregador.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fundatec.lp3.agregador.domain.Secreto;


@Service
public class SecretoService {


	
	
	public Secreto getSecreto() {
	RestTemplate restTemplate = new RestTemplate();
	String url = "https://lp3-secret.herokuapp.com/secreto";
	HttpHeaders headers = new HttpHeaders();
	headers.add("Authorization", "Basic bHVjYXM6NDglJG5zbGQ2Jjg0");
	headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
			+ "(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	HttpEntity<String> entity = new HttpEntity<>(headers);
	ResponseEntity<Secreto> secreto = restTemplate.exchange(url, HttpMethod.POST, entity, Secreto.class);
	return secreto.getBody();
	}

}

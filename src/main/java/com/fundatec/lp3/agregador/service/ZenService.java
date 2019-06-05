package com.fundatec.lp3.agregador.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.fundatec.lp3.agregador.domain.Zen;

@Service
public class ZenService {
	ObjectMapper mapper = new ObjectMapper();


	public Zen getZen() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.github.com/zen";
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		String fraseZen = response.getBody();
		Zen zen = new Zen();
		zen.setFrase(fraseZen);
		return zen;
	}

}

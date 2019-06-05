package com.fundatec.lp3.agregador.service;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fundatec.lp3.agregador.domain.Tempo;

@Service
public class TempoService {
	
	
	public Tempo getTempo() {
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/3477/current?token=114c2fb82134eb247ae8aa4e99911a41";
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36"
				+ "(KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<>(headers);
		ResponseEntity<Tempo> tempo = restTemplate.exchange(url, HttpMethod.GET, entity, Tempo.class);
		return tempo.getBody();
	}
	
}

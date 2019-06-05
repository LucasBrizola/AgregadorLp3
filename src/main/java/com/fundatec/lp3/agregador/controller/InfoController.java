package com.fundatec.lp3.agregador.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.fundatec.lp3.agregador.domain.Info;
import com.fundatec.lp3.agregador.domain.Secreto;
import com.fundatec.lp3.agregador.domain.Tempo;
import com.fundatec.lp3.agregador.domain.Zen;
import com.fundatec.lp3.agregador.service.SecretoService;
import com.fundatec.lp3.agregador.service.TempoService;
import com.fundatec.lp3.agregador.service.ZenService;


@RestController
@RequestMapping("/info")
public class InfoController {
	
	@Autowired
	TempoService tempoService;
	
	@Autowired
	ZenService zenService;
	
	@Autowired
	SecretoService secretoService;
	
	@PostMapping
	public ResponseEntity<Info> buscaInfo(){
		Tempo tempo = tempoService.getTempo();
		Zen zen = zenService.getZen();
		Secreto secreto = secretoService.getSecreto();
		
		Info info = new Info();
		info.setTempo(tempo);
		info.setZen(zen);
		info.setSecreto(secreto);
		
		return new ResponseEntity<Info>(info, HttpStatus.OK);
	}
}
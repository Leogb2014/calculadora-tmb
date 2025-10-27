package com.leonardo.calculadoratmb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.calculadoratmb.model.DadosUsuario;
import com.leonardo.calculadoratmb.service.CalculoService;

@RestController
@RequestMapping("/calculos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CalculoController {
	
	@Autowired
	private CalculoService calculoService;
	
	@PostMapping
	public ResponseEntity<DadosUsuario> calcular(@RequestBody DadosUsuario calculo) {	
		return ResponseEntity.ok().body(calculoService.calcular(calculo)) ;
	}	

}

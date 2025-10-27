package com.leonardo.calculadoratmb.service;

import com.leonardo.calculadoratmb.model.DadosUsuario;

public class CalculoService {
	
public DadosUsuario calcular(DadosUsuario dados) {
		
		double soma = 0;
		
		if(dados.getGenero().equalsIgnoreCase("f")) {
			soma += dados.getPeso() * 9.6;
			soma += dados.getAltura() * 1.8;
			soma += 665;
			soma -= dados.getIdade() * 4.7;
		    
		}
		if(dados.getGenero().equalsIgnoreCase("m")) {
			soma += dados.getPeso() * 13.7;
			soma += dados.getAltura() * 5.0;
			soma += 66;
			soma -= dados.getIdade() * 6.8;
		    
		}
		
		dados.setCalorias(soma);
		
		return dados;	        
	
	}


}

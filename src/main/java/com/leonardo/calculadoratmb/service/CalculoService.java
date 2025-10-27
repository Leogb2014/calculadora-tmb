package com.leonardo.calculadoratmb.service;

import org.springframework.stereotype.Service;

import com.leonardo.calculadoratmb.model.DadosUsuario;

@Service
public class CalculoService {
	
public DadosUsuario calcular(DadosUsuario dados) {
		
		double soma = 0;
		double ativi = 0;
		
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
						
		if(dados.getAtividade() == 0) {
			ativi = 1.2; 
		}if(dados.getAtividade() >= 1 && dados.getAtividade() <= 3) {
			ativi = 1.375;
		}if(dados.getAtividade() >= 3 && dados.getAtividade() <= 5) {
			ativi = 1.55;
		}if(dados.getAtividade() == 6 && dados.getAtividade() <= 7) {
			ativi = 1.725;
		}if(dados.getAtividade() > 7) {
			ativi = 1.9;
		}
		
		dados.setCalorias(soma * ativi);
		
		return dados;	        
	
	}


}

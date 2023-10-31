package br.edu.principal;

import br.edu.veiculos.*;

public class Principal {

	public static void main(String[] args) {
		
		Veiculos veiculo = criarVeiculo(args[0]);
		veiculo.buzina();

	}

	public static Veiculos criarVeiculo(String type) {
		
		if(type.equals("jipe")) {
			return new Jipe();
		}
		else if(type.equals("tanque")) {
			return new Tanque();
		}
		else {
			return new SUV();
		}
		
	}

}

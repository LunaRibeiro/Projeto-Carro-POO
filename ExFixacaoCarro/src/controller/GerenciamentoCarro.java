package controller;

import model.Carro;

public class GerenciamentoCarro {

	public static void main(String[] args) {
		
		//objeto
		Carro c1 = new Carro("VW", "Gol", 2010, false, 0);	//false = desligado   true = ligado
		Carro c2 = new Carro("BMW", "x", 2022);
		Carro c3 = new Carro("PEUGEOT", "207", 2019);
		
	/*	String resposta = c1.situacaoMotor(); //se quiser guardar esse valor
		System.out.println(resposta);	*/
		
		//situa��o obj 1
		System.out.println(c1.situacaoMotor()); //para s� mostrar a resposta
		System.out.println(c1.ligarMotor());
		System.out.println(c1.acelerar(60));
		System.out.println(c1.frear(70));
		System.out.println(c1.desligarMotor());
		
		System.out.println("\n\n");
		
		//situa��o obj 2
		System.out.println(c2.situacaoMotor()); //para s� mostrar a resposta
		System.out.println(c2.ligarMotor());
		System.out.println(c2.acelerar(60));
		System.out.println(c2.frear(60));
		System.out.println(c2.desligarMotor());
		
		System.out.println("\n\n");
		
		//situa��o obj 3
		System.out.println(c3.situacaoMotor()); //para s� mostrar a resposta
		System.out.println(c3.ligarMotor());
		System.out.println(c3.acelerar(60));
		System.out.println(c3.frear(30));
		System.out.println(c3.desligarMotor());
	}

}

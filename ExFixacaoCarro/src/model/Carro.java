package model;

import java.util.Scanner;

public class Carro {
	
	//atributos
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	//m?todo construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}
	
	//segundo m?todo construtor (personalizado)
	public Carro(String fabricante, String modelo, int ano) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false; //atribui false ao motorLigado
		this.velocidade = 0;//atribui 0 a Velocidade
	}

	//m?todo detalhes
	public void detalhes() {
		System.out.println("\n\n---------------------------------\n\n");
		System.out.println("Fabricante: "+this.fabricante+"\nModelo: "+this.modelo+"\nAno: "+this.ano);
	}
	
	//m?todo situacaoMotor
	public String situacaoMotor() {
		
		if(this.motorLigado) {
			return this.modelo+" ---> O motor est? ligado!";
		}
		return this.modelo+" ---> O motor est? desligado!";
	}
	
	//m?todo ligarMotor
	public String ligarMotor() {
		
		if(this.motorLigado) { //puxou o status do motor
			return "O motor do "+this.modelo+" j? estava ligado";
		}else {
			this.motorLigado = true; //mudou o status --> ligando o motor
			return "O motor do "+this.modelo+" foi ligado agora";
		}
	}
	
	//m?todo desligarMotor
	public String desligarMotor() {
		
		//verifica se o motor est? desligado (false)
		if(!this.motorLigado) {
			return "O motor do "+this.modelo+" foi desligado agora";
		}
		
		//verifica se o motor est? ligado (true)
		if(this.velocidade == 0) {
			//desliga motor
			this.motorLigado = false;
			return "O motor do "+this.modelo+" j? estava ligado.";
		}
		
		//Quando o carro est? Ligado e com velocidade diferente de zero	
		return "ATEN??O: O motor do "+this.modelo+" n?o foi desligado pois o carro est? em movimento";
	}
	
	//m?todo acelerar
	public String acelerar(int valor) {
		
		if(this.motorLigado) {
			this.velocidade += valor;	//aumenta a velocidade do carro de acordo com o valor recebido
			return this.modelo+" ACELEROU!!!\nA velocidade atual ?: "+this.velocidade+" KM/H";
		}
		return this.modelo+" ATEN??O: N?o ? possivel acelerar com o motor desligado!";
	}
	
	//m?todo frear
	public String frear(int valor) {
		
		//verifica se o motor est? desligado
		if(!this.motorLigado) {
			return this.modelo+" Aten??o: O motor est? desligado! O carro j? est? parado.";
		}
		
		//verifica se a velocidade ? igual a zero
		if(this.velocidade == 0) {
			return this.modelo+" Aten??o: O carro j? est? parado.";
		}
		
		//verifica se o motor est? ligado e com a velocidade diferente de zero
		if(this.motorLigado && this.velocidade != 0) {
			
			//diminui a velocidade
			this.velocidade -= valor;
			
				//verifica se o valor atribuido ? menor ou igual a zero
				if(this.velocidade <= 0) {
					this.velocidade = 0; //muda a velocidade para zero.
					return "FREOU!!! O carro est? PARADO";
				}else {
					return "FREOU!!! A velocidade atual ? "+this.velocidade+" Km/h";
				}
		}
		
		return "";
	}

	//Getters and Setters
	public String getFabricante() {
		return fabricante;
	}

	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public boolean isMotorLigado() {
		return motorLigado;
	}


	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}


	public int getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}

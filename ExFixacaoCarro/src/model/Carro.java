package model;

import java.util.Scanner;

public class Carro {
	
	//atributos
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	//método construtor completo
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}
	
	//segundo método construtor (personalizado)
	public Carro(String fabricante, String modelo, int ano) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false; //atribui false ao motorLigado
		this.velocidade = 0;//atribui 0 a Velocidade
	}

	//método detalhes
	public void detalhes() {
		System.out.println("\n\n---------------------------------\n\n");
		System.out.println("Fabricante: "+this.fabricante+"\nModelo: "+this.modelo+"\nAno: "+this.ano);
	}
	
	//método situacaoMotor
	public String situacaoMotor() {
		
		if(this.motorLigado) {
			return this.modelo+" ---> O motor está ligado!";
		}
		return this.modelo+" ---> O motor está desligado!";
	}
	
	//método ligarMotor
	public String ligarMotor() {
		
		if(this.motorLigado) { //puxou o status do motor
			return "O motor do "+this.modelo+" já estava ligado";
		}else {
			this.motorLigado = true; //mudou o status --> ligando o motor
			return "O motor do "+this.modelo+" foi ligado agora";
		}
	}
	
	//método desligarMotor
	public String desligarMotor() {
		
		//verifica se o motor está desligado (false)
		if(!this.motorLigado) {
			return "O motor do "+this.modelo+" foi desligado agora";
		}
		
		//verifica se o motor está ligado (true)
		if(this.velocidade == 0) {
			//desliga motor
			this.motorLigado = false;
			return "O motor do "+this.modelo+" já estava ligado.";
		}
		
		//Quando o carro está Ligado e com velocidade diferente de zero	
		return "ATENÇÃO: O motor do "+this.modelo+" não foi desligado pois o carro está em movimento";
	}
	
	//método acelerar
	public String acelerar(int valor) {
		
		if(this.motorLigado) {
			this.velocidade += valor;	//aumenta a velocidade do carro de acordo com o valor recebido
			return this.modelo+" ACELEROU!!!\nA velocidade atual é: "+this.velocidade+" KM/H";
		}
		return this.modelo+" ATENÇÃO: Não é possivel acelerar com o motor desligado!";
	}
	
	//método frear
	public String frear(int valor) {
		
		//verifica se o motor está desligado
		if(!this.motorLigado) {
			return this.modelo+" Atenção: O motor está desligado! O carro já está parado.";
		}
		
		//verifica se a velocidade é igual a zero
		if(this.velocidade == 0) {
			return this.modelo+" Atenção: O carro já está parado.";
		}
		
		//verifica se o motor está ligado e com a velocidade diferente de zero
		if(this.motorLigado && this.velocidade != 0) {
			
			//diminui a velocidade
			this.velocidade -= valor;
			
				//verifica se o valor atribuido é menor ou igual a zero
				if(this.velocidade <= 0) {
					this.velocidade = 0; //muda a velocidade para zero.
					return "FREOU!!! O carro está PARADO";
				}else {
					return "FREOU!!! A velocidade atual é "+this.velocidade+" Km/h";
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

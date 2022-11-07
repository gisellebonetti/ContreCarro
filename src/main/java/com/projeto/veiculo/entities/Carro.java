package com.projeto.veiculo.entities;

public class Carro {
	public static void main(String[] args) {

		ControleCarro c1 = new ControleCarro();
		
		c1.ligar();
		c1.pintar("azul");
		c1.acelerar();
		c1.abastecer(50);
		c1.frear();

	}
}



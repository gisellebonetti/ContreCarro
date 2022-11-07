package com.projeto.veiculo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ControleCarro {

	String Marca;
	String Modelo;
	String Placa;
	String Cor;
	float Km;
	boolean isLigado;
	int litrosCombustivel;
	int Velocidade;
	double Preco;

	public ControleCarro() {
		this.isLigado = false;
		this.Velocidade = 0;
		this.litrosCombustivel = 0;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}

	public void pintar(String corNova) {
		this.setCor(corNova);
		System.out.println("O carro agora é" + getCor());
	}

	public void ligar() {
		if (this.isLigado()) {
			System.out.println("O carro já está ligado");
		} else {
			this.setLigado(true);
			System.out.println("O carro está ligado");
		}
	}

	public void acelerar() {
		if (this.isLigado()) {
			setVelocidade(getVelocidade() + 20);
			setLitrosCombustivel(getLitrosCombustivel() - 1);
			System.out.println("A velocidade do carro é de " + this.getVelocidade() + "km/h e ele tem "
					+ this.getLitrosCombustivel() + " litros de combustível");
		} else {
			System.out.println("Não é possível acelerar com o carro desligado.");
		}
	}

	public void abastecer(int qtdLitros) {
		if (qtdLitros > 100) {
			System.out.println("O tanque só recebe 100 litros");
		} else {
			setLitrosCombustivel(getLitrosCombustivel() + qtdLitros);
			System.out.println("O carro está com " + this.getLitrosCombustivel() + " litros de combustível");
		}
	}
	
	public void frear () {
		if (this.isLigado && this.getVelocidade() > 0) {
		this.setKm(getKm() - 10);
        System.out.println("O carro foi freado");
	} else {
        System.out.println("Não é possível frear com o carro desligado ou parado.");
    }
}
}

package br.edu.veiculos;

public class Veiculos {
	protected String marca;
	protected double capTanqueComb;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCapTanqueComb() {
		return capTanqueComb;
	}
	public void setCapTanqueComb(double capTanqueComb) {
		this.capTanqueComb = capTanqueComb;
	}
	
	public void acelerar() {
		
	}
	public void frear() {
		
	}
	public void buzina() {
		System.out.println("Bi Biiiiiii");
	}
	
	
}

package model;

public class Quadrado extends Figura{
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado * lado;
	
	}
	
}

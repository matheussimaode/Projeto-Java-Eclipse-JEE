package model;

public class Circulo extends Figura{
	private double raio;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double pi = 3.1415;
		return pi * raio * raio;
	}
	
}

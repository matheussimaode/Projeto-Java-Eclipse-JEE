package view;

import model.Circulo;
import model.Quadrado;

public class Execucao {
	public static void main(String args[]){
		Quadrado quad = new Quadrado();
		Circulo circ = new Circulo();
		
		quad.setLado(10);
		System.out.println(quad.area());
	}
}

package com.generation;

public class Triangulo extends FiguraGeometrica {

	public Triangulo() {
		super("Triangulo");
	}
	
	
	
	//Metodo
	//Aplicando polimosfismo 
	@Override
	public float calcularArea() {
		return (getAlto() * getLargo()) / 2;
		
	}



	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	//	ancho + 2*(raiz(alto^2 + (ancho/2)^2))

}

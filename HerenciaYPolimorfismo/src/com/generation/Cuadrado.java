package com.generation;

//cuadrado es la clase hija
public class Cuadrado extends FiguraGeometrica {
	
	
	public Cuadrado() {
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		
		return  getAlto() * getLargo();
	}

	@Override
	public float perimetro() {

		return (getAlto() + getLargo()) * 2;
	}
}

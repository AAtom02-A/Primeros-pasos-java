package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//Constructor
	public Gato(String nombre, int patas, boolean adoptado) {
		
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	
	
	//getters y setters
	public  String getNombre() {
		return this.nombre;
	}
	


	public void  setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		if (patas >=0 && patas <=4) {
			this.patas = patas;
		} else {
			throw new IllegalArgumentException("El numero de patas no es valido");//con throw 
			//podemos crear excepciones personalizadas
		}
	
	}
	
	public boolean isAdoptado() {//En los casos de boolean cambie el nombre
								 //Porque se hace como una pregunta.
		return this.adoptado;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado; 
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}


	
}

package com.generation;

//clase padre
public abstract  class FiguraGeometrica {
	
	//Clases abstractas
	//Son clases que pueden contener o no metodos abstractos
	//No podemos crear objetos de la clase abstracta. Debido a que no se pueden crear objetos. 
	//Método abstracto; es un método que te dice que hacer pero no
	//te dice como hacerlo.
	
	protected String nombre;
	protected float alto;
	protected float largo;
	
	
	
	//constructor
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
		
	}
	//metodos
	public abstract float calcularArea();
	
	public abstract float perimetro();
	
	//getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
}

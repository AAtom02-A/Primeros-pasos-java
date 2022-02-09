package com.generation;

public class Tacos {
	
	//Atributos
	//Se define atributos con sus respectivos tipos de datos
	 private String tipoDeTortilla;
	 private String tipoDeGuisado;
	 private int numeroDeTortilla;
	 private String tamanioDeTortilla;
	 private float precio = 0.0f;
	
	
	//El constructor nos ayuda a inicializar valores
	public Tacos() {
	}
	
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	
	public Tacos(String tipoDeTortilla, String tipoDeGuisado,
			int numeroDeTortilla, String tamanioDeTortilla,
			float precio) {
		
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	//Metodos
	//Acciones
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}
	//getters and setters

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if (numeroDeTortilla >=0 && numeroDeTortilla <=3) {
			this.numeroDeTortilla = numeroDeTortilla;	
		}else {
			throw  new IllegalArgumentException("Numero de tortillas invalido, \n"
					+ " no seas atascado!");
		}
		
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	void veder() {
		System.out.println("Taco vendido");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa");
	}
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}
	

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamañoDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
}

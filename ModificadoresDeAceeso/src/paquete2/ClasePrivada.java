package paquete2;

public class ClasePrivada {
	//Atributos provadors
	
	 private String nombre;
	private int edad;
	
	//metodo
	public void setSaludar(String nombre){//fijar o modificar un valor
		this.nombre = nombre;
	}
	
	public String getSaludar(){
		return this.nombre;
	}
	
}


package com.generation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Programando POO
		
		Scanner teclado = new Scanner (System.in);
		Tacos taco1 = new Tacos("Maza azul","Suadero",2,"grande",30);//Forma de crear un objeto
		
		//Se definen los atributos del objeto.
		//Los objetos son intependientes, cada objeto es independiete de los demas
		//objetos
		/*
		 * taco1.tipoDeTortilla = "Masa Azul"; taco1.tipoDeGuisado = "Suadero";
		 * taco1.numeroDeTortilla = 2; taco1.tamanioDeTortilla = "mediana"; taco1.precio
		 * = 30; taco1.subirPrecio(5.5f);
		 */

		//Se imprime taco1
		//System.out.println(taco1.toString());
		
		//Creacion de otro taco
		
		
		/*
		 * Tacos taco2 = new Tacos(); taco2.tipoDeTortilla = "Harina";
		 * taco2.tipoDeGuisado = "Bisteck"; taco2.numeroDeTortilla = 1;
		 * taco2.tamanioDeTortilla = "Grande"; taco2.precio = 42.6f;
		 * taco2.tipoDeTortilla = "Trigo";
		 */
		 
		
		//Se imprime taco2
		//System.out.println(taco2.toString());
		  
		  
		  Tacos taco3 = new Tacos();
		  taco3.setTipoDeTortilla("Masa azulada");
		  taco3.setTipoDeGuisado("Carnitas de pollo");
		  taco3.setTamanioDeTortilla("Mediana");
		  taco3.setNumeroDeTortilla(5);
		  taco3.setPrecio(45);
		  
		  System.out.println(taco1);//Se llama el método tuString por default
		 // System.out.println(taco2);
		  System.out.println(taco3.getTipoDeTortilla());
		  System.out.println(taco3.getTipoDeGuisado());
		  System.out.println(taco3.getTamanioDeTortilla());
		  System.out.println(taco3.getNumeroDeTortilla());
		  System.out.println(taco3.getPrecio());
	
	}

}

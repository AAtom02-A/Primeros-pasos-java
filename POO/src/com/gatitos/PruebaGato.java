package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato("Pirs",3,true);
		//g.nombre = "misifus";
		//g.patas = 4;
		
//		g.setNombre("Taco");
//		g.setPatas(2);
//		g.setAdoptado(false);
		
		System.out.println(g);
		System.out.println(g.getNombre());
		System.out.println(g.getPatas());
		System.out.println(g.isAdoptado());
		
		//excepciones
		//int num1 = 5, num2 = 0;
		//int resultado = num1 / num2;//Error de tiempo de ejecución. 
	}
		
		
}

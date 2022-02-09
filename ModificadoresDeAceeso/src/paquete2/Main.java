package paquete2;
import paquete1.*;
public class Main extends paquete1.ClaseProtected {

	public static void main(String[] args) {
		/*
		 * ClaseDefault prueba = new ClaseDefault(); prueba.mostrar();
		 * System.out.println(prueba);
		 */

		ClasePrivada privada = new ClasePrivada();
		//privada.edad = 30;
		//privada.nombre = "Angel";
		privada.setSaludar("Angel");
		
		System.out.println(privada.getSaludar());
		
		//objeto de la clase Main
		Main protegido = new Main();//objeto creado
		protegido.setEdad(18);
		System.out.println(protegido.getEdad());
		
	}

}

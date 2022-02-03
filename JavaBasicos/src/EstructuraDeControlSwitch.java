import java.util.Scanner;

public class EstructuraDeControlSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Estructuras de control nos sirven para controlar el flujo de comportamiento de un programa
		//Mediante desiciones.
		
		
		/*
		 * switch(Condicion a evaluar){
		 * case "valor":
		 * 			//Codigo a ejecutar
		 * 			//break;
		 * case "valor":
		 * 			//Codigo a ejecutar
		 * 			//break;
		 *  default:
		 *   //codigo a ejecutar
		 * }
		 * */
		
		//Solicitar al usuario un dia de la semana y mostrar un 
		//mensaje.
		System.out.println("Introduce un dia de la semana y recibe tu regalo");
		Scanner teclado = new Scanner (System.in);
		String dia = teclado.nextLine();
		
		
		switch (dia.toLowerCase() ) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe");
			break;
		case "martes":
			System.out.println("Martes, regresando señal");
			break;
		
		  case "miercoles": System.out.println("Miercoles pero a que costo"); break;
		 
		case "jueves":
			System.out.println("juebebes");
			break;
		case "viernes":
			System.out.println("Viernes social");
			break;
		case "sabado":
			System.out.println("Sabado de loquera");
			break;
		case "domingo":
			System.out.println("Domingo el agua de garrafon sabe buena");
			break;
			default:
				System.out.println("No es un dia de la semana");
		}
		
		
	}

}

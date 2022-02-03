import java.util.Scanner;

public class DeletreaNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa que pida al usuario ingresar su nombre 
		y que entonces imprima cada una de las letras de su nombre.
		
		Como pista pueden investigar cómo se usan los siguientes métodos de String:
					length()
					charAt(i)


					Ejemplo: "Juan"
					"J"
					"u"
					"a"
					"n"*/

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escribe tu nombre: ");
		String nom = teclado.nextLine();
		int length = nom.length();
		
		System.out.println("Longitud de una cadena es:" + length);
		
		for (int i = 0; i < length; i++) {
			System.out.println("letra: " + nom.charAt(i));
		}
		
		
		
		
	}
	

}

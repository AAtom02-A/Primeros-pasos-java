import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */
		
		float n1 =0f, n2 =0f;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce el numero 1:");
		n1 = teclado.nextInt();
		
		System.out.print("Introduce el numero 2:");
		n2 = teclado.nextInt();
		
		System.out.print("Introduce la opion de la calculadora:\n");
		String menu = teclado.next();
		
		switch (menu) {
		
		case "suma":
			System.out.println("La suma es:" + (n1 + n2));
			break;
		case "resta":
				System.out.println("La resta es:" + (n1 - n2));
				break;
		case "division":
				System.out.println("La division es:" + (n1 / n2));
				break;
		case "multiplicacion":
				System.out.println("La multiplicacion es:" + (n1 * n2));
				break;
				
				default:
					System.out.print("Opcion invalida");
		}
	}

}

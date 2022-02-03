import java.util.Scanner;

public class ScannerYBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int numero1 = sc.nextInt();
		sc.nextLine();//Se limpia el buffer
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();//next detiene la lectura hasta que encuentra un espacio
		
		sc.close();
		
		System.out.println("Tu nombre es:" + nombre  + " \n Numero :" + numero1);
		
		/*
		System.out.print("Introduce otro numero");
		int numero2 = sc.nextInt();
		
		System.out.println("Numero 1:" + numero1 + "Numero 2:" + numero2);
		*/
	}

}

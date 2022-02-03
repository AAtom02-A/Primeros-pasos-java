			import java.util.Scanner;
public class Tabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Utilizando un bucle while

			1.- Crea una nueva clase llamada Tabla
			2.- Copia el siguiente codigo y verifica que funcione
		3.- Debe imprimir la tabla de multiplicar del número en cuestión 
		 * (solo los primeros 10 números)
		 */
				
				        Scanner console = new Scanner(System.in);
				        int num,resultado, control = 0;
				        
				        System.out.print("Ingresa cualquier número positivo: ");
				        num = console.nextInt();
				                
				        System.out.println("Tabla de multiplicar de  " + num);
				        
				       //Implementa un bucle while que imprima el resultado
				        
				        while (control <=10 ) {
				        	resultado = num * control;
							System.out.print(" \n" + num + " x "+ control + "  = " + resultado );
							control++;
						}

	}

}

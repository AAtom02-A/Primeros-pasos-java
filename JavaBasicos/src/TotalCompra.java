import java.util.Scanner;

public class TotalCompra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// solicitar el total de una compra por consola.
		// si la cuenta es de menos de 1000
				// sila cuenta es de 1000 - 4999 10%
				// si la cuenta es de 5000 a 9999 20%
				// si la copra es de 10000 o más 30%


		
		int compra;
		double descuento;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce la cantidad de tu compra:\n");
		compra = teclado.nextInt();
		
		if(compra < 1000) {
		System.out.print("No se aplica descuento");
			}if (compra >=1000 && compra <= 4999) {
			 descuento = compra * (double) .10;
			 System.out.println("El descuento de la compra es: "+ descuento);
			}if (compra >=5000 && compra <= 9999) {
			descuento = compra *  (double) .20;
			 System.out.println("El descuento de la compra es: "+ descuento);
			}if (compra > 10000) {
				descuento = compra *  (double) .30;
				 System.out.println("El descuento de la compra es: "+ descuento);
			}

	
	
	}
}

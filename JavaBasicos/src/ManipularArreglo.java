
public class ManipularArreglo {

	public static void main(String[] args) {
		/*
		 Crea una clase llamara ManipularArreglo
         crea un array con los siguientes números enteros:

          1, 6, 45, 53, 80, 102, 145, 326, 450, 892
         Crea un programa que use un ciclo que tome los números de arreglo
         y devuelva la suma total, la suma de los números pares y la suma 
         de los números impares.

		 * */
		int []numeros = new int [] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int suma = 0, par = 0, impar = 0;
		for (int i = 0; i < numeros.length; i++) {
			 suma =  suma + numeros[i];
			 if (numeros[i] %2 == 0 ) {
				 par = par + numeros[i];
				System.out.println("Numero par" + numeros[i]);
			}else {
				impar = impar + numeros[i];
				System.out.println("Numero impar" + numeros[i]);
			}
			
		}
		System.out.println("La suma total es: " + suma);
		System.out.println("La suma de los numeros pares  es: " +par);
		System.out.println("La suma de los numeros imapres es: " + impar);
	}

}


public class Arreglos {

	public static void main(String[] args) {
		
		//Solo un tipo de dato
		//Espesificar el tamaño o la cantidad de elementos que va a contener
		
		//Formas de crear arreglos
		
		//1
		int numeros[];//se crea variable 
		numeros = new int [4];//creando arreglo
		
		//2
		String[] nombres = new String[4];
		
		//3 array literal
		String []nombreFrutas = new String [] {"Manzana","Platano","Uva","Pera"};
		
		//incertar datos en el arreglo
		
		numeros[0] = 10;
		numeros[1] = 8;
		numeros[2] = 101;
		numeros[3] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felix";
		System.out.println(numeros[0]);//Se muesstra un solo elemento del arrelgo
		
		//mostrar todos los elmentos del arreglo
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			System.out.println(nombres[i]);
			System.out.println(nombreFrutas[i]);
			System.out.println("-------------");
		}
		
		
	}

}

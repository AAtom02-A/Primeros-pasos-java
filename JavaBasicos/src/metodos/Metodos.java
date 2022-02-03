package metodos;

public class Metodos {


	//Un metodo es una funcion
	//Atributos de la clase
		int a, b;
		
		//Metodo void  = vacio
		public void sumar(){
			int resultado = a +b ;
			System.out.println("El resultado de: " + a +  " y " + b + "  es: " + resultado);
		}
		
		//Metodo con retorno de valor
				public int sumaConRetorno() {
					// int resultado = a + b;
					return a+b; 
				}
				
		//argumentos
		// suma(argumentos) son los valores dentro de los parentis
		public double multiplicarConArgumentos(int arg1, double arg2) {
			int c = arg1;
			double d = arg2;
			return c*d;
		}
		
		//Metodo estatic
		//estatico, void(no regresa datos), 
		public static void imprimirNombre(String nombre) {
			System.out.println("mi nombre es:" + nombre);
		}

}

package operadores;

public class Operadores {
	
	public static void main (String[]args) {
		
		//Operadors Aritméticos
		// +, -, /, *, %
		
		int a = 10;
		int b = 20;
		double d = 10.0;
		int c= a + b;
		
		System.out.println(c);
		
		String str1 = "El resultado de la suma es:";
		System.out.println(str1 + c);
		
		System.out.println("El resultado de la resta es :"+ (a+b));
		
		//division
		//En este caso la division si se hace pero no regresa los decimales
		// Para esto es necesario hacer un casteo. Ver sig ejemplo.
		int division = a / b;
		System.out.println("El resultado de la division es :" + division);
		//Ejemplo de casteo
		// por lo menos uno de los datos debe de ser de tipo double para que nos
		//represente los decimales correctos.
		//10.0 / 20 = 0.5
		double division2 = (double) a/b;
		System.out.println("El resultado de la division es :" + division2);
		
		//multiplicacion
		double multiplicacion = d * a;
		System.out.print("El resultado es : " + multiplicacion);
		
		//modulo
		double modulo = a %d;
		System.out.println("El modulo de la operacion es:" + modulo);
		
		/*
		 * Operador de asignación
		 * =
		 * */
		
		//Inicializar variables
		int l= 5, e ;//Inicializar variables
		e =6;
		System.out.println(l+""+ e);
		
		//Operadores de declaracion compuesta
		//+=,-=,*=,/=,%=
		//Una operacion simplificada
		
		int f,g;
		f = 0;
		g = 5;
		
		f += 5;
		System.out.println(f);
		
		//Operadores relacionales
		//<,>,<=,>=
		//==  igualda
		//!= diferencia
		// resultado de un valor de tipo boolean
		
		int h= 15, i = 25;
		String j = "hola";
		
		System.out.println(h>i);//false
		System.out.println(i!=h);
		//stem.out.println(h  !=  j);//Son valores distintos y no se pueden comparar.
		
		//Operador unario
		/*++,--
		 * Preasignacion ++k se le asigna un valor antes de usarse
		 * Postasignacion k++ primero lee el valor y despues le suma uno 
		 * 
		 * */
		
		int k, m;
		k = 0;
		m=0;
		System.out.println(++k);
		System.out.println(--m);
		
		//Presedencia de operadores o jerarquia de los operadores
		/*
		 * 
		 * */
		
		int operacion = 4 +5 * 6 / 3;//14
		//5*6 = 30
		//30 / 3 = 10
		// 4 + 10 =  14
		
		System.out.println(operacion);
		
		int x, y ;
		x = 0;
		y = 0;
		int operacion2 = ++x  +  y--;
		System.out.println(operacion2);//1
		
		//operador ternario
		
		int edad = 18, valor1= 0, valor2 =1;
		
		int resultado =  ((edad <= 18) ? valor1: valor2);

	//trinf resultado = ((edad <= 18 ) ? "uno" : "dos";
		System.out.println(resultado);
		
		
		//operadores logicos
		// and - &&
		// or - ||
		//not - !
		 System.out.println(true && true); //true
		 System.out.println(true && false);//false
		 System.out.println(true || false);//true
		 System.out.println(true && ! false);//true

		
		
		
		
		
		
		
		
	}
}

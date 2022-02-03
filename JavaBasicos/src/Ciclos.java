

public class Ciclos {

	public static void main(String[] args) {

//		Estructuras de ciclos en java
//		while
//		do-while
//		for
		
		//while
//		int control = 0;
//		
//		while (control < 10) {
//			System.out.println("Control = " + control);
//			control++;
//		}
		//do-while
		//permite ejecutar una ves el codigo 
		
//		int control = 0;
//		do {
//			//codigo a ejecutar
//			System.out.println("Control = " + control);
//			//modificador de la variable control
//			control++;
//			
//		} while (control < 3);
		
		//
//		for (int i = 0; i < 3; i++) {
//			System.out.println("Control = " + i);
//		}
		
		//break y continue
		/*
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {  //solo se ejecuta cuando el valor de i sea numero par
				System.out.println("Control = " + i);
				break;// termina el ciclo
				//solo deja que se ejecute una vez lo que esta antes
			}
			System.out.println("Control = " + i);
		}*/
		//continue
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {  //solo se ejecuta cuando el valor de i sea numero par
			continue;//Permite saltarnos una ejecucion del ciclo
			//Deja que continue el ciclo 
				
			}
			System.out.println("Control = " + i);
		}
		
	/*	for (int i = 0; i < 3; i++) {
			System.out.println("Control2 = " + i);
			continue;
		}*/
	}
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Set;
import java.util.TreeMap;

public class Colecciones {
	public static void main(String[] args) {
		//Las colecciones sirven para almacenar un conjunto
		// de objetos. 
		//La diferencia de las colecciones y objetos
		//Las colecciones son dinamicas, pueden cambiar 
		// el numero de objetos agregados. 
		
		//Orden de velocidad 
		//1.HashSet
		//2.LinkedHashSet
		//3.TreeSet

		
		// coleccion Set tiene 3 implementaciones
		//No pueden contener elemnetos repetidos
	
		
		// tipos implementaciones
		//HashSet
		//Los elementos no mantienen un orden.
		//Es la implemetacion mas rapida
		/*Set<String> frutas =new  HashSet<String>(); 
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");*/
		
		//Forech, puede recorrer una coleccion y en cada recorrido recupera el calor y lo podemos
		// almacenar en una variable
		//Sintaxis
		//for()TipodeDatoElemento variable : VariableARecorrer
		/*for (String fruta : frutas) {
			System.out.println(fruta);
			
		}*/
		
		//System.out.println("La coleccion de frutas es:"  + frutas);
		
		//TreeeSet
		//Esta implementcion ordena los elementos en funcion de sus valores
		//Pero es la implementacion mas lenta.
		
		/*Set<String> frutas =new  TreeSet<String>(); 
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}*/
		//LinkedHashSet
		//Ordena los elementos en orden de inserción
		//Y es mas costoso que HashSet.
		
		/*Set<String> frutas =new  LinkedHashSet<String>(); 
		frutas.add("mango");
		frutas.add("granda");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
			
		}*/
		
		
		//Listas
		//Caracteristicas:
		//Se permiten elementos duplicados
		//Acceder a elementos espesificios 
		//Buscar elementos
		
		
		//Tienen dos implementaciones:
		// ArrayListd
		//LinkedLinst
		
		// ArrayListd
		//Se respeta el orden de inserción
		//cuenta con una serie de metos que facilitan el manejo de las colecciones
		/*List<String> pokemones = new ArrayList<String>();
		pokemones.add("chicorita");
		pokemones.add("Eevee");
		pokemones.add("patamon");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
	
		pokemones.add(2, "Pikachu");
		
		//remove elimina el elemento de la posicion especificada
		pokemones.remove(5);
		
		//set reemplaza el elemento de la posicion espefificada
		pokemones.set(0,"Chikoritas");
		
		//add si agregamos un indice y un elemento, posiciona el elemento en el indice y el 
		
		for (String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		System.out.println("********************************");
		//Metodo .get() nos regresa el elemento de la posicion que deseemos
		System.out.println(pokemones.get(0));
		
		//indexOf, nos va a devolver la posisicion del elemento
		// y si el elemento no se encuentra nos devolvera un -1
		
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.lastIndexOf("Gengar"));//lastIndexOf busca de atras hacia adelante
		System.out.println(pokemones.indexOf("Togepi"));//Como no esta en la lista marca -1 como error
		
		System.out.println("********************************");
		*/
		//LinkedList
		//Es una lista doblemente enlazada
		//Es mas rapido insertar y remover elementos
		
		/*List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		for (String digimon : digimones) {
			System.out.println(digimon);
		}*/
		
		//map
		//Asocia claves a valores.
		//No puede tener claves duplicadas
		//Solo puede tener un valor asociado
		
		//HashMap
		//Tiene mejor rendimiento, pero no garantiza un orden.
		//A la hora de hacer iteraciones.
		//No acepta claves duplicadas
		
		Map<Integer ,String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Angel Alvarez");
		usuarios.put(2, "Rauel");
		usuarios.put(3, "Rodrigo");
		usuarios.put(4, "Cuñado");
		
		//metodos para obtener informacion
		System.out.println(usuarios.get(1));
		
		//keySet
		//Nos permite recuperar todos los elementos del arreglo de  manera desordenada,
		//ecepto los duplicados
		
		//value
		//Nos permite recuperar el valor directamente
		//de forma de arreglo. 
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		
		
		//TreeMap
		//ordena los valores
		Map<Integer, String> tamales = new TreeMap<Integer,String>();
		tamales.put(5, "Mole rojo");
		tamales.put(9, "Mole verde");
		tamales.put(160, "Gansito");
		tamales.put(1, "Cochinito");
		
		System.out.println("*****************************");	
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		tamales.entrySet().forEach(clave -> {//Funcion lambda
		//	System.out.println(clave.getKey().toString() + clave.getValue().toString());
			System.out.println(clave.getKey());
			System.out.println(clave.getValue());
		});

		//LinkedHashMap
		
		Map<Integer,String> carros = new LinkedHashMap<Integer,String>();
		//Guarda los elementos segun el orden en que se inserten
		carros.put(1, "volvo");
		carros.put(567, "Pointer");
		carros.put(8, "Mustang");
		carros.put(143, "Caribe");
		
		System.out.println("******************");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}
}

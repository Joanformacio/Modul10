package fase1;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;


public class Fase1 {

	public static void main(String[] args) {
		
		/*Tenint una llista de cadenes de noms propis, escriu un mètode que retorne una 
		llista de totes les cadenes que comencen amb la lletra 'a' (mayuscula) i tenen exactament 3 lletres. 
		Imprimeix el resultat.*/
		
		System.out.println("Exercici 1:");
		List <String> names = Arrays.asList("Pau", "Ana", "Marc",
				"Berta", "Arnau", "Ari", "Joan", "Jordi", "Ali",
				"Ona", "Oriol", "Ava", "Josechu");
		System.out.println("ORIGINAL NAMES LIST: " + names);
		List<String> a3Names = names.stream()
				.filter(name -> name.startsWith("A") && name.length() == 3)
				.collect(Collectors.toList());
				System.out.println(a3Names);
		System.out.println("*************************");
		/*
		 * Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers. 
		 * Cada element hauria d'anar precedit per la lletra "e" si el nombre és parell, 
		 * i precedit de la lletra "o" si el nombre és imparell. Per exemple, si la llista d'entrada és (3,44),
		 *  la sortida hauria de ser "o3, e44". Imprimeix el resultat.
		 * 
		 *
		 * */	
		System.out.println("Exercici 2:");
		List<Integer> numbers =Arrays.asList(1,5,6,7,3,8);
		System.out.println(numbers );
		List<String> parList= numbers.stream()
				.filter(n -> n%2==0)
				.map(s -> String.valueOf(s).concat("e"))
                .collect(Collectors.toList());
		
		List<String> imparList= numbers.stream()
				.filter(n -> n%2!=0)
				.map(s -> String.valueOf(s).concat("o"))
                .collect(Collectors.toList());
		parList.addAll(imparList);
		
		System.out.println(parList );
		System.out.println("*************************");
		/*
		 * Tenint una llista de Strings, escriu un mètode que retorne una llista de totes 
		 * les cadenes que continguen la lletra ‘o’ i imprimeix el resultat.
		 * */
		System.out.println("Exercici 3:");
		List<String> lletraOList = names.stream()
				.filter(name -> name.contains("o") )
				.collect(Collectors.toList());
				System.out.println(lletraOList);
		
		System.out.println("*************************");
		
		/*
		 * Has de fer el mateix que en el punt anterior, però retornant una llista que incloga 
		 * els elements amb més de 5 lletres. Imprimeix el resultat.
		 * */
		
		System.out.println("Exercici 4:");
				List<String> lletraOListMajor5 = names.stream()
						.filter(name -> name.contains("o") && name.length()>5 )
						.collect(Collectors.toList());
						System.out.println(lletraOListMajor5);
		System.out.println("*************************");
		
		/*
		 * Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els elements 
		 * de la llista amb una lambda.
		 * */
		System.out.println("Exercici 5:");
				List<String> monthYearList = Arrays.asList("GENER", "FEBRE", "MARÇ", "ABRIL", "MAIG", "JUNY",
							"JULIOL", "AGOST", "SETEMBRE", "OCTUBRE", "NOVEMBRE", "DECEMBRE");
					monthYearList.stream().forEach(n ->System.out.println(n));
		System.out.println("*************************");
		/*
		 * Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant method reference.
		 * 
		 * */
		System.out.println("Exercici 6:");
		procesar((x) -> System.out.println(x), monthYearList);
		System.out.println("*************************");
	}
	
	public static <T> void procesar(Consumer<T> expresion, T elemento) {
		expresion.accept(elemento);
	}
	
	
}

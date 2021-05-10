package backendjava.Modul10.Nivell1;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fase1 {

	final static List<String> noms = Arrays.asList("Aroa", "Adri",
			"Nando", "Adrian", "Sara", "Scott", "aron", "Aron",
			"Anna", "ana", "Aana", "Anaa", "Ana", "ada", "Ada");
	final static List<String> mesosAny = Arrays.asList("Gener",
			"Febrer", "Marc", "Abril", "Maig", "Juny", "Juliol",
			"Agost", "Setembre", "Octubre", "Novembre", "Desembre");

	public static void main(String[] args) {
		// Metode retonra llista de cadenes que comencen amb la lletra a, i
		// tenen exactament 3 lletres
		comencaATresLletres();

		// Metode retorna els impars amb e de prefix, o de prefix als impars
		parImpar();

		// Metode retorna una llista de
		// totes les
		// cadenes que continguen la lletra ‘o’ i imprimeix el resultat.
		conteO();

		// Has de fer el mateix que en el punt anterior, però retornant una llista que
		// inclou els elements amb més de 5 lletres. Imprimeix el resultat.
		conteOCincLletres();

		// Crea una llista amb els nombs dels mesos de l’any. Imprimeix tots els
		// elements de la llista amb una lambda.
		mesosAny();
		// Has de fer la mateixa impressió del punt anterior però fent-ho mitjançant
		// method reference
		mesosAnyMethodReference();
	}

	private static void mesosAnyMethodReference() {
		log("\tMesos any----------(Method Reference)");
		mesosAny.stream().forEach(System.out::println);

	}

	private static void mesosAny() {
		log("\tMesos any----------");
		mesosAny.stream().forEach(name -> System.out.println(name));

	}

	private static void comencaATresLletres() {

		noms.stream().filter(name -> name.startsWith("A"))
				.filter(name -> name.length() == 3)
				.forEach(name -> log(name + " "));
		logLn("");

		List<String> comencaATresLletres = noms.stream()
				.filter(name -> name.startsWith("A"))
				.filter(name -> name.length() == 3).collect(toList());
		System.out.println(comencaATresLletres);
	}

	private static void parImpar() {
		ArrayList<Integer> numberList = new ArrayList<>(
				Arrays.asList(1, 2, 3, 4, 5, 6));

		numberList.forEach(i -> {
			if (i % 2 == 0) {
				log("e" + i + ", ");
			} else {
				log("o" + i + ", ");
			}
		});
		logLn("");

	}

	private static void conteO() {

		noms.stream().filter(name -> name.contains("o"))
				.forEach(name -> log(name + " "));

		logLn("");

		List<String> conteO = noms.stream()
				.filter(name -> name.contains("o")).collect(toList());
		System.out.println(conteO);

	}

	private static void conteOCincLletres() {

		noms.stream().filter(
				name -> name.contains("o") || name.length() > 5)
				.forEach(name -> log(name + " "));
		logLn("");

		List<String> conteOCincLletres = noms.stream().filter(
				name -> name.contains("o") || name.length() > 5)
				.collect(toList());
		System.out.println(conteOCincLletres);

	}

	private static void log(String data) {
		System.out.print(data);

	}

	private static void logLn(String data) {
		System.out.println(data);

	}
}

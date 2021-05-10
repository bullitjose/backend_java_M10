package backendjava.Modul10.Nivell1;

import java.util.function.Supplier;

/*FASE 2
Crea una Functional Interface que continga un mètode abstracte getPiValue (), que retorna
un valor double; en una altra classe, instancie la interfície i assigneu-li mitjançant una 
lambda el valor 3.1415. Invoca el mètode getPiValue de la instància d'interfície i imprimeix
el resultat.*/

/**
 * @author casa
 *
 */
public class Fase2 {
	

	public static void main(String[] args) {
//Fase2
		Supplier<Double> getPivalue = () -> 3.1415;
		System.out.println("El valor de Pi= " + getPivalue.get());

	}

	@FunctionalInterface
	public interface GetPivalue {
		public abstract Double getPivalue();
	}

}

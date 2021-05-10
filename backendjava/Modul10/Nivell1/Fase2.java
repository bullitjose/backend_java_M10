package backendjava.Modul10.Nivell1;

import java.util.function.Supplier;

/*FASE 2
Crea una Functional Interface que continga un m�tode abstracte getPiValue (), que retorna
un valor double; en una altra classe, instancie la interf�cie i assigneu-li mitjan�ant una 
lambda el valor 3.1415. Invoca el m�tode getPiValue de la inst�ncia d'interf�cie i imprimeix
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

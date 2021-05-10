package backendjava.Modul10.Nivell1;

/*FASE 3
 Crea una Functional Interface que continga un metode abastracte reverse(), que retorne un
 valor string; en una altra classe, injecta la interficie creada mitjancant una lambda el 
 cos del metode, de manera que torne la mateixa cadena que rep com a parametre pero a linreves.
 Invoca la instancia de la interficie passantli una cadena i comprovant el resultat 
      
 */
/**
 * @author casa
 *
 */
public class Fase3 {
	final static String str = "hola";

	public static void main(String[] args) {

		GetString reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--)
				result += str.charAt(i);
			return result;
		};

		System.out.println(
				str+" ,com és a l'inrevés...  " + reverse.getString(str));
	}

	@FunctionalInterface
	public interface GetString {
		public abstract String getString(String str);
	}

}

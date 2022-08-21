

package punto1;

import java.text.Normalizer;

public class Frase {

	// Se declaran los atributos de la clase
	private String frase;

	// Se declara el m�todo constructor por defecto
	public Frase() {

	}

	// Se declara el m�todo constructor con par�metros
	public Frase(String frase) {
		this.frase = frase;
	}

	// Getters y setters de las variables privadas
	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}

	// M�todo para borrar las tildes de las frases
	public static String borrarTildes(String texto) {
		texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
		texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		return texto;
	}

	// M�todo para comprobar si la frase es igual a la frase invertida
	public String comprobarFrase(String fraseInvertida) {
		if (borrarTildes(frase.toUpperCase().replaceAll("\\s+", "").replaceAll("\\p{Punct}", "")).equals(
				borrarTildes(fraseInvertida.toUpperCase().replaceAll("\\s+", "").replaceAll("\\p{Punct}", "")))) {
			return frase;
		} else {
			return "";
		}
	}

}
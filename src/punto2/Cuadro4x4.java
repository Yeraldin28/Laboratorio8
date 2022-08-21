

package punto2;

public class Cuadro4x4 {

	// Se declaran los atributos de la clase
	private int sumaDeLados;

	// Se declara el m�todo constructor por defecto
	public Cuadro4x4() {

	}

	// Se declara el m�todo constructor con par�metros
	public Cuadro4x4(int sumaDeLados) {
		this.sumaDeLados = sumaDeLados;
	}

	// Getters y setters de las variables privadas
	public int getSumaDeLados() {
		return sumaDeLados;
	}

	public void setSumaDeLados(int sumaDeLados) {
		this.sumaDeLados = sumaDeLados;
	}

	// M�todo para ...
	public int[][] generarCuadro() {

		int[][] cuadrado = new int[4][4];
		int numeroInicial = (sumaDeLados - 30) / 4;

		for (int filas = 0; filas < 4; filas++) {
			for (int columnas = 0; columnas < 4; columnas++) {
				if ((columnas < 1 && filas < 1) || (columnas < 1 && filas > 2) || (columnas > 2 && filas < 1)
						|| (columnas > 2 && filas > 2))
					cuadrado[filas][columnas] = numeroInicial;
				else if ((columnas >= 1 && filas >= 1) && (columnas >= 1 && filas <= 2) && (columnas <= 2 && filas >= 1)
						&& (columnas <= 2 && filas <= 2))
					cuadrado[filas][columnas] = numeroInicial;
				numeroInicial++;
			}
		}
		numeroInicial = (sumaDeLados - 30) / 4;
		for (int filas = 3; filas >= 0; filas--) {
			for (int columnas = 3; columnas >= 0; columnas--) {
				if (cuadrado[filas][columnas] == 0)
					cuadrado[filas][columnas] = numeroInicial;
				numeroInicial++;
			}
		}
		return cuadrado;
	}

}

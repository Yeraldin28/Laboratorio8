

package punto2;

public class Cuadro3x3 {

	// Se declaran los atributos de la clase
	private int sumaDeLados;

	// Se declara el m�todo constructor por defecto
	public Cuadro3x3() {

	}

	// Se declara el m�todo con par�metros
	public Cuadro3x3(int sumaDeLados) {
		this.sumaDeLados = sumaDeLados;
	}

	// Getters y setters de las variables privadas
	public double getSumaDeLados() {
		return sumaDeLados;
	}

	public void setSumaDeLados(int sumaDeLados) {
		this.sumaDeLados = sumaDeLados;
	}

	// M�todo para generar el cuadrado
	public int[][] generarCuadro() {

		int[][] cuadrado = new int[3][3];
		int columna = 1, fila = 0, columnaInicial = 0, filaInicial = 0;
		int numeroInicial = (sumaDeLados - 12) / 3;

		cuadrado[fila][columna] = numeroInicial;

		for (int i = 2; i <= 9; i++) {
			if (fila - 1 < 0) {
				fila = 2;
			} else {
				fila = fila - 1;
			}
			if (columna + 1 > 2) {
				columna = 0;
			} else {
				columna = columna + 1;
			}
			if (cuadrado[fila][columna] == 0) {
				cuadrado[fila][columna] = i + (numeroInicial - 1);
				filaInicial = fila;
				columnaInicial = columna;
			} else {
				fila = filaInicial + 1;
				if (filaInicial + 1 >= 3 ) {
					fila = 0;
				}
				columna = columnaInicial;
				cuadrado[fila][columna] = i + (numeroInicial - 1);
			}
		}
		return cuadrado;

	}

}
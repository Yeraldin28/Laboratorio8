package punto2prueba;

public class Clase {

	private int sumaDeLados;

	public Clase(int sumaDeLados) {
		this.sumaDeLados = sumaDeLados;
	}

	public int[][] generarcuadro() {

		int[][] cuadrado = new int[4][4];
		int num = (sumaDeLados - 30) / 4;

		for (int filas = 0; filas < 4; filas++) {
			for (int columnas = 0; columnas < 4; columnas++) {
				if ((columnas < 1 && filas < 1) || (columnas < 1 && filas > 2) || (columnas > 2 && filas < 1)
						|| (columnas > 2 && filas > 2))
					cuadrado[filas][columnas] = num;
				else if ((columnas >= 1 && filas >= 1) && (columnas >= 1 && filas <= 2) && (columnas <= 2 && filas >= 1)
						&& (columnas <= 2 && filas <= 2))
					cuadrado[filas][columnas] = num;
				num++;
			}
		}
		num = (sumaDeLados - 30) / 4;
		for (int filas = 3; filas >= 0; filas--) {
			for (int columnas = 3; columnas >= 0; columnas--) {
				if (cuadrado[filas][columnas] == 0)
					cuadrado[filas][columnas] = num;
				num++;
			}
		}
		return cuadrado;
	}

}

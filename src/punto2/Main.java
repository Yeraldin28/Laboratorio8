
package punto2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA GENERA CUADROS MAGICOS DE 3X3 Y 4X4");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir = 1;

		do {
			// Se declaran las variables a usar
			int matriz3x3[][] = new int[3][3];
			int matriz4x4[][] = new int[4][4];
			int decision = 1, sumaDeLados = 0;

			// Se le pregunta al usuario el tama�o del cuadro que quiere
			do {
				System.out.print((decision > 1 || decision < 2)
						? "\n\n\t�De que tama�o quieres el cuadro m�gico? \n\n\t1. 3x3\n\t2. 4x4\n\n\tDecisi�n: "
						: "\n\n\tIngresa un n�mero valido:");
				decision = Integer.parseInt(in.readLine());

			} while (decision < 1 || decision > 2);

			// Dependiendo de la decisi�n se muestra un cuadro 3x3 o 4x4
			switch (decision) {

			case 1:
				// Se le pregunta al usuario cu�nto quiere que sume el cuadro
				do {
					System.out.print((sumaDeLados % 3 != 0 || sumaDeLados == 3 || sumaDeLados == 12)
							? "\n\n\tIngresa un n�mero que sea m�ltiplo de tres: "
							: "\n\t�Cu�nto deseas que sume el cuadrado m�gico? (M�ltiplos de 3)\n\tSuma: ");
					sumaDeLados = Integer.parseInt(in.readLine());

				} while (sumaDeLados % 3 != 0 || sumaDeLados == 3 || sumaDeLados == 12);

				// Se declara el cuadro m�gico de 3x3 
				Cuadro3x3 cuadro3x3 = new Cuadro3x3(sumaDeLados);
				matriz3x3 = cuadro3x3.generarCuadro();
				
				// Se muestra el cuadro 
				System.out.print("\n\t______________________");
				for (int i = 0; i < 3; i++) {
					System.out.print("\n\t|      |      |      |\n\t|");
					for (int j = 0; j < 3; j++) {
						System.out.printf("%4d%2s|", matriz3x3[i][j], "");
					}
					System.out.print("\n\t|______|______|______|");
				}
				break;

			case 2:
				// Se le pregunta al usuario cu�nto quiere que sume el cuadro
				do {
					System.out.print(((sumaDeLados + 2) % 4 == 0 || sumaDeLados == 30 || sumaDeLados == 18)
							? "\n\n\tIngresa un n�mero que cumpla las condiciones: "
							: "\n\t�Cu�nto deseas que sume el cuadrado m�gico? (s�male dos a tu n�mero y comprueba que sea m�ltplo de cuatro)\n\tSuma: ");
					sumaDeLados = Integer.parseInt(in.readLine());

				} while (sumaDeLados + 2 % 4 == 0 || sumaDeLados == 30 || sumaDeLados == 18);

				// Se declara el cuadro m�gico de 4x4
				Cuadro4x4 cuadro4x4 = new Cuadro4x4(sumaDeLados);
				matriz4x4 = cuadro4x4.generarCuadro();
				
				// Se muestra el cuadro 
				System.out.print("\n\t_____________________________");
				for (int i = 0; i < 4; i++) {
					System.out.print("\n\t|      |      |      |      |\n\t|");
					for (int j = 0; j < 4; j++) {
						System.out.printf("%4d%2s|", matriz4x4[i][j], "");
					}
					System.out.print("\n\t|______|______|______|______|");
				}
				break;
			}

			// Se le pregunta al usuario si quiere volver a usar el programa
			do {
				System.out.print((repetir > 1 || repetir < 2)
						? "\n\n\t�Quieres volver a usar el programa? \n\n\t1. Si\n\t2. No\n\n\tDecisi�n: "
						: "\n\n\tIngresa un n�mero valido:");
				repetir = Integer.parseInt(in.readLine());

			} while (repetir < 1 || repetir > 2);
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}

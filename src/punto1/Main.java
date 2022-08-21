

package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA COMPRUEBA SI UNA FRASE ES PAL�NDROMA");

		// Se declara un objeto que realiza la lectura de datos
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir = 1;

		do {
			// Se declaran las variables a usar
			String frase, fraseInvertida;

			// Se pide los datos a ingresar en el objeto
			System.out.print("\n\n\tIngresa la frase que deseas comprobar: ");
			frase = in.readLine();

			// Se declara el objeto de tipo Frase
			Frase fraseAComprobar = new Frase(frase);

			// Se genera la frase invertida por medio del m�todo reverse()
			StringBuilder strb = new StringBuilder(frase);
			fraseInvertida = strb.reverse().toString();

			// Muestro el valor de los m�todos
			System.out.print("\n\n\tLa frase '" + fraseAComprobar.getFrase());
			System.out.print(fraseAComprobar.comprobarFrase(fraseInvertida) == frase ? "' es una frase pal�ndroma"
					: "' no es una frase pal�ndroma");

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

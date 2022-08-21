package punto2prueba;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.print("Introduzca n del cuadrado mágico n x n: ");
	        int n = 4;
	        int matriz4x4[][] = new int[4][4];
	        while (n > 2) {
	            Clase cuadro4x4 = new Clase(402);
	            matriz4x4 = cuadro4x4.generarcuadro();
	                System.out.println("Su cuadrado mágico " + n + " x " + n + " es: ");
	                System.out.print("\n\t_____________________________");
		    		for (int i = 0; i < 4; i++) {
		    			System.out.print("\n\t|      |      |      |      |\n\t|");
		    			for (int j = 0; j < 4; j++) {
		    				System.out.printf("%4d%2s|", matriz4x4[i][j], "");
		    			}
		    			System.out.print("\n\t|______|______|______|______|");
		    		}
	            System.out.println("Introduzca n del cuadrado mágico n x n");
	            n = s.nextInt();
	            
	            
	        }
	}
}
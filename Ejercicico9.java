import java.util.Scanner;

public class Ejercicico9 {

	public static void main(String[] args) {
		// Pedir un número por pantalla y calcular su tabla de multiplicar.
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero ");
		int numero = sc.nextInt();
		for (int i =0 ; i <= 10; i++) {
		    System.out.println((numero) + " * " + i + " = " + (numero)*i );
		}

	}

}

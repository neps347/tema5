import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// Pedir dos números por pantalla y calcular la división. Controlar que, si el divisor es cero, imprimir un mensaje que diga: 'no puede dividirse un número entre cero'.
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero");
			int numero1 = sc.nextInt();
			
			
			System.out.println("introduce otro numero");
			int numero2 = sc.nextInt();
			if( numero2 == 0) 
			System.out.print("No se puede realizar la division con divisor 0");
			
	        System.out.println("Vamos a dividir estos numeros:" + (numero1/numero2));
	        
	        

	}

}

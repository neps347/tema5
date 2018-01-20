import java.util.Scanner;

public class Tarea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numerorandom = (int) (Math.random()*10 + 1);
		System.out.println("Dime un numero entre 1 y 10");
		int numero = sc.nextInt();
		
		 while (numero!=numerorandom) {
		    
		      if (numero>numerorandom) {
					System.out.println("el numero que elegiste es mayor que el numero premiado");
		      }
					else if (numero<numerorandom) {
						System.out.println("El numero que elegiste es menor que el numero premiado");
					
		 }
		      System.out.println("introduce otro numero");
		      numero = sc.nextInt();
		 }
		 System.out.println("Has ganado");
		
			
		
		
		//if (numero==numerorandom) {
		  //  System.out.println("Has acertado");
		    //}
		    //else {
	          //  System.out.println("no has acertado el numero random era" + numerorandom);
	        }}
		
	//}



//necesitamos un bucle para que el usuario acerte el numero
//y despues necesitamos saber si el numero es mayot menor o igual que el numero que se genero de manera aleatoria con 
//sentencencia condicional!
//En funcion de eso mensaje o acaba ejeccuicion


import java.io.InputStream;
import java.util.Scanner

public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear una instancia de la clase Scanner pasando System.in al constructor 
		System.out.printf("Escribe en pantalla un numero: ", 3);
		Scanner keyboard = new Scanner(System.in);
		// el programa se detiene en este punto hasta que el usuario introduza un número y 
		pulse ENTER
		int numero = keyboard.nextInt();
		// cerrar la instancia de la clase Scanner 
		keyboard.close();
		System.out.println("El triple es %d",numero *3).println();
		

	}

	public int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}

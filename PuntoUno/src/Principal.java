import java.util.Scanner;

public class Principal {
	
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ingrese frase: ");		
		String palabra = in.nextLine();
	    char [] frase = palabra.toCharArray();
	    
	    Array ay = new Array();
	    ay.separarFrase(null);

}
}
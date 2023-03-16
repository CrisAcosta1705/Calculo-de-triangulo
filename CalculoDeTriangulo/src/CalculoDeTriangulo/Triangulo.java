package CalculoDeTriangulo;
import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner (System.in);
int a, b, c;

System.out.println("Inserte el primer dato");
a = teclado.nextInt();

System.out.println("Inserter el segundo dato");
b = teclado.nextInt();

System.out.println("Inserte el tercer dato");
c = teclado.nextInt();

if (a == b && a == c) {
System.out.println("Triangulo equilatero");	
	
	} else if (a != b && a == c) {
	System.out.println("Triangulo isoceles");	
	
	} else if (a != c && b == a) {
	System.out.println("Triangulo isoceles");	
	
	} else if (a != c && b == c) {
	System.out.println("Triangulo isoceles");	
	
	}
if (a != b && a != c && b != c) {
System.out.println("Triangulo escaleno");
	}
teclado.close();
	}

}

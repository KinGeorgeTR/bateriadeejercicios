package bateriadejercicios;

import java.util.Scanner;

public class Ejercicioo_12 {
	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);
		int n;
		do{System.out.println("Que tal si ingresas una cantidad");
		n=lec.nextInt();}while(n<=0);
		for(int i=0;i<=n;i++) {
			i=i+1;	
			System.out.println("La primeras sumas de "+n+" es: "+i);
		}
	}

}

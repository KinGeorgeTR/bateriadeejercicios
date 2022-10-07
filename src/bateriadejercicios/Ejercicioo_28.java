package bateriadejercicios;

import java.util.Scanner;

public class Ejercicioo_28 {
	public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int a, b, n;
        b=0;
        n=0;
		for(int i =10;i >= 0;i--) {
	        System.out.print("Escribe un numero ");
	        a=lec.nextInt();
	        if(a % 2 == 0) {
	            System.out.println(a+" es par ");
	        } else {
	            System.out.println(a+" es impar");
	            b=a+b;
	            a=b;
	            n=n+1;
	        }
		}
		n=n-1;
		System.out.println("Hey el valor medio de los impares es:"+(b/n));
	}

}

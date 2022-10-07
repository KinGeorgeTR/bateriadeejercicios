package bateriadejercicios;

import java.util.Scanner;

public class Ejercicioo_15 {
	public static void main(String[] args) {
		Scanner lec=new Scanner(System.in);
		String clave;
		int intentos;
		System.out.println("Ingrese la contraseña, tiene solo 3 intentos ):(");
		clave=lec.next();
		intentos=2;
		switch(clave) {
		case "brutal":
			System.out.println("esooo");
			System.exit(0);
			break;
		}
		do{
			System.out.println("Maaaaal, otra vez pa, te quedan "+intentos+" intentos");
			clave=lec.next();
			switch(clave) {
			case "brutal":
				System.out.println("esooo");
				System.exit(0);
				break;
			}
			intentos=intentos-1;

		}while(intentos>0);
		
	}

}

package bateriadejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
	public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
		String SioNo="Si";
		System.out.println("Quieres empezar un ciclo formativo de grado mayor");
		System.out.println("Tienes titulo de bachiller?");
		SioNo=sc.next();
		if(SioNo.equalsIgnoreCase("No")) {
			System.out.println("Pasaste el examen de admision?");
			SioNo=sc.next();
			if(SioNo.equalsIgnoreCase("No")) {
				System.out.println("F, usted no puede cursar un ciclo formativo de grado mayor");
				System.exit(0);
			}else {
				System.out.println("Grandeee, ahora puedes empezar un ciclo formativo de grado mayor");
			}
		}else {
			System.out.println("Grandeee, ahora puedes empezar un ciclo formativo de grado mayor");
		}
	}

}

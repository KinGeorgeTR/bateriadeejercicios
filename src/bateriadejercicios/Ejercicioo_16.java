package bateriadejercicios;

import java.util.Scanner;

public class Ejercicioo_16 {
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  
		  int []datos = new int[10];
		  int maximo,minimo,suma=0;
		  
			  
			  for (int i = 0; i < 10; i++) {
				  System.out.println("Decime el dato "+ (i+1)+ "");
				  datos[i] = s.nextInt();
			  }
			  for (int i = 0; i < 10; i++) {
				  suma+= datos[i] ;
			}
			 
			   {
				   suma+= datos[0] ;
				   maximo = minimo = datos[0];
			       for (int i = 1; i<10 ; i++) {
	 
				if (datos[i]>maximo) {
					   maximo = datos[i];  
				   }
				   if(datos[i]<minimo){
					   minimo = datos[i];
					    }
			}
			  System.out.println("Ok el maximo es :"+maximo);
			  System.out.println("Ok el minimo es :"+minimo);
			  System.out.println("Ok la media es :" +(suma/10.0));
			  
		
			
			}
	}

}

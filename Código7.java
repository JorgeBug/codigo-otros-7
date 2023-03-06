package com.generation;

//Se importó el HashMap
import java.util.HashMap;
//Se importó Scanner
import java.util.Scanner;

public class Código7 {

	//Se le agregó el main
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in); //Se faltaba el system.in
		
		//Se le cambio los valores a tipo Strings
		HashMap<String, String> capitales = new HashMap<>();//se corrigio la variable "ca" con capitales
		
		capitales.put("Canadá", "Otawwa");
		capitales.put("Estados Unidos", "Washington DC");
		capitales.put("México", "México DF");
		capitales.put("Belice", "Belmopán");
		capitales.put("Costa rica", "San José");
		capitales.put("El Salvador","San salvador"); //Faltaba la capital del salvador
		capitales.put("Guatemala", "Ciudad de Guatemala");
		capitales.put("Honduras", "Tegucigalpa");
		capitales.put("Nicaragua", "Managua");
		capitales.put("Panamá", "Panamá");
		
		String c = ""; //tenía mal la variable String
		
		do {
			//Se le corrigió el in por un out
			System.out.print("Escribe el nombre de un país y te diré su capital: ");
			c = s.nextLine(); //Se le cambio a nextLine 
			
			if (!c.equals("salir")) { //no estaba vien escrito equials
				//Se le corrigió capitales.containskey para buscar la capital de un país
				if (capitales.containsKey(c)) {//se le agrego capitales
					System.out.print("La capital de " + c);//le faltaba un out
					System.out.println(" es " + capitales.get(c));//Se corrigio capitales y el get
				} else {
					System.out.print("No conozco la respuesta ");
					System.out.print("¿cuál es la capital de " + c + "?: ");
					String ca = s.nextLine();
					capitales.put(c, ca);//Se colocó la variable correcta capitales
					System.out.println("Gracias por enseñarme nuevas capitales");
				}
			}		//Le faltaba un parentecis
		} while (!c.equals("salir")); // no tenía el while correctamente
	}
	
}

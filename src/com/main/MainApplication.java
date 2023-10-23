package com.main;

import com.bean.Academy;
import com.bean.Corso;

public class MainApplication {

	public static void main(String[] args) {
		
		//una delle due modalità utili ad inizializzare un array
		int arrayInt [] = new int [3];
		arrayInt[0] = 89;
		arrayInt[1] = 22;
		arrayInt[2] = 89;

		for (int i=0; i<arrayInt.length; i++) {
			
			System.out.println("Contenuto arrayInt" + arrayInt[i]);
		}
		
		
		//seconda modalità di inizializzare un array
		
		int arrayNew [] = {98,76,57};
		
		for (int i=0; i<arrayNew.length; i++) {
			
			System.out.println("Contenuto arrayInt" + arrayNew[i]);
		}
		
	
		 // Array di reference ad oggetti:
		
		Corso arrCorsi [] = new Corso[3];
		arrCorsi[0] = new Corso("1028x", "Java SE", "Roma");
		arrCorsi[1] = new Corso("1028y", "Java EE", "Milano");
		arrCorsi[2] = new Corso("1028z", "Spring", "Napoli");
		
		for (Corso corso : arrCorsi) {
			
			System.out.println("Contenuto arrCorsi" + corso.toString());
			
		}
		
		/*
		 * IL POLIMORFISMO CI CONSENTE DI INIZIALIZZARE UN
		 * ARRAY DI REFERENCE DELLO STESSO TIPO (Object)
		 * che potranno poi assumere forme di Oggetti differenti 
		 * in quanto tutti gli Oggetti sono figli di Object
		 */
		
		Object arrayCA [] = new Object[2];
		arrayCA[0] = new Corso("1076G", "Angular", "Roma");
		arrayCA[1] = new Academy("1067K", "Microservizi", "formatemp", "Milano");
		
		for (Object object : arrayCA) {
			System.out.println(object.toString());
		}
		
	}

}

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		
		   Scanner in = new Scanner(System.in);

	     
	        System.out.print("Inserisci il tuo nome:");
	        String nome = in.nextLine();
	        
	     
	        System.out.print("Inserisci il tuo cognome:");
	        String cognome = in.nextLine();

	  
	        System.out.print("Inserisci il tuo colore preferito:");
	        String colorePreferito = in.nextLine();

	
	        System.out.print("Inserisci il giorno di nascita:");
	        String giornoNascita = in.nextLine();
	        int giorno = Integer.valueOf(giornoNascita);
	        
	        System.out.print("Inserisci il mese di nascita:");
	        String meseNascita = in.nextLine();
	        int mese = Integer.valueOf(meseNascita);

	        System.out.print("Inserisci l'anno di nascita:");
	        String annoNascita = in.nextLine();
	        int anno = Integer.valueOf(annoNascita);

	     
	        int sommaNascita = giorno + mese + anno;

	  

	     
	        System.out.println("La tua password generata è:"+ nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita);

	   
	        in.close();
	}
}

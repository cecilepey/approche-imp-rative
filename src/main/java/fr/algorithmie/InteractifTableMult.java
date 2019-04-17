package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in); 
			
		System.out.println("Entrez un nombre : ");
		
		int nb = scanner.nextInt(); 

		for (int i = 1; i<=10; i++){
			
			System.out.println(nb + " x " + i + " = " + nb*i);
		}
		
	}

}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre  : ");

		int nb = scanner.nextInt();
		
		for (int i = nb-1; i>0; i--){
			
			nb = nb + i; 
			
		}
		
		System.out.println(nb);

	}

}

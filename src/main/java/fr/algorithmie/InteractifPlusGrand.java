package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entrez le nombre 1 : ");

		int nb = scanner.nextInt();
		
		
		int max = nb; 
	
		
		for (int i = 2; i<11; i++){
			
			System.out.println("Entrez le nombre " + i  + "  : ");

			nb = scanner.nextInt();
			
			if (nb > max){
				
				max = nb; 
			}
			
		}
		

		System.out.println("Le plus grand chiffre saisi " + max);

	
	}

}

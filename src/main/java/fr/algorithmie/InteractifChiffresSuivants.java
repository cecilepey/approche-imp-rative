package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre : ");

		int nb = scanner.nextInt();
		
		for (int i = 0; i <10; i++){
			
			nb +=1; 
			System.out.println(nb);
		}

	}

}

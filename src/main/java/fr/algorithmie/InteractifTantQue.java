package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Entrez un nombre entre 1 et 10 : ");

		int nb = scanner.nextInt();
		
		while  ((nb>10) || (nb<1)){
			
			System.out.println("Entrez un nombre entre 1 et 10 : ");

			nb = scanner.nextInt();
		}
		
	}

}

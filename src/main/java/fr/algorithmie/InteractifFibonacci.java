package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez entrez un nombre :");

		int nb = scanner.nextInt();

		double resultat = 0;

		double n1 = 0;

		double n2 = 1;

		for (int i = 0; i < nb-2; i++) {

			resultat = n1 + n2;

			n1 = n2;
			n2 = resultat;

		}

		System.out.println(resultat);
	}

}

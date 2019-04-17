package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);

		int nb = random.nextInt(100) + 1;
		
		int nbCoups = 1;
		
		System.out.println(nb);

		System.out.println("Essayer de trouver le chiffre mystère compris entre 1 et 100 : ");

		int nbUser = scanner.nextInt();


		while (nbUser != nb) {


			if (nbUser > nb) {

				System.out.println("Votre chiffre est trop grand, essayez encore : ");

				nbUser = scanner.nextInt();
				
			} else if (nbUser < nb) {
				
				System.out.println("Votre chiffre est trop petit, essayez encore : ");

				nbUser = scanner.nextInt();
			
			}
			
			nbCoups += 1;
		}
		
		System.out.println("Bravo ! Vous avez trouver la bonne réponse en " + nbCoups + " coups!");

	}

}

package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {

		int nbBaton = 21;
		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Il y a 21 batons, chacun prend 1, 2 ou 3 batons, le perdant prend le dernier !");
		System.out.println("Comment de batons prenez-vous ? ");

		int nbBatonUser = scanner.nextInt();
		int nbBatonOrdi;

		while (nbBaton > 1) {

			while ((nbBatonUser > 3) || (nbBatonUser < 0)) {
				System.out.println("Vous n'avez pas saisi un nombre valide !");
				System.out.println("Comment de batons prenez-vous ? ");

				nbBatonUser = scanner.nextInt();
			}
			
			while (nbBatonUser>nbBaton){
				System.out.println("Vous ne pouvez pas prendre autant de batons");
				System.out.println("Comment de batons prenez-vous ? ");

				nbBatonUser = scanner.nextInt();
			}

			nbBaton = nbBaton - nbBatonUser;

			System.out.println("Vous avez choisi " + nbBatonUser + " baton(s), il reste " + nbBaton + " baton(s)");

			if (nbBaton < 4) {

				nbBatonOrdi = 1;
				
				System.out.println("");
				System.out.println(" L'ordinateur a choisi " + nbBatonOrdi + " baton(s), il reste " + nbBaton + " baton(s)");

			}
			
			else  {

				nbBatonOrdi = random.nextInt(3) + 1;

				nbBaton = nbBaton - nbBatonOrdi;

				System.out.println("");
				System.out.println("L'ordinateur a choisi " + nbBatonOrdi + " baton(s), il reste " + nbBaton + " baton(s)");

			}

			System.out.println("Comment de batons prenez-vous ? ");

			nbBatonUser = scanner.nextInt();

		}

		System.out.println("Le jeu est fini! ");

	}
}

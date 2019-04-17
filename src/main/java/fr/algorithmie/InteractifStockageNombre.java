package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {

		System.out.println("Choisissez parmi le menu : ");
		System.out.println("1. Ajouter un nombre");
		System.out.println("2. Afficher les nombres existants");

		Scanner scanner = new Scanner(System.in);

		int menu = scanner.nextInt();

		int[] array = new int[2];

		int index = 0;

		while ((menu == 1) || (menu == 2)) {

			if (menu == 1) {

				System.out.println("Entez le nombre à ajouter : ");
				int nb = scanner.nextInt();

				if (index > array.length-1) {

					int[] temp = new int[array.length + 10];
					for (int i = 0; i < array.length; i++) {
						temp[i] = array[i];

					}
					array = temp;
					array[index] = nb;

				} else {
					array[index] = nb;

				}

			} else if (menu == 2) {
				for (int i = 0; i < array.length; i++) {
					System.out.println(array[i]);
				}

			}

			index += 1;
			System.out.println("Choisissez parmi le menu : ");
			System.out.println("1. Ajouter un nombre");
			System.out.println("2. Afficher les nombres existants");
			menu = scanner.nextInt(); 
		}
	}

}

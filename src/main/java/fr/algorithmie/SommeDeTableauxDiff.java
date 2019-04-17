package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		if (array1.length > array2.length) {

			int[] addArray = new int[array1.length];

			for (int i = 0; i < array1.length; i++) {

				if (array2.length > i) {

					addArray[i] = array1[i] + array2[i];

				} else {

					addArray[i] = array1[i];
				}

				System.out.println("le résultat de la somme est : " + addArray[i]);

			}

		} else {

			int[] addArray = new int[array2.length];

			for (int i = 0; i < array2.length; i++) {

				if (array1.length > i) {

					addArray[i] = array1[i] + array2[i];

				} else {

					addArray[i] = array2[i];
				}

				System.out.println("le résultat de la somme est : " + addArray[i]);

			}

		}

	}

}

package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {

		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		boolean echange = true;

		int temp;

		while (echange == true) {

			echange = false;

			for (int i = 0; i < array2.length - 1; i++) {

				if (array2[i] > array2[i + 1]) {

					temp = array2[i];
					array2[i] = array2[i + 1];
					array2[i + 1] = temp;

					echange = true;

				}
			}

		}

		for (int i = 0; i < array2.length; i++) {

			System.out.println("le tableau trié : " + array2[i]);

		}

	}

}

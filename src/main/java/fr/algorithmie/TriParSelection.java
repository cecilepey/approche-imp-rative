package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {

		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		int positionMini = 0;

		int temp;

		for (int i = 0; i < array2.length; i++) {

			for (int j = i + 1; j < array2.length; j++) {

				if (array2[j] < array2[positionMini]) {

					positionMini = j;
				}
			}

			temp = array2[positionMini];
			array2[positionMini] = array2[i];
			array2[i] = temp;

			System.out.println("tableau trié : " + array2[i]);

		}

	}

}

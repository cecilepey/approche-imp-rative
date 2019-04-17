package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {

		int[] array = { 0, 1, 2, 3, 4, 5, 6 };

		int temp = array[0];

		int temp2;


		for (int i = 0; i < array.length; i++) {

			if (i == 0) {

				temp = array[0];
				temp2 = array[array.length - 1];
				array[0] = temp2;

			} else {

				// i prend la valeur de i-1

				temp2 = array[i];

				array[i] = temp;

				temp = temp2;

			}

		}

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

	}

}

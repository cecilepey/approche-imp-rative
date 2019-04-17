package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = { 6, 7, 8 };

		boolean six = false;

		if (array.length >= 1 && (array[0] == 6 || array[array.length - 1] == 6)) {

			six = true;
		}

		System.out.println(six);

	}

}

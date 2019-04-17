package fr.algorithmie;

public class FirstLast {

	public static void main(String[] args) {

		int[] array =  {1, 2, 3, 1};

		boolean last = false;

		if (array.length >= 1 && (array[0] == array[array.length - 1])) {

			last = true;
		}

		System.out.println(last);

	}

}

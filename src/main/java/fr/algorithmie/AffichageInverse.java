package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("dans l'ordre : " +array[i]);
		}
		
		for (int i = 16; i >= 0; i--){
			System.out.println("En sens inverse : " + array[i]);
		}
		
		int[] arrayCopy = new int [17];
		
		for (int i = 0; i < array.length; i++) {
			
			arrayCopy[i] = array[i]; 
			System.out.println("Une fois copié : " + arrayCopy[i]);
			
		}

	}

}
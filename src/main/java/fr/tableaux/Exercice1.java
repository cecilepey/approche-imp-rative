package fr.tableaux;

public class Exercice1 {

	public static void main(String[] args) {
		int [] tableau  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		System.out.println(tableau[0]);
		System.out.println(tableau[9]);
		System.out.println(tableau.length);
		System.out.println(tableau[4]);
		//le chiffre 5 est à l'index 4.
		//tableau[10] affiche une exception ArrayIndexOutOfBoundsException car l'indice 10 n'existe pas.
		
		tableau[4] = 8; 
		System.out.println(tableau[4]);
		
	}

}

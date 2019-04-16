package fr.tableaux;

public class Exercice2 {

	public static void main(String[] args) {
		int [][]tableau = new int [2][]; // On crée 2 lignes, sans définir la longueur car ce n'est pas un carré
		tableau [0] = new int []{1, 2, 3}; // On définit la longueur de la première ligne
		tableau [1] = new int []{4, 5, 6, 7, 8}; // On définit la longueur de la deuxième ligne
		// Autre méthode pour déclarer et initialiser 1 tableau à 2 dimensions : int[][] tableau {{1, 2, 3, }, {4, 5, 6, 7, 8, 9}
		
		System.out.println(tableau.length);
		
		System.out.println(tableau[0].length);
		
		System.out.println(tableau[1].length);
		
		System.out.println(tableau[0][0]);
		
		int i = tableau.length; 
		int j = tableau[i-1].length; 
		
		System.out.println(tableau[i-1][j-1]);
		
	}

}

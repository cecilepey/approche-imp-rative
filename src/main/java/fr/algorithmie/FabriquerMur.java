package fr.algorithmie;

public class FabriquerMur {

	public static void main(String[] args) {

		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
	}

	static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
		boolean resultat = false;

		// on a une longueur combien de fois 5 dans cette longueur
		// nbBig *5 = longueurbrique 5
		
	
//		int resteLongueur = longueur - nbBig * 5;
//
//		if (nbBig * 5 == longueur) {
//
//			resultat = true;
//		} else if (resteLongueur > 0) {
//
//			if (resteLongueur <= nbSmall) {
//				//
//				return true;
//			} else {
//				return false;
//			}
//			
//		} else if (resteLongueur <0){
//			
//			int modulo = longueur % 5; 
//			
//			if (modulo >= nbSmall){
//				return true; 
//			}else{
//				return false; 
//			}
//
//	}
		// // diviser la longueur du mur en brique de 5, diviser le modulo en
		// // brique de 2
		//
		// int modulo5 = longueur % 5;
		// int resteLongueur = longueur - (nbBig * 5);
		//
		// if (modulo5 != 0) {
		//
		// if (resteLongueur <= nbSmall) {
		//
		// resultat = true;
		// } else {
		// resultat = false;
		// }
		//
		// // je prends la longueur du mur, je la divise par 5, je compare le
		// // résultat avec le nombre de brique de 5
		// // je reprends le reste et je divise par le nombre de brique de 1
		//
		// } else {
		//
		// if (longueur == nbBig * 5) {
		// resultat = true;
		// } else if (longueur > nbBig * 5) {
		// resultat = false;
		// } else if (longueur < nbBig * 5) {
		//
		// if (resteLongueur <= nbSmall) {
		//
		// resultat = true;
		// } else {
		// resultat = false;
		// }
		// }
		//
		// }

		return resultat;
	}

	private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			throw new RuntimeException("Test (" + nbSmall + ", " + nbBig + ", " +

					longueur + ") NON passant.");

		}
	}
}

package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {
		// variable
		int[] tab = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		String afficherTab = "Tableau : ";
		String afficherTabInverse = "Tableau inverse : ";
		String elementTab = "";
		String elementTabSup3 = "";
		String elementTabPair = "";
		String elementTabIndexPair = "";
		String elementTabImpair = "";
		
		//afficher l'ensemble du tableau
		for (int i = 0; i< tab.length;i++) {
			elementTab = elementTab + tab[i]+ " ";
		}
		afficherTab = afficherTab + elementTab;
		System.out.println(afficherTab);
		
		//afficher l'ensemble du tableau de façon inverse
		elementTab = "";
		for (int j = tab.length-1; j >= 0; j--) {
			elementTab = elementTab + tab[j] + " ";
		}
		afficherTabInverse = afficherTabInverse + elementTab;
		System.out.println(afficherTabInverse);
		
		//combiner boucle et test : afficher entier > 3
		afficherTab = "";
		for (int i = 0; i< tab.length;i++) {
			if (tab[i]>3) {
				System.out.println(tab[i]);
				elementTabSup3 = elementTabSup3 + tab[i] + " ";
			}
		}
		afficherTab = "élement du tableau supérieur à 3 : " + elementTabSup3;
		System.out.println(afficherTab);
		
		//combiner bloucle et test : afficher nombre pair
		afficherTab = "";
		for (int i = 0; i< tab.length;i++) {
			if (tab[i] % 2 == 0) {
				System.out.println(tab[i]);
				elementTabPair = elementTabPair + tab[i] + " ";
			}
		}
		afficherTab = "élement du tableau qui sont pair : " + elementTabPair;
		System.out.println(afficherTab);
		
		//combiner bloucle et test : afficher les valeurs des index pairs
		afficherTab = "";
		for (int i = 0; i< tab.length;i++) {
			if (i % 2 == 0) {
				System.out.println(tab[i]);
				elementTabIndexPair = elementTabIndexPair + tab[i] + " ";
			}
		}
		afficherTab = "élement du tableau dont les valeurs des indexs sont pair : " + elementTabIndexPair;
		System.out.println(afficherTab);
		
		//combiner bloucle et test : afficher nombre impair
		afficherTab = "";
		for (int i = 0; i< tab.length;i++) {
			if (tab[i] % 2 != 0) {
				System.out.println(tab[i]);
				elementTabImpair = elementTabImpair + tab[i] + " ";
			}
		}
		afficherTab = "élement du tableau qui sont impair : " + elementTabImpair;
		System.out.println(afficherTab);	
	}

}

package fr.boucles;

public class ExerciceTableauEntier {

	public static void main(String[] args) {
		// variables
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		String taille = "La taille du tableau est de " + tab.length + " �lements";
		int dernierElement = tab[tab.length-1];
		
		//afficher le premier element du tableau
		System.out.println(tab[0]);
		
		//afficher la longueur du tableau
		System.out.println(taille);
		
		//afficher le dernier �lement du tableau
		System.out.println("Le dernier �lements du tableau est : " + dernierElement);
		
		//Modifier la valeur de l'index 4 du tableau
		for (int i=0; i <= tab.length;i++) {
			if (i == 4) {
				System.out.println(tab[i]);
				tab[i] = 8;
				System.out.println(tab[i]);
			}
		}
	}

}

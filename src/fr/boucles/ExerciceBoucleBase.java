package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		// variables
		int nombre1 = 0;
		int j = 0;
		int nombre2 = 1;		
		String nom = "Moreau";
		String prenom = "Nicolas";
		String chaine = "Je m'appelle " + nom + " " + prenom;
		String nombrePair = "Voici les nombres pair : ";
		String ajoutPair = "";
		String nombreImpair = "Voici les nombres impair : ";
		String ajoutImpair = "";
		
		//execute nombres de 1 à 10
		for (int i = 0; i < 10; i++) {
			nombre1++;
			System.out.println(nombre1);
		}
		
		//execute 20 fois nom et prenom
		while (j < 20) {
			System.out.println(chaine);
			j++;
		}
		
		//execute les nombres impair et pair
		for (int i = 1; i <= 100; i++) {
			if(nombre2 % 2 == 0) {
				ajoutPair = ajoutPair + nombre2 + " ";	
			}
			else {
				ajoutImpair = ajoutImpair + nombre2 + " ";
				}
			nombre2++;
		}
		nombrePair = nombrePair + ajoutPair;
		nombreImpair = nombreImpair + ajoutImpair;
		System.out.println(nombrePair);
		System.out.println(nombreImpair);
	}

}

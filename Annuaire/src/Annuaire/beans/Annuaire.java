package Annuaire.beans;

public class Annuaire {

		private Annuaire(){}
		
		//Cr�ation de l'instance unique
		private static Annuaire annuaire = new Annuaire();		
		
		private static Annuaire getAnnuaire(){
			return annuaire;
		}
}
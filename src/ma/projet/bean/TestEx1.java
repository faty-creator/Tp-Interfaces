package ma.projet.bean;

import java.util.Date;

public class TestEx1 {
	public static void main(String[] args) {
		Personne directeur = new Personne("Salmi", "Karim", new Date(), 20000);
		Personne employe = new Personne("Ben", "Ali", new Date(), 15000);

		directeur.affiche();
		employe.affiche();
	}
}

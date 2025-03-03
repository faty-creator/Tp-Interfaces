package ma.projet.bean;

import java.util.Date;

import ma.projet.inter.IPersonne;

public class Personne implements IPersonne {
	private int id;
	private String nom;
	private String prenom;
	private Date dateNaiss;
	private double salaire;
	private static int comp = 0;

	public Personne(String nom, String prenom, Date dateNaiss, double salaire) {
		super();
		this.id = ++comp;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.salaire = salaire;
	}

	@Override
	public void affiche() {
		System.out.println("Je suis "
				+ (nom.equalsIgnoreCase("Salmi") && prenom.equalsIgnoreCase("Karim") ? "le directeur " : "l'employé ")
				+ prenom.toUpperCase() + " " + nom.substring(1).toUpperCase() + "  né le " + dateNaiss
				+ "  mon salaire est " + calculerSalaire() + "dh");

	}

	@Override
	public double calculerSalaire() {
		if (nom.equalsIgnoreCase("Salmi") && prenom.equalsIgnoreCase("Karim")) {
			return salaire * 1.2;
		} else {
			return salaire * 1.1;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}

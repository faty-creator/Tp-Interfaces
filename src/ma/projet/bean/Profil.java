package ma.projet.bean;

import java.util.ArrayList;
import java.util.List;

public class Profil {
	private int id;
	private String code;
	private String libelle;
	private List<Personne> users;

	private static int comp = 0;

	public Profil(String code, String libelle) {
		super();
		this.id = ++comp;
		this.code = code;
		this.libelle = libelle;
		this.users = new ArrayList<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Personne> getUsers() {
		return users;
	}

	public void setUsers(List<Personne> users) {
		this.users = users;
	}

}

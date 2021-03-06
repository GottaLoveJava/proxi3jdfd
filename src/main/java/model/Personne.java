package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Cette classe est responsable de la modélisation d'une Personne (Client uniquement dans cette version)
 * 
 * @author Francois Destremau, Jean Deglaire
 * @version v3.0
 *
 *
 *
 */
@Entity
@Table(name = "Personne")
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne implements Serializable {

	private static final long serialVersionUID = -1108369318863008217L;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String nom;
	private String prenom;

	public Personne() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
}

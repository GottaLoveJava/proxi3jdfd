package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Cette classe est responsable de la mod�lisation des Comptes courants
 * 
 * @author Francois Destremau, Jean Deglaire
 * @version v3.0
 *
 *          
 *
 */
@Entity
@Table(name = "COMPTE_COURANT")
@PrimaryKeyJoinColumn(name = "id")
public class CompteCourant extends Compte implements Serializable {

	private static final long serialVersionUID = -6529403517496177319L;
	private double limiteDecouvert;
	@OneToOne(mappedBy = "compteCourant")
	private Client client;

	public double getLimiteDecouvert() {
		return limiteDecouvert;
	}

	public void setLimiteDecouvert(double limiteDecouvert) {
		this.limiteDecouvert = limiteDecouvert;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte n� : " + this.getId() + " / Propri�taire : " + this.client.getNom() + " / Solde : "
				+ this.getSolde();
	}

}

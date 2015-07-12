package com.project.easypool.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Etape implements Serializable {
	
	@Id
	@GeneratedValue
	private int idEtape;
	private short numero;
	private String ville;
	
	@ManyToOne
	private Trajet trajet;
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Etape() {
		super();
	}
	
	public Etape(short numero, String ville, Trajet trajet) {
		super();
		this.numero = numero;
		this.ville = ville;
		this.trajet = trajet;
	}

	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////
	
	public short getNumero() {
		return numero;
	}

	public int getIdEtape() {
		return idEtape;
	}

	public void setIdEtape(int idEtape) {
		this.idEtape = idEtape;
	}

	public String getVille() {
		return ville;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setNumero(short numero) {
		this.numero = numero;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	@Override
	public String toString() {
		return "Etape [idEtape=" + idEtape + ", numero=" + numero + ", ville="
				+ ville + ", trajet=" + trajet + "]";
	}

}

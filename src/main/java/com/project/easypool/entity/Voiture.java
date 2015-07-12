package com.project.easypool.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Voiture implements Serializable {
	
	@Id
	@GeneratedValue
	private int idVoiture;
	private String modele;
	private byte nombrePlaces;
	
	@OneToOne
	@JoinColumn(name="idTrajet")
	private Trajet trajet;
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Voiture() {
		super();
	}

	public Voiture(String modele, byte nombrePlaces, Trajet trajet) {
		super();
		this.modele = modele;
		this.nombrePlaces = nombrePlaces;
		this.trajet = trajet;
	}

	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////
	
	public int getIdVoiture() {
		return idVoiture;
	}

	public String getModele() {
		return modele;
	}

	public byte getNombrePlaces() {
		return nombrePlaces;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public void setNombrePlaces(byte nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", modele=" + modele
				+ ", nombrePlaces=" + nombrePlaces + ", trajet=" + trajet + "]";
	}
	
}

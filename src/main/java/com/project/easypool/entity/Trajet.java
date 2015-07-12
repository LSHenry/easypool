package com.project.easypool.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Trajet implements Serializable {

	@Id
	@GeneratedValue
	private int idtrajet;
	private Date dateCreation;
	private Date dateTrajet;
	private String lieuDepart;
	private String villeDepart;
	private String lieuArrivee;
	private String villeArrivee;
	private double prix;
	
	@ManyToOne
	private Utilisateur conducteur;
	
	@OneToOne
	@JoinColumn(name="idVoiture")
	private Voiture voiture;
	
	@OneToMany(mappedBy="trajet")
	private List<Etape> etapes = new ArrayList<Etape>();

	@OneToMany(mappedBy="trajet")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	@OneToMany(mappedBy="trajet")
	private List<Commentaire> commentaires = new ArrayList<Commentaire>();
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Trajet() {
		super();
	}
	
	public Trajet(Date dateCreation, Date dateTrajet, String lieuDepart,
			String villeDepart, String lieuArrivee, String villeArrivee,
			int prix, Utilisateur conducteur, Voiture voiture,
			List<Etape> etapes, List<Reservation> reservations,
			List<Commentaire> commentaires) {
		super();
		this.dateCreation = dateCreation;
		this.dateTrajet = dateTrajet;
		this.lieuDepart = lieuDepart;
		this.villeDepart = villeDepart;
		this.lieuArrivee = lieuArrivee;
		this.villeArrivee = villeArrivee;
		this.prix = prix;
		this.conducteur = conducteur;
		this.voiture = voiture;
		this.etapes = etapes;
		this.reservations = reservations;
		this.commentaires = commentaires;
	}

	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////
	
	public int getIdtrajet() {
		return idtrajet;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Date getDateTrajet() {
		return dateTrajet;
	}

	public String getLieuDepart() {
		return lieuDepart;
	}

	public String getVilleDepart() {
		return villeDepart;
	}

	public String getLieuArrivee() {
		return lieuArrivee;
	}

	public String getVilleArrivee() {
		return villeArrivee;
	}

	public double getPrix() {
		return prix;
	}

	public Utilisateur getConducteur() {
		return conducteur;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public List<Etape> getEtapes() {
		return etapes;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setIdtrajet(int idtrajet) {
		this.idtrajet = idtrajet;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setDateTrajet(Date dateTrajet) {
		this.dateTrajet = dateTrajet;
	}

	public void setLieuDepart(String lieuDepart) {
		this.lieuDepart = lieuDepart;
	}

	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;
	}

	public void setLieuArrivee(String lieuArrivee) {
		this.lieuArrivee = lieuArrivee;
	}

	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public void setConducteur(Utilisateur conducteur) {
		this.conducteur = conducteur;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}

	public void setEtapes(List<Etape> etapes) {
		this.etapes = etapes;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Trajet [idtrajet=" + idtrajet + ", dateCreation="
				+ dateCreation + ", dateTrajet=" + dateTrajet + ", lieuDepart="
				+ lieuDepart + ", villeDepart=" + villeDepart
				+ ", lieuArrivee=" + lieuArrivee + ", villeArrivee="
				+ villeArrivee + ", prix=" + prix + ", conducteur="
				+ conducteur + ", voiture=" + voiture + ", etapes=" + etapes
				+ ", reservations=" + reservations + ", commentaires="
				+ commentaires + "]";
	}
	
}

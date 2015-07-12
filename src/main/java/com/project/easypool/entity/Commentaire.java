package com.project.easypool.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Commentaire implements Serializable {
	
	@Id
	@GeneratedValue
	private int idCommentaire;
	private String commentaire;
	private short notation;
	private Date dateCreation;
	private Date dateModification;
	
	@ManyToOne
	private Utilisateur etudiant;
	
	@ManyToOne
	private Trajet trajet;
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Commentaire() {
		super();
	}

	public Commentaire(String commentaire, short notation, Date dateCreation,
			Date dateModification, Utilisateur etudiant, Trajet trajet) {
		super();
		this.commentaire = commentaire;
		this.notation = notation;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.etudiant = etudiant;
		this.trajet = trajet;
	}

	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////

	public int getIdCommentaire() {
		return idCommentaire;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public int getNotation() {
		return notation;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public Utilisateur getEtudiant() {
		return etudiant;
	}

	public Trajet getTrajet() {
		return trajet;
	}

	public void setIdCommentaire(int idCommentaire) {
		this.idCommentaire = idCommentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public void setNotation(short notation) {
		this.notation = notation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public void setEtudiant(Utilisateur etudiant) {
		this.etudiant = etudiant;
	}

	public void setTrajet(Trajet trajet) {
		this.trajet = trajet;
	}

	@Override
	public String toString() {
		return "Commentaire [idCommentaire=" + idCommentaire + ", commentaire="
				+ commentaire + ", notation=" + notation + ", dateCreation="
				+ dateCreation + ", dateModification=" + dateModification
				+ ", etudiant=" + etudiant + ", trajet=" + trajet + "]";
	}
}

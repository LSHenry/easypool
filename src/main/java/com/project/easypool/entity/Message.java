package com.project.easypool.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Message implements Serializable {
	
	@Id
	@GeneratedValue
	private int idMessage;
	private Date dateCreation;
	private Date dateModification;
	private String objet;
	private String message;
	
	@ManyToOne
	private Utilisateur expediteur;
	private Utilisateur destinataire;
	
	//////////////////////////////////////////////////////////////// Constructeurs ////////////////////////////////////////////////////////////////
	
	public Message() {
		super();
	}

	public Message(Date dateCreation, Date dateModification, String objet,
			String message, Utilisateur expediteur, Utilisateur destinataire) {
		super();
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.objet = objet;
		this.message = message;
		this.expediteur = expediteur;
		this.destinataire = destinataire;
	}

	//////////////////////////////////////////////////////////////// Getters + Setters ////////////////////////////////////////////////////////////////
	
	public int getIdMessage() {
		return idMessage;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public String getObjet() {
		return objet;
	}

	public String getMessage() {
		return message;
	}

	public Utilisateur getExpediteur() {
		return expediteur;
	}

	public Utilisateur getDestinataire() {
		return destinataire;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setExpediteur(Utilisateur expediteur) {
		this.expediteur = expediteur;
	}

	public void setDestinataire(Utilisateur destinataire) {
		this.destinataire = destinataire;
	}

	@Override
	public String toString() {
		return "Message [idMessage=" + idMessage + ", dateCreation="
				+ dateCreation + ", dateModification=" + dateModification
				+ ", objet=" + objet + ", message=" + message + ", expediteur="
				+ expediteur + ", destinataire=" + destinataire + "]";
	}
}

package com.project.easypool.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Profil implements Serializable {

		@Id
		@GeneratedValue
		private int idProfil;
		private String adresse1;
		private String adresse2;
		private String adresse3;
		private String codePostal;
		private String ville;		
		private String numeroPortable;
		private String adresseMail;		
		private Date dateCreation;
		private Date dateModification;
		private int age;
		private boolean conducteur;
		private boolean fumeur;
		private short notation;
		
		@OneToOne
		@JoinColumn(name="etudiant")
		private Utilisateur etudiant;
		
		//////////////////////////////////////////////////////////////// Constructeurs 		////////////////////////////////////////////////////////////////
		
		public Profil() {
			super();
		}

		public Profil(String adresse1, String adresse2, String adresse3,
				String codePostal, String ville, String numeroPortable,
				String adresseMail, Date dateCreation, Date dateModification,
				int age, boolean conducteur, boolean fumeur, short notation,
				Utilisateur etudiant) {
			super();
			this.adresse1 = adresse1;
			this.adresse2 = adresse2;
			this.adresse3 = adresse3;
			this.codePostal = codePostal;
			this.ville = ville;
			this.numeroPortable = numeroPortable;
			this.adresseMail = adresseMail;
			this.dateCreation = dateCreation;
			this.dateModification = dateModification;
			this.age = age;
			this.conducteur = conducteur;
			this.fumeur = fumeur;
			this.notation = notation;
			this.etudiant = etudiant;
		}
		
		//////////////////////////////////////////////////////////////// Getters + Setters 		//////////////////////////////////////////////////////////
		
		public int getIdProfil() {
			return idProfil;
		}

		public String getAdresse1() {
			return adresse1;
		}

		public String getAdresse2() {
			return adresse2;
		}

		public String getAdresse3() {
			return adresse3;
		}

		public String getCodePostal() {
			return codePostal;
		}

		public String getVille() {
			return ville;
		}

		public String getNumeroPortable() {
			return numeroPortable;
		}

		public String getAdresseMail() {
			return adresseMail;
		}

		public Date getDateCreation() {
			return dateCreation;
		}

		public Date getDateModification() {
			return dateModification;
		}

		public int getAge() {
			return age;
		}

		public boolean getConducteur() {
			return conducteur;
		}

		public boolean getFumeur() {
			return fumeur;
		}

		public int getNotation() {
			return notation;
		}

		public Utilisateur getEtudiant() {
			return etudiant;
		}

		public void setIdProfil(int idProfil) {
			this.idProfil = idProfil;
		}

		public void setAdresse1(String adresse1) {
			this.adresse1 = adresse1;
		}

		public void setAdresse2(String adresse2) {
			this.adresse2 = adresse2;
		}

		public void setAdresse3(String adresse3) {
			this.adresse3 = adresse3;
		}

		public void setCodePostal(String codePostal) {
			this.codePostal = codePostal;
		}

		public void setVille(String ville) {
			this.ville = ville;
		}

		public void setNumeroPortable(String numeroPortable) {
			this.numeroPortable = numeroPortable;
		}

		public void setAdresseMail(String adresseMail) {
			this.adresseMail = adresseMail;
		}

		public void setDateCreation(Date dateCreation) {
			this.dateCreation = dateCreation;
		}

		public void setDateModification(Date dateModification) {
			this.dateModification = dateModification;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setConducteur(boolean conducteur) {
			this.conducteur = conducteur;
		}

		public void setFumeur(boolean fumeur) {
			this.fumeur = fumeur;
		}

		public void setNotation(short notation) {
			this.notation = notation;
		}

		public void setEtudiant(Utilisateur etudiant) {
			this.etudiant = etudiant;
		}

		@Override
		public String toString() {
			return "Profil [idProfil=" + idProfil + ", adresse1=" + adresse1
					+ ", adresse2=" + adresse2 + ", adresse3=" + adresse3
					+ ", codePostal=" + codePostal + ", ville=" + ville
					+ ", numeroPortable=" + numeroPortable + ", adresseMail="
					+ adresseMail + ", dateCreation=" + dateCreation
					+ ", dateModification=" + dateModification + ", age=" + age
					+ ", conducteur=" + conducteur + ", fumeur=" + fumeur
					+ ", notation=" + notation + ", etudiant=" + etudiant + "]";
		}
}

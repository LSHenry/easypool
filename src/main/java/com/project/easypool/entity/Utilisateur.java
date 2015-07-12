package com.project.easypool.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Utilisateur implements Serializable {

		@Id
		@GeneratedValue
		private int idUtilisateur;
		private boolean admin;
		private boolean actif;
		private String nom;
		private String prenom;
		private String login;
		private String password;
		
		@OneToOne
		@JoinColumn(name="idProfil")
		private Profil profil;
		
		@OneToMany(mappedBy="conducteur")
		private List<Trajet> trajets = new ArrayList<Trajet>();
		
		@OneToMany(mappedBy="passager")
		private List<Reservation> reservations = new ArrayList<Reservation>();
		
		@OneToMany(mappedBy="etudiant")
		private List<Commentaire> commentaires = new ArrayList<Commentaire>();
		
		@OneToMany(mappedBy="destinataire")
		private List<Message> messages = new ArrayList<Message>();
		
		////////////////////////////////////////////////////////////////  Constructeurs ////////////////////////////////////////////////////////////////
		
		public Utilisateur() {
			super();
		}

		public Utilisateur(boolean admin, boolean actif, String nom, String prenom,
				String login, String password, Profil profil,
				List<Trajet> trajets, List<Reservation> reservations,
				List<Commentaire> commentaires, List<Message> messages) {
			super();
			this.admin = admin;
			this.actif = actif;
			this.nom = nom;
			this.prenom = prenom;
			this.login = login;
			this.password = password;
			this.profil = profil;
			this.trajets = trajets;
			this.reservations = reservations;
			this.commentaires = commentaires;
			this.messages = messages;
		}

		//////////////////////////////////////////////////////////////// Getters + Setters  ////////////////////////////////////////////////////////
		
		public int getIdUtilisateur() {
			return idUtilisateur;
		}

		public boolean getAdmin() {
			return admin;
		}

		public boolean getActif() {
			return actif;
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public String getLogin() {
			return login;
		}

		public String getPassword() {
			return password;
		}

		public Profil getProfil() {
			return profil;
		}

		public List<Trajet> getTrajets() {
			return trajets;
		}

		public List<Reservation> getReservations() {
			return reservations;
		}

		public List<Commentaire> getCommentaires() {
			return commentaires;
		}

		public List<Message> getMessages() {
			return messages;
		}

		public void setIdUtilisateur(int idUtilisateur) {
			this.idUtilisateur = idUtilisateur;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		public void setActif(boolean actif) {
			this.actif = actif;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public void setProfil(Profil profil) {
			this.profil = profil;
		}

		public void setTrajets(List<Trajet> trajets) {
			this.trajets = trajets;
		}

		public void setReservations(List<Reservation> reservations) {
			this.reservations = reservations;
		}

		public void setCommentaires(List<Commentaire> commentaires) {
			this.commentaires = commentaires;
		}

		public void setMessages(List<Message> messages) {
			this.messages = messages;
		}

		@Override
		public String toString() {
			return "Utilisateur [idUtilisateur=" + idUtilisateur + ", admin="
					+ admin + ", actif=" + actif + ", nom=" + nom + ", prenom="
					+ prenom + ", login=" + login + ", password=" + password
					+ ", profil=" + profil + ", trajets=" + trajets
					+ ", reservations=" + reservations + ", commentaires="
					+ commentaires + ", messages=" + messages + "]";
		}
}

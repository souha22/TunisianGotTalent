package tunisiangottalent.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class Utilisateur {

	// Fields

	protected Double idUtilisateur;
	protected String nom;
	protected String prenom;
	protected String cin;
	protected String profession;
	protected String mail;
	protected String adresse;
	protected String tel;
	protected String sexe;
	protected String type;
	protected String talent;
	protected String password;
	protected Date dateNaissance;
	
	// Constructors

	/** default constructor */
	public Utilisateur() {
	}

	/** minimal constructor */
	public Utilisateur(Double idUtilisateur, String nom, String prenom,
			String cin, String profession, String mail, String sexe,
			String type, String talent, String password, Date dateNaissance) {
            
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.profession = profession;
		this.mail = mail;
		this.sexe = sexe;
		this.type = type;
		this.talent = talent;
		this.password = password;
		this.dateNaissance = dateNaissance;
	}

	

	// Property accessors
	 
	public Double getIdUtilisateur() {
		return this.idUtilisateur;
	}

	public void setIdUtilisateur(Double idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

 	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

 	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

 	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

 	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

 	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

 	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

 	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

 	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

 	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

 	public String getTalent() {
		return this.talent;
	}

	public void setTalent(String talent) {
		this.talent = talent;
	}

 	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

 	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}



}
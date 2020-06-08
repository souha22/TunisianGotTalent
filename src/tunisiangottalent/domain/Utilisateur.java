package tunisiangottalent.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class Utilisateur {

	// Fields

	private Double idUtilisateur;
	private String nom;
	private String prenom;
	private String cin;
	private String profession;
	private String mail;
	private String adresse;
	private String tel;
	private String sexe;
	private String type;
	private String talent;
	private String password;
	private Date dateNaissance;
	private Set<SeanceCoaching> seanceCoachings = new HashSet<SeanceCoaching>(0);
	private Set<Evenement> evenements = new HashSet<Evenement>(0);
	private Set<SeanceCoaching> seanceCoachings_1 = new HashSet<SeanceCoaching>(
			0);
	private Set<Fichier> fichiers = new HashSet<Fichier>(0);
	private Set<Reclamation> reclamations = new HashSet<Reclamation>(0);

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

	/** full constructor */
	public Utilisateur(Double idUtilisateur, String nom, String prenom,
			String cin, String profession, String mail, String adresse,
			String tel, String sexe, String type, String talent,
			String password, Date dateNaissance,
			Set<SeanceCoaching> seanceCoachings, Set<Evenement> evenements,
			Set<SeanceCoaching> seanceCoachings_1, Set<Fichier> fichiers,
			Set<Reclamation> reclamations) {
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.profession = profession;
		this.mail = mail;
		this.adresse = adresse;
		this.tel = tel;
		this.sexe = sexe;
		this.type = type;
		this.talent = talent;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.seanceCoachings = seanceCoachings;
		this.evenements = evenements;
		this.seanceCoachings_1 = seanceCoachings_1;
		this.fichiers = fichiers;
		this.reclamations = reclamations;
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

	public Set<SeanceCoaching> getSeanceCoachings() {
		return this.seanceCoachings;
	}

	public void setSeanceCoachings(Set<SeanceCoaching> seanceCoachings) {
		this.seanceCoachings = seanceCoachings;
	}

 	public Set<Evenement> getEvenements() {
		return this.evenements;
	}

	public void setEvenements(Set<Evenement> evenements) {
		this.evenements = evenements;
	}

 	public Set<SeanceCoaching> getSeanceCoachings_1() {
		return this.seanceCoachings_1;
	}

	public void setSeanceCoachings_1(Set<SeanceCoaching> seanceCoachings_1) {
		this.seanceCoachings_1 = seanceCoachings_1;
	}

 	public Set<Fichier> getFichiers() {
		return this.fichiers;
	}

	public void setFichiers(Set<Fichier> fichiers) {
		this.fichiers = fichiers;
	}

 	public Set<Reclamation> getReclamations() {
		return this.reclamations;
	}

	public void setReclamations(Set<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

}
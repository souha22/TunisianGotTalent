package tunisiangottalent.domain;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class Evenement  {

	// Fields

	private int idEv;
	private String libelle;
	private String lieu;
	private Date dateDebut;
	private Date dateFin;
	private int idOrganisateur;
	private Set<Spectateur> Spectateur = new HashSet<Spectateur>(0);
        private Set<Candidat> Candidat = new Hashset<Candidat> (0);
        private Set<Jury> Jury = new Hashset <Jury> (0);
        
        

	// Constructors

	/** default constructor */
	public Evenement() {
	}

	/** minimal constructor */
	public Evenement(int idEv, String libelle, String lieu,
			Date dateDebut, Date dateFin, Double idOrganisateur) {
		this.idEv = idEv;
		this.libelle = libelle;
		this.lieu = lieu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		
	}

	/** full constructor */
	public Evenement(Double idEv, String libelle, String lieu,
			Date dateDebut, Date dateFin, Double idOrganisateur,
			Set<Utilisateur> utilisateurs) {
		this.idEv = idEv;
		this.libelle = libelle;
		this.lieu = lieu;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.Jury= Jury;
                this.Candidat = Candidat;
                this.Spectateur = Spectateur;
	}

	// Property accessors

	public Double getIdEv() {
		return this.idEv;
	}

	public void setIdEv(Double idEv) {
		this.idEv = idEv;
	}

	
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	
	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	
	public Double getIdOrganisateur() {
		return this.idOrganisateur;
	}

	public void setIdOrganisateur(Double idOrganisateur) {
		this.idOrganisateur = idOrganisateur;
	}

	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
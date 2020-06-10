package tunisiangottalent.domain;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class SeanceCoaching implements java.io.Serializable {

	// Fields

	private Double idSeance;
	private Utilisateur utilisateur;
	private Date dateDebut;
	private Date dateFin;
	private String lieu;
	private String type;
	private Set<Utilisateur> utilisateurs = new HashSet<Utilisateur>(0);

	// Constructors

	/** default constructor */
	public SeanceCoaching() {
	}

	/** minimal constructor */
	public SeanceCoaching(Double idSeance, Utilisateur utilisateur,
			Date dateDebut, Date dateFin, String lieu, String type) {
		this.idSeance = idSeance;
		this.utilisateur = utilisateur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.type = type;
	}

	/** full constructor */
	public SeanceCoaching(Double idSeance, Utilisateur utilisateur,
			Date dateDebut, Date dateFin, String lieu, String type,
			Set<Utilisateur> utilisateurs) {
		this.idSeance = idSeance;
		this.utilisateur = utilisateur;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.lieu = lieu;
		this.type = type;
		this.utilisateurs = utilisateurs;
	}

	// Property accessors
	 
	public Double getIdSeance() {
		return this.idSeance;
	}

	public void setIdSeance(Double idSeance) {
		this.idSeance = idSeance;
	}
 
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
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

	 
	public String getLieu() {
		return this.lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

 	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

 	public Set<Utilisateur> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(Set<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
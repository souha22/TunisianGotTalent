package tunisiangottalent.domain;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Fichier implements java.io.Serializable {

	// Fields

	private Double idFichier;
	private Utilisateur utilisateur;
	private String taille;
	private String type;
	private Date date;
	private Set<Vote> votes = new HashSet<Vote>(0);

	// Constructors

	/** default constructor */
	public Fichier() {
	}

	/** minimal constructor */
	public Fichier(Double idFichier, Utilisateur utilisateur, String taille,
			String type, Date date) {
		this.idFichier = idFichier;
		this.utilisateur = utilisateur;
		this.taille = taille;
		this.type = type;
		this.date = date;
	}

	/** full constructor */
	public Fichier(Double idFichier, Utilisateur utilisateur, String taille,
			String type, Date date, Set<Vote> votes) {
		this.idFichier = idFichier;
		this.utilisateur = utilisateur;
		this.taille = taille;
		this.type = type;
		this.date = date;
		this.votes = votes;
	}

	
	public Double getIdFichier() {
		return this.idFichier;
	}

	public void setIdFichier(Double idFichier) {
		this.idFichier = idFichier;
	}

	
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	public String getTaille() {
		return this.taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}


	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Vote> getVotes() {
		return this.votes;
	}

	public void setVotes(Set<Vote> votes) {
		this.votes = votes;
	}

}
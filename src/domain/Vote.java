package tunisiangottalent.domain;






public class Vote   {

	// Fields

	private Double idVote;
	private Fichier fichier;
	private Double jaime;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** full constructor */
	public Vote(Double idVote, Fichier fichier, Double jaime) {
		this.idVote = idVote;
		this.fichier = fichier;
		this.jaime = jaime;
	}

	// Property accessors
	 
	public Double getIdVote() {
		return this.idVote;
	}

	public void setIdVote(Double idVote) {
		this.idVote = idVote;
	}

	 
	public Fichier getFichier() {
		return this.fichier;
	}

	public void setFichier(Fichier fichier) {
		this.fichier = fichier;
	}

 	public Double getJaime() {
		return this.jaime;
	}

	public void setJaime(Double jaime) {
		this.jaime = jaime;
	}

}
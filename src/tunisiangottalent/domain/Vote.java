package tunisiangottalent.domain;

import java.util.Objects;






public class Vote   {

	// Fields

	private Double idVote;
	private Fichier fichier;
	private Boolean jaime;
        private String commontaire;

	// Constructors

	/** default constructor */
	public Vote() {
	}

	/** full constructor
     * @param idVote
     * @param fichier
     * @param jaime
     * @param commontaire */
	public Vote(Double idVote, Fichier fichier, Boolean jaime, String commontaire) {
		this.idVote = idVote;
		this.fichier = fichier;
		this.jaime = jaime;
                this.commontaire=commontaire;
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

    public Boolean getJaime() {
        return jaime;
    }

    public void setJaime(Boolean jaime) {
        this.jaime = jaime;
    }

    public String getCommontaire() {
        return commontaire;
    }

    public void setCommontaire(String commontaire) {
        this.commontaire = commontaire;
    }

    @Override
    public String toString() {
        return "Vote{" + "idVote=" + idVote + ", fichier=" + fichier + ", jaime=" + jaime + ", commontaire=" + commontaire + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idVote);
        hash = 29 * hash + Objects.hashCode(this.fichier);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vote other = (Vote) obj;
        if (!Objects.equals(this.commontaire, other.commontaire)) {
            return false;
        }
        if (!Objects.equals(this.idVote, other.idVote)) {
            return false;
        }
        if (!Objects.equals(this.fichier, other.fichier)) {
            return false;
        }
        if (!Objects.equals(this.jaime, other.jaime)) {
            return false;
        }
        return true;
    }

 	

}
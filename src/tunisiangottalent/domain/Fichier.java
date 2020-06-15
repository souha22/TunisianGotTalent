package tunisiangottalent.domain;



import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


public class Fichier implements java.io.Serializable {

	// Fields
       
	private int idFichier;
        private String url;
	private String type;
	private Date date;
        private Candidat idcandidat;
	private Set<Vote> votes = new HashSet<Vote>(0);

	// Constructors

	/** default constructor */
	public Fichier() {
	}

	/** minimal constructor */
	
	public Fichier(int idFichier, String url, String type, Date date, Candidat idcandidat) {
        this.idFichier = idFichier;
        this.url = url;
        this.type = type;
        this.date = date;
        this.idcandidat = idcandidat;
	}

    public Fichier(String url, String type, Date date, Candidat idcandidat) {
        this.url = url;
        this.type = type;
        this.date = date;
        this.idcandidat = idcandidat;
        
    }

    public int getIdFichier() {
        return idFichier;
    }

    public void setIdFichier(int idFichier) {
        this.idFichier = idFichier;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Candidat getIdcandidat() {
        return idcandidat;
    }

    public void setIdcandidat(Candidat idcandidat) {
        this.idcandidat = idcandidat;
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
package tunisiangottalent.domain;



import java.sql.Date;
import java.util.HashSet;
import java.util.Set;


public class SeanceCoaching implements java.io.Serializable {

	// Fields

	private int id_seance;
	private Jury jury;
	private Date date_debut;
	private Date date_Fin;
	private String lieu;
	private String type;
	private Set<Candidat> utilisateurs = new HashSet<Candidat>(0);
       

	// Constructors

	/** default constructor */
	public SeanceCoaching() {
	}

    public SeanceCoaching(int id_seance, Date date_debut, Date date_Fin, String lieu, String type) {
        this.id_seance = id_seance;
        this.date_debut = date_debut;
        this.date_Fin = date_Fin;
        this.lieu = lieu;
        this.type = type;
    }

    public int getId_seance() {
        return id_seance;
    }

    public void setId_seance(int id_seance) {
        this.id_seance = id_seance;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_Debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_Fin() {
        return date_Fin;
    }

    public void setDate_Fin(Date date_Fin) {
        this.date_Fin = date_Fin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Candidat> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(Set<Candidat> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    @Override
    public String toString() {
        return "SeanceCoaching{" + "id_seance=" + id_seance + ", jury=" + jury + ", date_debut=" + date_debut + ", date_Fin=" + date_Fin + ", lieu=" + lieu + ", type=" + type + ", utilisateurs=" + utilisateurs + '}';
    }
    
  
 
}
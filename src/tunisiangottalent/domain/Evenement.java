package tunisiangottalent.domain;



import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;
import java.sql.Date;




public class Evenement  {

	// Fields

	private int idEv;
	private String libelle;
	private String lieu;
	private Date date_debut;
	private Date date_fin;
        private int nb_place;
//	private Set<Spectateur> Spectateur = new HashSet<Spectateur>(0);
//      private Set<Candidat> Candidat = new Hashset<Candidat> (0);
//      private Set<Jury> Jury = new Hashset <Jury> (0);
        
        

	// Constructors

	/** default constructor */
	public Evenement() {
	}
        
        
        /** Full constructor */

        public Evenement(int idEv, String libelle, String lieu, Date date_debut, Date date_fin, int nb_place) {
        this.idEv = idEv;
        this.libelle = libelle;
        this.lieu = lieu;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.nb_place = nb_place;
        }


	/** without id constructor */
	public Evenement(String libelle, String lieu,Date dateDebut, Date dateFin,int nb_place)
        {
    		
		this.libelle = libelle;
		this.lieu = lieu;
		this.date_debut = dateDebut;
		this.date_fin = dateFin;
                this.nb_place =nb_place;

	}

	// Property accessors ( Getter Setter ToString)

	public int getIdEv() {
		return this.idEv;
	}

	public void setIdEv(int idEv) {
		this.idEv = idEv;
	}

    public int getNb_place() {
        return nb_place;
    }

    public void setNb_place(int nb_place) {
        this.nb_place = nb_place;
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

	
  public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return "Evenement{" + "idEv=" + idEv + ", libelle=" + libelle + ", lieu=" + lieu + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", nb_place=" + nb_place + '}';
    }
        
        
}
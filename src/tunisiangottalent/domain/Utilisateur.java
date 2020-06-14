package tunisiangottalent.domain;





public class Utilisateur {

	// Fields

	protected int id;
	protected String nom;
	protected String prenom;
	protected String cin;
	protected String mail;
	protected String adresse;
	protected String tel;
	protected String sexe;
	protected String password;
        protected String type;

    public Utilisateur() {
    }

    public Utilisateur(int id, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
        this.sexe = sexe;
        this.password = password;
        this.type = type;
    }

    public Utilisateur(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
        this.sexe = sexe;
        this.password = password;
        this.type = type;
    }

    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", mail=" + mail + ", adresse=" + adresse + ", tel=" + tel + ", sexe=" + sexe + ", password=" + password + ", type=" + type;
    }

    

   
}
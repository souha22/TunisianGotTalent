/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;

/**
 *
 * @author KA
 */
public class Administrateur {
        /**
     * Declation variable
     */
    private int IdAdmin;
    private String nom, prenom, login, Password;

    
    public Administrateur(int idAdmin, String nom, String prenom, String login, String password) {
        super();
        this.IdAdmin = idAdmin;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.Password = password;
    }

    public Administrateur(String login, String password) {
        this.login = login;
        this.Password = password;
    }

    public Administrateur() {
    }

    public int getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(int IdAdmin) {
        this.IdAdmin = IdAdmin;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

  

    @Override
    public String toString() {
        return "Administrateur : idAdmin=" + IdAdmin + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login
                + ", Password=" + Password;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;

import tunisiangottalent.domain.Utilisateur;
import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author KA
 */
public class Spectateur extends Utilisateur{
    private Date DateNaissance;

    public Spectateur() {
        super();
    }

    public Spectateur(int id, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,Date DateNaissanc) {
        super(id, nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.DateNaissance = DateNaissance;
    }

    public Spectateur(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,Date DateNaissance) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.DateNaissance = DateNaissance;
    }

    public Spectateur(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password,Date DateNaissance) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password);
        this.DateNaissance = DateNaissance;
    }
    
    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(Date DateNaissance) {
        this.DateNaissance = DateNaissance;
    }
    
      @Override
    public String toString() {
        return "Spectateur : " + super.toString() + " Date de naissance  : " + DateNaissance;
    
    }
}

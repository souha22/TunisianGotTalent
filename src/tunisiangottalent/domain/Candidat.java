/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;

import tunisiangottalent.domain.Utilisateur;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author KA
 */
public class Candidat extends Utilisateur{
    private Date dateNaissance;
    private String talent;
  

    public Candidat() {
        super();
    }

    public Candidat(Date dateNaissance, String talent, int id, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type) {
        super(id, nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.dateNaissance = dateNaissance;
        this.talent = talent;
    }

    public Candidat(Date dateNaissance, String talent, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.dateNaissance = dateNaissance;
        this.talent = talent;
    }

   
    

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

      @Override
    public String toString() {
        return "Candidat " + super.toString() + "Date de naissance  : " + dateNaissance+ " Talent : " +talent;
    
    }

} 
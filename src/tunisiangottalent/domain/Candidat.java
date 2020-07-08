/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;


import java.util.Calendar;
import java.sql.Date;
import java.time.LocalDate;

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

    public Candidat(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password,Date dateNaissance, String talent) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password);
        this.dateNaissance = dateNaissance;
        this.talent = talent;
    }

    public Candidat(int id, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,Date dateNaissance, String talent) {
        super(id, nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.dateNaissance = dateNaissance;
        this.talent = talent;
    }

    public Candidat(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,Date dateNaissance, String talent) {
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
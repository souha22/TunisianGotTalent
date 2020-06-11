/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author KA
 */
public class Candidat extends Utilisateur{
    private Date dateNaissance;
    private String talent;
    private String sexe;

    public Candidat() {
        super();
    }

    public Candidat(Date dateNaissance, String talent, String sexe, Double id, String nom, String prenom, String cin, String mail, String adresse, String tel, String password) {
        super(id, nom, prenom, cin, mail, adresse, tel, password);
        this.dateNaissance = dateNaissance;
        this.talent = talent;
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        Calendar calendar = Calendar.getInstance();
        if ( calendar.get( Calendar.MONTH )==Calendar.JANUARY ) { 
        ystem.out.prinln("la date courante est en janvier"); }
        this.dateNaissance = dateNaissance;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Candidat : " +super.toString()+ " dateNaissance=" + dateNaissance + ", talent=" + talent + ", sexe=" + sexe + '}';
    }

    

    
    

}

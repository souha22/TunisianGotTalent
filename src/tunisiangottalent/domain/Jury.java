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
public class Jury extends Utilisateur{
    private String profession;

    public Jury() {
        super();
    }

    public Jury(int id, String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,String profession) {
        super(id, nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.profession = profession;
    }

    public Jury(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password, String type,String profession) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password, type);
        this.profession = profession;
    }

    public Jury(String nom, String prenom, String cin, String mail, String adresse, String tel, String sexe, String password,String profession) {
        super(nom, prenom, cin, mail, adresse, tel, sexe, password);
        this.profession = profession;
    }
    
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "Jury : " + super.toString()+ " profession=" + profession;
    } 
    }


    
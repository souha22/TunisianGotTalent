/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.domain;

/**
 *
 * @author GTI-Laptop
 */
public class DetailEvenement {
  private Integer  id_ev;
  private Integer id_utilisateur;

    public DetailEvenement(Integer id_ev, Integer id_utilisateur) {
        this.id_ev = id_ev;
        this.id_utilisateur = id_utilisateur;
    }

    public DetailEvenement() {
    }

    public Integer getId_ev() {
        return id_ev;
    }

    public void setId_ev(Integer id_ev) {
        this.id_ev = id_ev;
    }

    public Integer getId_utilisateur() {
        return id_utilisateur;
    }

    public void setId_utilisateur(Integer id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }
  
  
}


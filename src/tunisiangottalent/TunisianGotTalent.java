/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent;

import tunisiangottalent.service.FichierService;
import java.sql.Date;
import java.sql.SQLException;
import tunisiangottalent.domain.Candidat;
import tunisiangottalent.domain.Fichier;

/**
 *
 * @author GTI-Laptop
 */
public class TunisianGotTalent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        FichierService f = new FichierService();
        Candidat c= new Candidat(Date.valueOf("2019-08-02"), "talent", "nom", "prenom", "cin", "mail", "adresse", "tel", "sexe", "password", "type");
        f.Ajouter(new Fichier("test","test",Date.valueOf("2019-08-02"),c));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;

import java.util.List;
import java.util.List;
import javafx.collections.ObservableList;

/**
 *
 * @author admin
 */
public interface InterfaceService<T> {
 


/**
 *
 * @
 * @param <T>
 */
    public void Ajouter(T o);
    public void Supprimer(T o);
    public List<T> Afficher();
    public T AfficherparId(int id);
  
    
    public boolean Modifier(T os);
    
}

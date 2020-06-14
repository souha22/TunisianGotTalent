/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;

import java.util.List;
import tunisiangottalent.domain.Reclamation;

/**
 *
 * @author GTI-Laptop
 */
public interface ReclamationService {

    public void insert(Reclamation r);

    public void delete(int id);

    public void update(Reclamation r);

    public List<Reclamation> getAll();

    public Reclamation getById(int id);
}
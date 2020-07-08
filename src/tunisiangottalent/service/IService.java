/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunisiangottalent.service;

import java.util.List;

/**
 *
 * @author admin
 */
public interface IService<T> {
   
    
    public void insert(T o);
    public void delete(T o);
    public void Update(T o);
    public List<T> displayAll();
    public T displayById(int id);
    
}

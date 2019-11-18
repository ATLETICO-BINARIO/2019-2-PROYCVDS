package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Recurso;

public interface RecursoDAO {
 
    public List<Recurso> loadAll() throws PersistenceException;
    
    public void save(Recurso b) throws PersistenceException;
    
    
}

package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.persistence.PersistenceException;

public interface RecursoDAO {
 
    public List<Recurso> loadAll() throws PersistenceException;
    
    public void save(Recurso b) throws PersistenceException;
    
    public List<Recurso> recursoPorId(int id) throws PersistenceException;
    
    
    public void cambiarEstadoMatenimiento(int id) throws PersistenceException;
    
    public List<Recurso> recursosDisponibles() throws PersistenceException;
    
    public List<Recurso> filtrarNombre(String nombre) throws PersistenceException;
    
    public List<Recurso> filtrarUbicacion(String ubicacion) throws PersistenceException;
    
    public List<Recurso> filtrarCapacidad(int capacidad) throws PersistenceException;
    
    public List<Recurso> filtrarTipo(String tipo) throws PersistenceException;
    
    
}

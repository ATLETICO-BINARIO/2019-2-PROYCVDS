package edu.eci.cvds.services;




import edu.eci.cvds.entities.Recurso;
import java.util.ArrayList;
import java.util.List;


public interface BibliotecaServices {
	

    public void insertarRecurso(Recurso elemento) throws ServicesException;
    
    public List<Recurso> consultarRecursos() throws ServicesException;
    
    public List<Recurso> recursoPorId(int id) throws ServicesException;
    
    public void cambiarEstadoMatenimiento(int id) throws ServicesException;
    
    public List recursosDisponibles() throws ServicesException;
    
    public List<Recurso> filtrarNombre(String nombre) throws ServicesException;
    
    public List<Recurso> filtrarUbicacion(String nombre) throws ServicesException;

 
}

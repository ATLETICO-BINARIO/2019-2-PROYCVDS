package edu.eci.cvds.services;




import edu.eci.cvds.entities.Recurso;
import java.util.ArrayList;
import java.util.List;


public interface BibliotecaServices {
	

    public void insertarRecurso(Recurso elemento) throws ServicesException;
    
    public List<Recurso> consultarRecursos() throws ServicesException;
    
    public List<Recurso> filtrarRecursos(Recurso recurso) throws ServicesException;
    
    public void cambiarEstadoMatenimiento(int id) throws ServicesException;

 
}

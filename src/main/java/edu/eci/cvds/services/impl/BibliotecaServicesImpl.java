/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.services.BibliotecaServices;
import edu.eci.cvds.services.ServicesException;
import java.util.ArrayList;
import java.util.List;


public class BibliotecaServicesImpl implements BibliotecaServices {
	

	@Inject
	private RecursoDAO recursoDAO;
        
        @Inject
	private ReservaDAO reservaDAO;
	
	

    /**
     * 
     * @param recurso el recurso que se quiere insertar/agregar
     * @throws ServicesException 
     */
    @Override
    public void insertarRecurso(Recurso recurso) throws ServicesException {
        try{
            recursoDAO.save(recurso);
        }catch(PersistenceException ex) {
            throw new ServicesException("Insert error:"+ex.getLocalizedMessage(), ex);
        }
        
   
    }
    /**
     * 
     * @return retorna todos los recursos
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> consultarRecursos() throws ServicesException {
        try{ 
            return recursoDAO.loadAll();
        }catch(PersistenceException ex){
            throw new ServicesException("Serch error:"+ex.getLocalizedMessage(), ex);
        }
        
    }
    /**
     * 
     * @param id id del recurso que se quiere buscar
     * @return  retorna el recurso con el que el id coincide
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> recursoPorId(int id) throws ServicesException {
        try{
            return recursoDAO.recursoPorId(id);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar error:"+ex.getLocalizedMessage(), ex);
        }
        
    }
    
    /**
     * 
     * @param id el id de que se quiere cambiar el estado de mantenimiento
     * @throws ServicesException 
     */

    @Override
    public void cambiarEstadoMatenimiento(int id) throws ServicesException {
        try{
            recursoDAO.cambiarEstadoMatenimiento(id);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar error:"+ex.getLocalizedMessage(), ex);
        }
    }
    

    /**
     * 
     * @return retorna los recursos disponibles
     * @throws ServicesException 
     */
    @Override
    public List recursosDisponibles() throws ServicesException {
        try{
            return recursoDAO.recursosDisponibles();
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar disponibles error:"+ex.getLocalizedMessage(), ex);
        }
    }
    /**
     * 
     * @param nombre nombre o parte de este que se quiere buscar
     * @return retorna los recursos que coinciden con la cadena nombre
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> filtrarNombre(String nombre) throws ServicesException {
        try{
            return recursoDAO.filtrarNombre(nombre);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar nombre error:"+ex.getLocalizedMessage(), ex);
        }
    }
    /**
     * 
     * @param ubicacion cadena o parte de ella de la ubicacion que se quiere buscar
     * @return retorna los recursos que coincidan con esta ubicacion
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> filtrarUbicacion(String ubicacion) throws ServicesException {
        try{
            return recursoDAO.filtrarUbicacion(ubicacion);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar nombre error:"+ex.getLocalizedMessage(), ex);
        }
    }
    /**
     * 
     * @param capacidad capacidad por la que se quiere filtrar
     * @return los elemento con la capacidad enviada
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> filtrarCapacidad(int capacidad) throws ServicesException {
        try{
            return recursoDAO.filtrarCapacidad(capacidad);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar capacidad error:"+ex.getLocalizedMessage(), ex);
        }
    }
    /**
     * 
     * @param tipo el tipo de los recursos que se desean buscar
     * @return retorna los libros que coinciden con el tipo
     * @throws ServicesException 
     */
    @Override
    public List<Recurso> filtrarTipo(String tipo) throws ServicesException {
        try{
            return recursoDAO.filtrarTipo(tipo);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar tipo error:"+ex.getLocalizedMessage(), ex);
        }
    }

    @Override
    public void insertReserva(Reserva reserva) throws ServicesException {
        try{
            reservaDAO.insertReserva(reserva);
        }catch(PersistenceException ex) {
            throw new ServicesException("filtrar tipo error:"+ex.getLocalizedMessage(), ex);
        }
    }
    
    
}

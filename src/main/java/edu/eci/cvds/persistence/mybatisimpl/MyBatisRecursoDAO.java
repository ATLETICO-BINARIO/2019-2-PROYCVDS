
package edu.eci.cvds.persistence.mybatisimpl;


import com.google.inject.Inject;

import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.persistence.RecursoDAO;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.mybatisimpl.mappers.RecursoMapper;
import java.util.List;



public class MyBatisRecursoDAO implements RecursoDAO {

    @Inject
    RecursoMapper recursoMapper;

    
    /**
     * 
     * @return todos los recursos disponibles
     * @throws PersistenceException 
     */
    @Override
    public List<Recurso> loadAll() throws PersistenceException {
        try{   
            return recursoMapper.getRecursos();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con la busqueda de los elementos",e);
        }
    }
    /**
     * 
     * @param b recurso que se quiere guardar
     * @throws PersistenceException 
     */
    @Override
    public void save(Recurso b) throws PersistenceException {
        try{
            recursoMapper.insertRecurso(b);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con el elemento a insertar",e);
        }
        
    }
    /**
     * 
     * @param id id del recurso que se quiere buscar
     * @return retorna el recurso con los que coiciden su id
     * @throws PersistenceException 
     */
    @Override
    public List<Recurso> recursoPorId(int id) throws PersistenceException {
        try{
            return recursoMapper.recursoPorId(id);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos por id",e);
        }
    }
    /**
     * 
     * @param id id del recurso que se quiere cambiar su estado de mantenimiento
     * @throws PersistenceException 
     */
    @Override
    public void cambiarEstadoMatenimiento(int id) throws PersistenceException {
        try{
            recursoMapper.cambiarEstadoMatenimiento(id);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con cambiar estado mantenimiento",e);
        }
    }
    /**
     * 
     * @return retorna los recursos que estan disponibles
     * @throws PersistenceException 
     */
    @Override
    public List<Recurso> recursosDisponibles() throws PersistenceException {
        try{
            return recursoMapper.recursosDisponibles();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos por disponibilidad",e);
        }
    }
    
    /**
     * 
     * @param nombre nombre y parte de este que se quiere buscar
     * @return los recursos que conciden con la cadena
     * @throws PersistenceException 
     */

    @Override
    public List<Recurso> filtrarNombre(String nombre) throws PersistenceException {
        try{
            return recursoMapper.filtrarNombre(nombre);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos por nombre",e);
        }
    }
    /**
     * 
     * @param ubicacion cadena de ubicacion o parte de esta
     * @return retorna los recursos que cioncidan con esta
     * @throws PersistenceException 
     */
    @Override
    public List<Recurso> filtrarUbicacion(String ubicacion) throws PersistenceException {
        try{
            return recursoMapper.filtrarUbicacion(ubicacion);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos por nombre",e);
        }
    }

	
}

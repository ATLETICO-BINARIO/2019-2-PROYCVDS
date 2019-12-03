
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

    

    @Override
    public List<Recurso> loadAll() throws PersistenceException {
        try{   
            return recursoMapper.getRecursos();
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con la busqueda de los elementos",e);
        }
    }

    @Override
    public void save(Recurso b) throws PersistenceException {
        try{
            recursoMapper.insertRecurso(b);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con el elemento a insertar",e);
        }
        
    }

    @Override
    public List<Recurso> filtrarRecurso(Recurso recurso) throws PersistenceException {
        try{
            return recursoMapper.filtrarRecurso(recurso);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos",e);
        }
    }

    @Override
    public void cambiarEstadoMatenimiento(int id) throws PersistenceException {
        try{
            recursoMapper.cambiarEstadoMatenimiento(id);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con filtrar los elementos",e);
        }
    }

	
}

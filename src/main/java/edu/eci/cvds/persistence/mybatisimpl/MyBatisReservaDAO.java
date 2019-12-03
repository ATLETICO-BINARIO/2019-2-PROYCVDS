/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.persistence.PersistenceException;
import edu.eci.cvds.persistence.ReservaDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.ReservaMapper;

/**
 *
 * @author User
 */
public class MyBatisReservaDAO implements ReservaDAO{
    
    @Inject
    ReservaMapper reservaMapper;

    @Override
    public void insertReserva(Reserva reserva) throws PersistenceException {
        try{
            reservaMapper.insertReserva(reserva);
        }catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("Problemas con la reserva a insertar",e);
        }
    }

    
    
    
}

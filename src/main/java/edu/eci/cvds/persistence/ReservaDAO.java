/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.persistence;

import edu.eci.cvds.entities.Reserva;

/**
 *
 * @author User
 */
public interface ReservaDAO {
    
    public void insertReserva(Reserva reserva) throws PersistenceException;
    
}

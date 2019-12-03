/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.managedbeans;

/**
 *
 * @author David Herrera
 */
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.managedbeans.BasePageBean;
import edu.eci.cvds.services.BibliotecaServices;
import edu.eci.cvds.services.ServicesException;
import edu.eci.cvds.services.BibliotecaServicesFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "recursoBean")
@SuppressWarnings("deprecation")
@SessionScoped 
public class RecursoBean implements Serializable{
    
    public static final Logger log = LoggerFactory.getLogger(BasePageBean.class);
    
    private BibliotecaServices bibliotecaServices;
    
    private String nombre;
    private String tipo;
    private String ubicacion;
    private int id;
    private int capacidad;
    private boolean disponible;
    private boolean averiado;
    
    
    public RecursoBean(){
        bibliotecaServices = BibliotecaServicesFactory.getInstance().getBibliotecaServices();
    }
    
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        System.out.println("Seteó Tipo");
        this.tipo = tipo;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public int getId(){
        return id;
        
    }
    public void setId(int identificador){
        this.id = identificador;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }    
    
    public String estaDisponible(Recurso r){
        if(r.isDisponible()) return "Disponible";
        else return "Esta en uso"; 
    } 
    
    public String estaAveriado(Recurso r){
        if(r.isAveriado()) return "Si";
        else return "No"; 
    } 
    
    public void registrarRecurso(String nombre, int id, String ubicacion, int capacidad, String tipo){
        try{
            Recurso recurso = new Recurso(id, true, false, ubicacion, nombre, capacidad, tipo);
            bibliotecaServices.insertarRecurso(recurso);            
            System.out.println("Se ha registrado con exito");
        }catch(ServicesException e){
            e.printStackTrace();
            facesError(e.getMessage());
        }
    }
    
    public List<Recurso> consultarRecursos(){
        try {
            List<Recurso> recs = bibliotecaServices.buscarRecurso();
            for (Recurso i: recs) {
                System.out.println(i.getId());
            }
            System.out.println("Consulta exitosa");
            return recs;
        }catch (ServicesException e) {
            
            facesError("No se pudo consultar los recursos ");
            return null;
        }
        
    }
    
    private void facesError(String message) {
        FacesContext.getCurrentInstance().addMessage("Problema al registrar un Recurso: ", new FacesMessage(FacesMessage.SEVERITY_ERROR, message, "se genero un error"));
    }
    
            
}

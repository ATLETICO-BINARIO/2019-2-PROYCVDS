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
import edu.eci.cvds.services.BibliotecaServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import org.primefaces.PrimeFaces;


@ManagedBean(name = "reservaBean")
@SuppressWarnings("deprecation")
@ApplicationScoped 
public class ReservaBean implements Serializable{
    
    public static final Logger log = LoggerFactory.getLogger(BasePageBean.class);
    
    private BibliotecaServices bibliotecaServices;
    private Date dateI;
    private Date dateF;
    private Date hourI;    
    private Date hourF;
    private int horas;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public Date getHourI() {
        return hourI;
    }

    public void setHourI(Date hourI) {
        this.hourI = hourI;
    }

    public Date getHourF() {        
        return hourF;
    }

    public void setHourF(Date hourF) {
        this.hourF = hourF;
    }

    public Date getDateF() {
        return dateF;
    }

    public void setDateF(Date dateF) {
        this.dateF = dateF;
    }
    private List<Date> invalidDates;
    private List<Integer> invalidDays;
    private Date dateTimeDe;
    private List<Date> multi;
    private List<Date> range;
    private Date minDate;
    private Date maxDate;
    private Date minTime;
    private Date maxTime;
    private Date minDateTime;
    private Date maxDateTime;
    public Date getDateI() {
        return dateI;
    }

    public void setDateI(Date dateI) {
        this.dateI = dateI;
    }
    
    @PostConstruct
    public void init() {
        invalidDates = new ArrayList<>();
        Date today = new Date();
        invalidDates.add(today);
        long oneDay = 24 * 60 * 60 * 1000;
        for (int i = 0; i < 5; i++) {
            invalidDates.add(new Date(invalidDates.get(i).getTime() + oneDay));
        }
        invalidDays = new ArrayList<>();
        invalidDays.add(0); /* the first day of week is disabled */
        invalidDays.add(3);
 
        minDate = new Date(today.getTime() - (365 * oneDay));
        maxDate = new Date(today.getTime() + (365 * oneDay));
 
        Calendar tmp = Calendar.getInstance();
        tmp.set(Calendar.HOUR_OF_DAY, 9);
        tmp.set(Calendar.MINUTE, 0);
        tmp.set(Calendar.SECOND, 0);
        tmp.set(Calendar.MILLISECOND, 0);
        minTime = tmp.getTime();
 
        tmp = Calendar.getInstance();
        tmp.set(Calendar.HOUR_OF_DAY, 17);
        tmp.set(Calendar.MINUTE, 0);
        tmp.set(Calendar.SECOND, 0);
        tmp.set(Calendar.MILLISECOND, 0);
        maxTime =  tmp.getTime();
 
        minDateTime = new Date(today.getTime() - (7 * oneDay));
        maxDateTime = new Date(today.getTime() + (7 * oneDay));
        
        
 
    }
    public void registrarReserva(){
        bibliotecaServices.consultarRecursos();
    }
    
    public Date horaFin(int horas){  
        Date horaF = new Date();
        try{
            horaF.setHours(hourI.getHours()+horas);
            System.out.println(horaF.getHours());
            return horaF;
        }catch(Exception e){
            return horaF;
        }
    }
    
    public void click() {
        PrimeFaces.current().ajax().update("form:display");
        PrimeFaces.current().executeScript("PF('dlg').show()");
    } 
    
            
}

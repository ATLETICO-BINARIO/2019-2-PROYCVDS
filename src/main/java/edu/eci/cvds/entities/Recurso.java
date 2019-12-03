package edu.eci.cvds.entities;


public class Recurso {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAveriado() {
        return averiado;
    }

    public void setAveriado(boolean averiado) {
        this.averiado = averiado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    private int id;
    private boolean averiado;
    private String ubicacion;
    private boolean disponible;
    private String nombre;
    private int capacidad;
    private String tipo;
    
    public Recurso(int id, boolean disponible,boolean averiado, String ubicacion, String nombre, int capacidad, String tipo) {
            super();
            this.id = id;
            this.ubicacion = ubicacion;
            this.disponible = disponible;   
            this.averiado = averiado;
            this.nombre = nombre;
            this.capacidad = capacidad;
            this.tipo = tipo;
	}
   
	

	@Override
    public String toString() {
        return "Elemento { id: "+id+", ubicacion: "+ubicacion+", nombre: "+nombre+", disponible: "+disponible+", capacidad: "+capacidad+" }";
    }
    
    
    
}
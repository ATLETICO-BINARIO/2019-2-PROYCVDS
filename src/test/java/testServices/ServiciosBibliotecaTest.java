/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author 2155046
 */


import com.google.inject.Injector;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import java.util.Optional;

import static com.google.inject.Guice.createInjector;
import edu.eci.cvds.entities.Recurso;
import edu.eci.cvds.entities.Reserva;
import edu.eci.cvds.entities.Roll;
import edu.eci.cvds.entities.Usuario;
import edu.eci.cvds.services.BibliotecaServices;
import edu.eci.cvds.services.BibliotecaServicesFactory;
import edu.eci.cvds.services.ServicesException;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ServiciosBibliotecaTest {
    
    private BibliotecaServices bibliotecaS;
    
    public ServiciosBibliotecaTest() throws ServicesException {
		bibliotecaS = BibliotecaServicesFactory.getInstance().getBibliotecaServicesTesting();
	}
    /**
	 * Esta prueba utiliza el servicio consultar recurso y verificamos que el objeto que asignamos no este vacio.
	 * @throws ExcepcionServiciosBiblioteca
	 */
	@Test
	public void deberiaConsultarRecursos() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.consultarRecursos();

	}
        
        @Test
        public void deberiaFiltrarRecursosPorId() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.recursoPorId(116);

		assertTrue (recurPrueba !=null);
	}
        
        @Test
        public void deberiaFiltrarRecursosDisponibles() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.recursosDisponibles();

		assertTrue (recurPrueba !=null);
	}
        
        @Test
        public void deberiaFiltrarRecursosPorNombre() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.filtrarNombre("e");
                
                //for(Recurso r: recurPrueba) System.out.println(r);
                
		assertTrue (recurPrueba !=null);
	}
        
        @Test
        public void deberiaFiltrarRecursosPorUbicacion() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.filtrarUbicacion("e");
                
                //for(Recurso r: recurPrueba) System.out.println(r);
                
		assertTrue (recurPrueba !=null);
	}
        
        @Test
        public void cambiarEstadoMatenimiento() throws ServicesException {
            
                List<Recurso> recurPrueba = bibliotecaS.recursoPorId(102);
                
                boolean testigo = recurPrueba.get(0).isAveriado();

		bibliotecaS.cambiarEstadoMatenimiento(recurPrueba.get(0).getId());
                
                recurPrueba = bibliotecaS.recursoPorId(102);
                
                boolean testigo2 = recurPrueba.get(0).isAveriado();
                
                
		assertTrue (testigo != testigo2);
	}
        
        @Test
        public void deberiaFiltrarRecursosPorCapacidad() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.filtrarCapacidad(5);
                //for(Recurso r:recurPrueba) System.out.println(r);
		assertTrue (recurPrueba !=null);
	}
        
        
                
        @Test
        public void deberiaFiltrarRecursosPorTipo() throws ServicesException {

		List<Recurso> recurPrueba = bibliotecaS.filtrarTipo("l");
                //for(Recurso r:recurPrueba) System.out.println(r);
		assertTrue (recurPrueba !=null);
	} 
        
        
        
    
}
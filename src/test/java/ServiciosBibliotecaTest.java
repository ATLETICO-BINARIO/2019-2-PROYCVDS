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
import edu.eci.cvds.services.BibliotecaServices;
import edu.eci.cvds.services.BibliotecaServicesFactory;
import edu.eci.cvds.services.ServicesException;
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
                for(Recurso i:recurPrueba) System.out.println(i);
		assertTrue (recurPrueba !=null);
	}
    
}

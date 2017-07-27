/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gagl.webmaven.mavenproject1;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.gagl.core.modelo.Persona;
import org.gagl.core.servicio.GeneralService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




/**
 *
 * @author gagillar
 */
@Component
public class PersonaUI extends AbstractUI implements Serializable{
	    
	//static final Log LOGGER = LogFactory.getLog(PersonaUI.class);
	static final Logger LOGGER = Logger.getLogger(PersonaUI.class);
	
	private String nombre;
    
    //Servicios
    @Autowired
    private GeneralService generalServiceImpl;        

    /**
     * @return the nombre
     */
    public String getNombre() {       
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void guardarPersona(){
    	System.out.println("Entre a guardar");
    	Persona entidad=new Persona();
    	
    	entidad.setId(1);
    	entidad.setDireccion("guatemala");
    	entidad.setNombre(nombre);
    	try {
			this.generalServiceImpl.actualizaPersona(entidad);
			LOGGER.info("Actualiza la persona");
			this.obtenerPersonas();
			this.info(null, "hola", "hola mundo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
	public void obtenerPersonas(){
		try {			
			this.generalServiceImpl.obtenerPersonas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
            
            
    
}

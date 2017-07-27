package org.gagl.webmaven.mavenproject1;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class AbstractUI {
	
    public void info(String pClienteId, String pMessage, String pDetail) {
        FacesContext.getCurrentInstance().addMessage(pClienteId, new FacesMessage(FacesMessage.SEVERITY_INFO, pMessage, pDetail));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import org.primefaces.context.RequestContext;
 
@ManagedBean(name = "dfView")
    public class DFView {
         
    public void showMessage() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Olá -  Bem-Vindo!", "Para o seu primeiro acesso ao sistema EbicsCRM entre em contato com administrador do sistema.");
         
        RequestContext.getCurrentInstance().showMessageInDialog(message);
    }
}
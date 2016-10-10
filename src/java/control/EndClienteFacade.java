/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.EndCliente;

/**
 *
 * @author Thiago Reis
 */
@Stateless
public class EndClienteFacade extends AbstractFacade<EndCliente> {

    @PersistenceContext(unitName = "HappyWayCRMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EndClienteFacade() {
        super(EndCliente.class);
    }
    
}

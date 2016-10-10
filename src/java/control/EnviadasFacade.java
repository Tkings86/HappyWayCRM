/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Enviadas;

/**
 *
 * @author Thiago Reis
 */
@Stateless
public class EnviadasFacade extends AbstractFacade<Enviadas> {

    @PersistenceContext(unitName = "HappyWayCRMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EnviadasFacade() {
        super(Enviadas.class);
    }
    
}

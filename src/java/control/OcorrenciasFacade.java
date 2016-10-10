/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Ocorrencias;

/**
 *
 * @author Thiago Reis
 */
@Stateless
public class OcorrenciasFacade extends AbstractFacade<Ocorrencias> {

    @PersistenceContext(unitName = "HappyWayCRMPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OcorrenciasFacade() {
        super(Ocorrencias.class);
    }
    
}

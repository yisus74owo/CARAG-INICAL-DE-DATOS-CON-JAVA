/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.importa_exel.model;

import com.mycompany.importa_exel.entities.Dependents;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author yisus
 */
@Stateless
public class DependentsFacade extends AbstractFacade<Dependents> implements DependentsFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_IMPORTA_EXEL_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DependentsFacade() {
        super(Dependents.class);
    }
    
}

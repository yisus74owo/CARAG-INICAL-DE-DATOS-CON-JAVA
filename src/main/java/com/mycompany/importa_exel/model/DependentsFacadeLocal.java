/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.importa_exel.model;

import com.mycompany.importa_exel.entities.Dependents;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yisus
 */
@Local
public interface DependentsFacadeLocal {

    void create(Dependents dependents);

    void edit(Dependents dependents);

    void remove(Dependents dependents);

    Dependents find(Object id);

    List<Dependents> findAll();

    List<Dependents> findRange(int[] range);

    int count();
    
}

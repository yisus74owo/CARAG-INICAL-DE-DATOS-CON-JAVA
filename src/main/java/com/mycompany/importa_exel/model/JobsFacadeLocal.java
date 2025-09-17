/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.importa_exel.model;

import com.mycompany.importa_exel.entities.Jobs;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yisus
 */
@Local
public interface JobsFacadeLocal {

    void create(Jobs jobs);

    void edit(Jobs jobs);

    void remove(Jobs jobs);

    Jobs find(Object id);

    List<Jobs> findAll();

    List<Jobs> findRange(int[] range);

    int count();
    
}

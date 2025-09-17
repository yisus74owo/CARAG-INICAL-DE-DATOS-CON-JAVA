/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.importa_exel.model;

import com.mycompany.importa_exel.entities.Locations;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author yisus
 */
@Local
public interface LocationsFacadeLocal {

    void create(Locations locations);

    void edit(Locations locations);

    void remove(Locations locations);

    Locations find(Object id);

    List<Locations> findAll();

    List<Locations> findRange(int[] range);

    int count();
    
}

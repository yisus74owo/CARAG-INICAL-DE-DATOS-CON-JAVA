/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.importa_exel.controller;

import com.mycompany.importa_exel.entities.Countries;
import com.mycompany.importa_exel.entities.Regions;
import com.mycompany.importa_exel.model.CountriesFacadeLocal;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.primefaces.model.file.UploadedFile;
/**
 *
 * @author yisus
 */
@Named(value = "cargaPais")
@ViewScoped
public class CargaPais implements Serializable {

    private UploadedFile archivo;
    
    @EJB
    private CountriesFacadeLocal cfl;

    private Countries con;
    private Regions reg;
    private FacesMessage mensaje;
    private FacesContext contexto;
    
    public UploadedFile getArchivo() {
        return archivo;
    }

    public void setArchivo(UploadedFile archivo) {
        this.archivo = archivo;
    }

    @PostConstruct
    public void init() {
        con = new Countries();
        reg = new Regions();
    }
    
    public CargaPais() {
    }

    public void cargarArchivo() {
        contexto = FacesContext.getCurrentInstance();
        if (archivo.getSize() > 0) {
            try {
                InputStream lectura = archivo.getInputStream();
                XSSFWorkbook libro = new XSSFWorkbook(lectura);
                Sheet hoja = libro.getSheetAt(0);

                for (Row fila : hoja) {
                    if (fila.getRowNum() == 0) {
                        continue;
                    }
                    if (fila.getCell(0) != null && fila.getCell(1) != null && fila.getCell(2) != null) {
                        con.setCountryId(fila.getCell(0).getStringCellValue());
                        con.setCountryName(fila.getCell(1).getStringCellValue());
                        int regionId = (int) fila.getCell(2).getNumericCellValue();
                        reg.setRegionId(regionId);
                        con.setRegionId(reg);
                        cfl.create(con);
                    } else {
                        break;
                    }
                }
                lectura.close();

                mensaje = new FacesMessage(FacesMessage.SEVERITY_INFO, "Archivo cargado correctamente", "MSG_INFO");
                contexto.addMessage(null, mensaje);

            } catch (IOException e) {
                mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, e.getMessage(), "MSG_ERROR");
                contexto.addMessage(null, mensaje);
            }
        } else {
            mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Seleccione un archivo válido", "MSG_ERROR");
            contexto.addMessage(null, mensaje);
        }
    }
}

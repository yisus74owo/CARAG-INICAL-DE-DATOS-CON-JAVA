/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.importa_exel.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "dependents")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dependents.findAll", query = "SELECT d FROM Dependents d"),
    @NamedQuery(name = "Dependents.findByDependentId", query = "SELECT d FROM Dependents d WHERE d.dependentId = :dependentId"),
    @NamedQuery(name = "Dependents.findByFirstName", query = "SELECT d FROM Dependents d WHERE d.firstName = :firstName"),
    @NamedQuery(name = "Dependents.findByLastName", query = "SELECT d FROM Dependents d WHERE d.lastName = :lastName"),
    @NamedQuery(name = "Dependents.findByRelationship", query = "SELECT d FROM Dependents d WHERE d.relationship = :relationship")})
public class Dependents implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dependent_id")
    private Integer dependentId;
    @Size(max = 50)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 25)
    @Column(name = "relationship")
    private String relationship;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employees employeeId;

    public Dependents() {
    }

    public Dependents(Integer dependentId) {
        this.dependentId = dependentId;
    }

    public Integer getDependentId() {
        return dependentId;
    }

    public void setDependentId(Integer dependentId) {
        this.dependentId = dependentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Employees getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employees employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dependentId != null ? dependentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dependents)) {
            return false;
        }
        Dependents other = (Dependents) object;
        if ((this.dependentId == null && other.dependentId != null) || (this.dependentId != null && !this.dependentId.equals(other.dependentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.importa_exel.entities.Dependents[ dependentId=" + dependentId + " ]";
    }
    
}

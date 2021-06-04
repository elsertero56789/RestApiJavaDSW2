/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.proyecto.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
 
/**
 *
 * @author fabrizio
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codCliente")
    private int codCliente;

    private String nomCliente;
    private String apePatCliente;
    private String apeMatCliente;
    private int celCliente;
    private String dirCliente;
    private String usuario;
    private String contrasenia;

    @Lob
    private byte[] imagenCliente;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApePatCliente() {
        return apePatCliente;
    }

    public void setApePatCliente(String apePatCliente) {
        this.apePatCliente = apePatCliente;
    }

    public String getApeMatCliente() {
        return apeMatCliente;
    }

    public void setApeMatCliente(String apeMatCliente) {
        this.apeMatCliente = apeMatCliente;
    }

    public int getCelCliente() {
        return celCliente;
    }

    public void setCelCliente(int celCliente) {
        this.celCliente = celCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public byte[] getImagenCliente() {
        return imagenCliente;
    }

    public void setImagenCliente(byte[] imagenCliente) {
        this.imagenCliente = imagenCliente;
    }
    
}

package com.eldar.apirest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name ="TARJETA")
public class Tarjeta {
    @Id
    @Column(name = "IDTARJETA")
    private Integer idtarjeta;
    @Column(name="MARCA")
    private String marca;

    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "CARDHOLDER")
    private String cardholder;
    @Column(name = "FECHAVENCIMIENTO")
    private String fechavencimiento;

    //*******************
    //*** CONSTRUCTOR ***
    //*******************

    public Tarjeta() {
    }

    public Tarjeta(Integer idtarjeta, String marca, String numero, String cardholder, String fechavencimiento) {
        this.idtarjeta = idtarjeta;
        this.marca = marca;
        this.numero = numero;
        this.cardholder = cardholder;
        this.fechavencimiento = fechavencimiento;
    }
//*************************
    //*** Getters & Setters ***
    //*************************


    public Integer getIdtarjeta() {
        return idtarjeta;
    }

    public void setIdtarjeta(Integer idtarjeta) {
        this.idtarjeta = idtarjeta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(String fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }
}

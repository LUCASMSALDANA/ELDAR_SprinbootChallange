package com.eldar.apirest.model;

public class Consulta {

    private String marca;
    private double importe;

    //*******************
    //*** CONSTRUCTOR ***
    //*******************


    public Consulta() {
    }

    public Consulta(String marca, double importe) {
        this.marca = marca;
        this.importe = importe;
    }

    //*************************
    //*** Getters & Setters ***
    //*************************


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}

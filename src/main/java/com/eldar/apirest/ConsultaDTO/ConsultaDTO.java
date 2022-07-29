package com.eldar.apirest.ConsultaDTO;

public class ConsultaDTO {
    private String marca;
    private double importe;
    private double tasa;
    private double interes;

    //*******************
    //*** CONSTRUCTOR ***
    //*******************

    public ConsultaDTO() {
    }

    public ConsultaDTO(String marca, double importe, double tasa, double interes) {
        this.marca = marca;
        this.importe = importe;
        this.tasa = tasa;
        this.interes = interes;
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

    public double getTasa() {
        return tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}

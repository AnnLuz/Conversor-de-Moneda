package com.alura.conversordemoneda.modelos;

public class ConversorDeMonedas {

    private String codigoDeMoneda;
    private String tipoDeCambio;
    private double valor;

    public ConversorDeMonedas(String codigoDeMoneda, String tipoDeCambio, double valor) {
        this.codigoDeMoneda = codigoDeMoneda;
        this.tipoDeCambio = tipoDeCambio;
        this.valor = valor;
    }

    public String getCodigoDeMoneda() {
        return codigoDeMoneda;
    }

    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public double getValor() {
        return valor;
    }

}

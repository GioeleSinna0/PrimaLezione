package com.example;

public class SaldoInsufficienteException extends Exception{
    private double importoMancante;
    public SaldoInsufficienteException(String message, double importoMancante){
        super(message);
        this.importoMancante = importoMancante;
    }

    @Override
    public String getMessage(){
        return super.getMessage() + " Importo mancante: " + this.importoMancante;
    }
}
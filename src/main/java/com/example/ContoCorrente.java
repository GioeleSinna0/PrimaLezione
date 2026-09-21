package com.example;

public class ContoCorrente {
    private String totale;
    private double saldo;

    public ContoCorrente(String totale, double saldo) throws new illeIllegalArgumentException{
        if (saldo < 0) {
            throw new IllegalArgumentException("errore il saldo inserito e' inferiore a 0");
        }
        this.totale = totale;
        this.saldo = saldo;
    }

    public void deposito(double importo){
        if (importo <= 0) {
            throw new IllegalArgumentException("errore il saldo inserito e' inferiore a 0");
        }
        this.saldo += importo;
    }
}

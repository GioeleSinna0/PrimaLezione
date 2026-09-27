package com.example;

public class ContoCorrente {
    private String titolare;
    private double saldo;

    public ContoCorrente(String titolare, double saldo){
        if (saldo < 0) {
            throw new IllegalArgumentException("Il saldo iniziale non può essere negativo");
        }
        this.titolare = titolare;
        this.saldo = saldo;
    }

    public void deposito(double importo){
        if (importo <= 0) {
            throw new IllegalArgumentException("L'importo del deposito non può essere negativo o zero");
        }
        this.saldo += importo;
    }

    public void prelievo(double importo)throws SaldoInsufficienteException{
        if(importo <= 0){
            throw new IllegalArgumentException("L'importo del prelievo non può essere negativo o zero");
        }else if(importo > this.saldo){
            throw new SaldoInsufficienteException("errore l'importo inserito e' superiore al saldo", importo - this.saldo);
        }else{
            this.saldo -= importo;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }
}
 
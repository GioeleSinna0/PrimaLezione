package com.example;

public class Main {
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("Gioele", 100);

        try{
            c1.deposito(10);
            System.out.println("Saldo dopo il deposito: " + c1.getSaldo());

            c1.prelievo(50);
            System.out.println("Saldo dopo il prelievo: " + c1.getSaldo());

            c1.prelievo(200); 
        } catch (SaldoInsufficienteException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Il saldo finale e': " + c1.getSaldo());
        }

        try{
            c1.deposito(-1); 
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Il saldo finale e': " + c1.getSaldo());
        }
    }
}

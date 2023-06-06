//Lo shop gestisce diversi tipi di prodotto:
//- Smartphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//- Cuffie, caratterizzate dal colore e se sono wireless o cablate


package org.lessons.java.shop;

public class Smartphone extends Prodotto{
    private int imei;
    private int memoria;
    public Smartphone(String nome, String descrizione, double prezzo, double iva, int imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria= memoria;
    }

    @Override
    public String toString(){
        return super.toString() + "Codice imei: " + imei +  "\n" + "Memoria: " + memoria+ "Gb";
    }
}

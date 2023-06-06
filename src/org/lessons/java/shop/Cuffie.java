//- Cuffie, caratterizzate dal colore e se sono wireless o cablate

package org.lessons.java.shop;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String descrizione, double prezzo, double iva, String colore, boolean wireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }
}

//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

package org.lessons.java.shop;

public class Televisori extends Prodotto{
    private int dimensioni;
    private boolean smart;

    public Televisori(String nome, String descrizione, double prezzo, double iva, int dimensioni, boolean smart) {
        super(nome, descrizione, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }
    @Override
    public String toString(){
        return super.toString() + "Dimensioni: " + dimensioni + "pollici" + "\n" + (smart? "Smart TV" : "TV -no smart-")+  "\n";
    }

}

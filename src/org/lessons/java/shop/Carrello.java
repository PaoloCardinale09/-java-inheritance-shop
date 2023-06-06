package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cosa vuoi inserire?");
        System.out.println("1-Cuffie 2-Smartphone 3-Televisori");
        String scelta = scan.nextLine();
        switch (scelta){
            case "1":
                System.out.println("Cuffie");

                // Chiedo nome prodotto
                System.out.println("Nome prodotto: ");
                String nome = scan.nextLine();

                // Chiedo descrizione prodotto
                System.out.println("Descrizione prodotto: ");
                String descrizione = scan.nextLine();

                // Chiedo prezzo prodotto
                System.out.println("Prezzo prodotto: ");
                int prezzo= scan.nextInt();

                // Chiedo percentuale iva
                System.out.println("Percentuale IVA: ");
                int iva= scan.nextInt();

                // Chiedo il colore
                System.out.println("Colore: ");
                String colore = scan.nextLine();


                // Chiedo se è wireless

                System.out.println("Cuffia wireless? (s/n)");
                String wirelessScelta = scan.nextLine();

                boolean wireless = false;
                if (wirelessScelta.equalsIgnoreCase("s")) {
                    wireless = true;
                }

                // Con i dati costruisco il prodotto



                Cuffie cuffie = new Cuffie( nome, descrizione, prezzo, iva,colore, wireless);

                DecimalFormat decimalFormat = new DecimalFormat("#.00");

                System.out.println("Codice: " + cuffie.getCodice());
                System.out.println("Nome: " + nome);
                System.out.println("Descrizione: " + descrizione);
                System.out.println("Prezzo: " + decimalFormat.format( cuffie.getPrezzoBase()) + " €");
                System.out.println("Prezzo + iva al " +iva+ "%: " +decimalFormat.format( cuffie.getPrezzoIvato(iva))  + " €");
                System.out.println("Nome esteso del prodotto: " +cuffie.nomeEsteso());
                System.out.println("Colore: " + colore);
                if (wireless){
                System.out.println("Cuffie Wireless");
                }else {
                    System.out.println("Cuffie cablate");
                }

        }


        scan.close();
    }
}

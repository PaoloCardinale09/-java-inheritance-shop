package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanti oggetti vuoi nel carrello?");
        int numeroOggetti = Integer.parseInt(scan.nextLine());
        Prodotto[] carrello = new Prodotto[numeroOggetti];

        for (int i = 0; i < carrello.length; i++) {

        System.out.println("Cosa vuoi inserire?");
        System.out.println("1-Cuffie 2-Smartphone 3-Televisori");
        String scelta = scan.nextLine();

            // Chiedo nome prodotto
            System.out.println("Nome prodotto: ");
            String nome = scan.nextLine();

            // Chiedo descrizione prodotto
            System.out.println("Descrizione prodotto: ");
            String descrizione = scan.nextLine();

            // Chiedo prezzo prodotto
            System.out.println("Prezzo prodotto: ");
            int prezzo= Integer.parseInt(scan.nextLine());

            // Chiedo percentuale iva
            System.out.println("Percentuale IVA: ");
            int iva= Integer.parseInt(scan.nextLine());


        switch (scelta){
            case "1":

                // Chiedo il colore
                System.out.println("Colore: ");
                String colore = scan.nextLine();


                // Chiedo se è wireless

                System.out.println("Cuffia wireless? (s/n)");
                String wirelessScelta = scan.nextLine();

                boolean wireless = wirelessScelta.equalsIgnoreCase("s");

                carrello[i] = new Cuffie(nome, descrizione,prezzo,iva, colore, wireless);

                // Con i dati costruisco il prodotto
        }
                System.out.println(Arrays.toString(carrello));

        }



        scan.close();
    }
}

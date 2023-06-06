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
              break;

            case "2":
                //Chiedo codice imei
                System.out.println("Codice imei: ");
                int imei = Integer.parseInt(scan.nextLine());

                //Chiedo quantità di memoria
                System.out.println("Quanta memoria: ");
                int memoria= Integer.parseInt(scan.nextLine());

                carrello[i] = new Smartphone(nome, descrizione,prezzo,iva,imei,memoria);
                break;
            case "3":
                // Chiedo dimensioni
                System.out.println("Dimensioni in pollici: ");
                int dimensioni = Integer.parseInt(scan.nextLine());

                // Chiedo se è una tv smart
                System.out.println("Smart TV? (s/n)");
                String smartScelta = scan.nextLine();

                boolean smart = smartScelta.equalsIgnoreCase("s");
                carrello[i] = new Televisori(nome, descrizione, prezzo, iva, dimensioni,  smart);
                break;
        }
        }

                System.out.println(Arrays.toString(carrello));




        scan.close();
    }
}

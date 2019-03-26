package com.example.testding;

import java.util.Scanner;

public class IO {

    public static String invoer() {
        //ughh... todo: alles een '''logische''' naam geven.
        //+ stuk code uit main hiernaar toe copypasta/en
        //dus dit stukje zorgt ervoor dat het de input verwerkt
        System.out.println("*  ");
        Scanner scanner = new Scanner(System.in); //rip scanner mcscanface
        String invoer = scanner.nextLine();
        invoer = invoer.toLowerCase(); //zet de invoer om in kleine letters bc reasons
        return invoer;
    }

    public static void verwerk(String invoer) {//stackoverflow is mijn bestie atm lel
        if (!invoer.isEmpty()) { //oke ik was dus vergeten dat je strings niet met elkaar kan vergelijken
            switch (invoer) { //yaay een switch statement
                case "kijk":
                    Locatie.Kijk(invoer);
                    break;
                case "ga":
                    System.out.println(">> Ga waarheen?");
                    break;
                case "help":
                    System.out.println(">> Je kan de volgende locaties bezoeken: \"Straat\", \"Park\", \"Pond\", \"Steegje\", \"???\".");
                    break;
                case "stop":
                    System.out.println(">> Doei!");
                    System.exit(0);
                default:
                    System.out.println(">> Geen idee wat " + invoer + " is.");
                    break;
            }
        }
    }
}

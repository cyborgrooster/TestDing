package textding;

import java.util.Scanner;

public class IO { //wow wat ben ik toch creatief

    public static String invoer() {
        System.out.println("*  ");
        Scanner mcscanface = new Scanner(System.in);
        String invoer = scanner.nextLine();
        invoer = invoer.toLowerCase(); //zet de invoer om in kleine letters bc reasons
        return invoer;
    }

    public static void verwerk(String invoer) {
        if (!invoer.isEmpty()) { //oke ik was dus vergeten dat je strings niet met elkaar kan vergelijken
            switch (invoer) { //yaay een switch statement
                case "kijk":
                    System.out.println(">> Wat wil je zien?");
                    break;
                case "ga":
                    System.out.println(">> Waar wil je heen?");
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

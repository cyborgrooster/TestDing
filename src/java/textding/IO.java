package textding;

import java.util.*;
import java.util.stream.Stream;

public class IO { //wow wat ben ik toch creatief

    private static Map<String, String> locaties = new HashMap<>();

    public static String invoer() {
        System.out.print("*  ");
        Scanner mcscanface = new Scanner(System.in);
        String invoer = mcscanface.nextLine();
//        invoer = invoer.toLowerCase(); //zet de invoer om in kleine letters bc reasons
        return invoer;
    }

    public static void verwerk(String invoer) {
        locaties.put("Straat", "Dit is een straat.");
        locaties.put("Park", "Dit is een park.");
        locaties.put("Pond", "Dit is een pond.");
        locaties.put("Steegje", "Dit is een steegje.");
        locaties.put("???", "Dit is een ???.");
        String[] cmdArgs = invoer.split(" ");
        Optional<String> command = Stream.of(cmdArgs).findFirst();
        command.ifPresent(cmd -> {
            switch (cmd) { //yaay een switch statement
                case "kijk":
                    if (cmdArgs.length > 1) {
                        System.out.println(locaties.get(cmdArgs[1]));
                    } else {
                        System.out.println(">> Wat wil je zien?");
                    }
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
        });
//        if (!invoer.isEmpty()) { //oke ik was dus vergeten dat je strings niet met elkaar kan vergelijken
//            switch (invoer) { //yaay een switch statement
//                case "kijk":
//                    System.out.println(">> Wat wil je zien?");
//                    break;
//                case "ga":
//                    System.out.println(">> Waar wil je heen?");
//                    break;
//                case "help":
//                    System.out.println(">> Je kan de volgende locaties bezoeken: \"Straat\", \"Park\", \"Pond\", \"Steegje\", \"???\".");
//                    break;
//                case "stop":
//                    System.out.println(">> Doei!");
//                    System.exit(0);
//                default:
//                    System.out.println(">> Geen idee wat " + invoer + " is.");
//                    break;
//            }
//        }
    }
}

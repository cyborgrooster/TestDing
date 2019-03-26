package com.example.testding;

public class Locatie {
    //wordt locatie opgeslagen in een array
    String invoer = IO.invoer();
    //int locSpeler = 0;

    public Locatie() {
        //alleen nu nog iets leuks verzinnen...
        String[] locatie = {"Straat", "Park", "Pond", "Steegje", "???"};
        String[] beschrijving = {"Het is een straat met tegels... en andere dingen.",
                "Je ziet bomen en andere dingen die thuis horen in de natuur. In de verte zie je een pond.",
                "Een pond met water? Het wordt bewaakt door agressieve ganzen. Het is beter als je snel weggaat.",
                "Een smal steegje. Je vertrouwt het niet.", "idek bro, hoe ben je hier gekomen?"};
        //List<String> loc = Arrays.asList(locatie);
    }

    public static void Kijk(String invoer) {
        //uuuuuuugh. oke. over naar bodge everything mode.
        if (invoer.equals("kijk straat")) {
            System.out.println(">> Het is een straat met tegels... en andere dingen.");
        } else if (invoer.equals("kijk park")) {
            System.out.println(">> Je ziet bomen en andere dingen die thuis horen in de natuur. In de verte zie je een pond.");
        } else if (invoer.equals("kijk pond")) {
            System.out.println(">> Een pond met water? Het wordt bewaakt door agressieve ganzen. Het is beter als je snel weggaat.");
        } else if (invoer.equals("kijk steegje")) {
            System.out.println(">> Een smal steegje. Je vertrouwt het niet");
        } else if (invoer.equals("kijk ???")) {
            System.out.println("idek bro, hoe ben je hier gekomen?");
        } else {
            System.out.println(">> Wat wil je zien?");
        }
    }

    /*public String Kijk(String[]locatie, String[]beschrijving){
        //ik heb hier niet goed over nagedacht.
        //dus ik wil afhankelijk van de locatie de juiste beschrijving printen.
        //let's bodge this then.

        for(int i = 0; i < locatie.length; i++){
            if(locatie[i].equals(invoer)){
                 int j = 0;
                 i = j;
                 String x = ">> " + beschrijving[j];
                 return x;
                } else{
                return ">> Wat wil je zien?";
            }
        }
        return ">> Wat wil je zien?";
    }

    public String GaLocatie(String[] loc){
        int j = 1;
        int i;
        for(i = 0; i < loc.length; i++){
            if(j != 2){
                if(i == locSpeler){
                    return "";
                } else {
                    locSpeler = i;
                    //Locatie.Kijk;
                    return "";
                }
            }
        }
        return "";
    }*/
}

package controller;

import model.Kofferslot;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
 */
public class KofferslotLauncher {
    public static void main(String[] args) {
        // TODO print methode toevoegen aan Kofferslot, oogt netter dan al deze print statements

        Kofferslot eersteKofferslot = new Kofferslot();
        System.out.printf("%c%c%d\n", eersteKofferslot.getEersteLetter(),
                eersteKofferslot.getTweedeLetter(), eersteKofferslot.getCijfer());

        Kofferslot tweedeKofferslot = new Kofferslot('C','D',8);
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());

        tweedeKofferslot.setCombinatie('A', 'A', 0);
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());
        tweedeKofferslot.volgende();
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());

        tweedeKofferslot.setCombinatie('B', 'R', 9);
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());
        tweedeKofferslot.volgende();
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());

        tweedeKofferslot.setCombinatie('D', 'Z', 9);
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());
        tweedeKofferslot.volgende();
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());

        tweedeKofferslot.setCombinatie('Z', 'Z', 9);
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());
        System.out.printf("Volgende cijfer is : %d\n", tweedeKofferslot.volgendeCijfer(tweedeKofferslot.getCijfer()));
        tweedeKofferslot.volgende();
        System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());


        tweedeKofferslot.setCombinatie('A', 'A', 0);
        System.out.println("Fucking modulus");
        for (int i = 0; i < 300; i++) {
            //System.out.printf("Cijfer is : %d volgende cijfer is : %d\n",
            //        tweedeKofferslot.getCijfer(), tweedeKofferslot.volgendeCijfer(tweedeKofferslot.getCijfer()));
            System.out.printf("%c%c%d\n", tweedeKofferslot.getEersteLetter(),
                    tweedeKofferslot.getTweedeLetter(), tweedeKofferslot.getCijfer());
            tweedeKofferslot.volgende();
        }
    }
}

package controller;

import model.Kofferslot;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 2.2 Kofferslot
 * <p>
 * Doel     Maak een Kofferslot class, waarbij het cijferslot bestaat uit 2 letters [A-Z] en 1 cijfer [0-9]
 */
public class KofferslotLauncher {
    public static void main(String[] args) {
        Kofferslot[] koffersloten = new Kofferslot[6];
        koffersloten[0] = new Kofferslot();
        koffersloten[1] = new Kofferslot('C','D',8);
        koffersloten[2] = new Kofferslot('A', 'A', 0);
        koffersloten[3] = new Kofferslot('B', 'R', 9);
        koffersloten[4] = new Kofferslot('D', 'Z', 9);
        koffersloten[5] = new Kofferslot('Z', 'Z', 9);

        for (Kofferslot kofferslot : koffersloten) {
            System.out.println(kofferslot);
            kofferslot.volgende();
            System.out.println(kofferslot);
        }

        koffersloten[0].setCombinatie('A', 'A', 0);
        System.out.println("Test slot modulus logica:");
        for (int i = 0; i < 7000; i++) {
            System.out.println(koffersloten[0]);
            koffersloten[0].volgende();
        }
    }
}

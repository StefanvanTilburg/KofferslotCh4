package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht 2.2 Kofferslot
 * <p>
 * Doel     Kofferslot class, waarbij het cijferslot bestaat uit 2 letters [A-Z] en 1 cijfer [0-9]
 */
public class Kofferslot {
    private static final char START_LETTER = 'A';
    private static final char EIND_LETTER = 'Z';
    private static final int START_CIJFER = 0;
    private static final int EIND_CIJFER = 9;
    private static final int VOLGENDE_ADDITIE = 1;
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setEersteLetter(eersteLetter);
        this.setTweedeLetter(tweedeLetter);
        this.setCijfer(cijfer);
    }

    public Kofferslot() {
        this(START_LETTER, START_LETTER, START_CIJFER);
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setEersteLetter(eersteLetter);
        this.setTweedeLetter(tweedeLetter);
        this.setCijfer(cijfer);
    }

    public char volgendeLetter(char letter) {
        return (char) ((letter - START_LETTER + VOLGENDE_ADDITIE) %
                        (EIND_LETTER - START_LETTER + VOLGENDE_ADDITIE) + START_LETTER);
    }

    public int volgendeCijfer(int cijfer) {
        return (cijfer + VOLGENDE_ADDITIE) % (EIND_CIJFER + VOLGENDE_ADDITIE);
    }

    public void volgende() {
        if (this.volgendeCijfer(this.getCijfer()) == START_CIJFER) {
            if (this.volgendeLetter(this.getTweedeLetter()) == START_LETTER) {
                this.setEersteLetter(this.volgendeLetter(this.getEersteLetter()));
            }
            this.setTweedeLetter(this.volgendeLetter(this.getTweedeLetter()));
        }
        this.setCijfer(this.volgendeCijfer(this.getCijfer()));
    }

    @Override
    public String toString() {
        return String.format("%c%c%d", this.getEersteLetter(), this.getTweedeLetter(), this.getCijfer());
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }

    public char getEersteLetter() {
        return eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }
}

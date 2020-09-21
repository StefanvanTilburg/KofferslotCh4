package model;

/**
 * @author Stefan van Tilburg
 * <p>
 * Opdracht
 * <p>
 * Doel
 */
public class Kofferslot {
    // TODO maak final variabelen aan: magic number party over here!
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setEersteLetter(eersteLetter);
        this.setTweedeLetter(tweedeLetter);
        this.setCijfer(cijfer);
    }

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.setEersteLetter(eersteLetter);
        this.setTweedeLetter(tweedeLetter);
        this.setCijfer(cijfer);
    }

    public char volgendeLetter(char letter) {
        return (char) ((letter - 'A' + 1) % ('Z' - 'A' + 1) + 'A');
    }

    public int volgendeCijfer(int cijfer) {
        return (cijfer + 1) % 10;
    }

    public void volgende() {
        if (this.volgendeCijfer(this.getCijfer()) == 0) {
            if (this.volgendeLetter(this.getTweedeLetter()) == 'A') {
                this.setEersteLetter(this.volgendeLetter(this.getEersteLetter()));
            }
            this.setTweedeLetter(this.volgendeLetter(this.getTweedeLetter()));
        }
        this.setCijfer(this.volgendeCijfer(this.getCijfer()));
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

package sk.uniza.fri;

/**
 * 28/11/2021 - 14:58
 *
 * @author romanlojko
 */
public class Parkovisko {
    private final Snimac snimacA;
    private final Snimac snimacB;
    private Stavy stavAutomatu;

    /**
     * Konstruktor
     */
    public Parkovisko() {
        this.snimacA = new Snimac();
        this.snimacB = new Snimac();
        this.stavAutomatu = Stavy.S0;
    }

    /**
     * Gettery
     */
    public Snimac getSnimacA() {
        return this.snimacA;
    }

    public Snimac getSnimacB() {
        return this.snimacB;
    }

    /**
     * Logika
     */
    public void nastavStavAutomatu() {
        switch (this.stavAutomatu) {
            case S0:
                if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S0;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S0;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S1;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S0;
                    break;
                } else {
                    break;
                }
            case S1:
                if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S1;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S2;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S1;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S0;
                    break;
                } else {
                    break;
                }
            case S2:
                if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S1;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S2;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S3;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S2;
                    break;
                } else {
                    break;
                }
            case S3:
                if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S3;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_0) {
                    this.stavAutomatu = Stavy.S3;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_0 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S3;
                    break;
                } else if (this.snimacA.getHodnotaVstupu() == Vstup.LOG_1 && this.snimacB.getHodnotaVstupu() == Vstup.LOG_1) {
                    this.stavAutomatu = Stavy.S2;
                    break;
                } else {
                    break;
                }


        }
    }


    /**
     * Getter  Stavu automatu
     * @return
     */
    public String getStav() {
        return String.valueOf(this.stavAutomatu);
    }

    /**
     * Helper pre signalizaciu
     * @return
     */
    public String signalizacia() {
        if (this.stavAutomatu == Stavy.S0) {
            return "ZELENÁ";
        } else if (this.stavAutomatu == Stavy.S1) {
            return "ZELENÁ";
        } else if (this.stavAutomatu == Stavy.S2) {
            return "ČERVENÁ";
        } else {
            return "ČERVENÁ";
        }
    }

}

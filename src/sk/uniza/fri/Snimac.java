package sk.uniza.fri;

/**
 * 28/11/2021 - 14:58
 *
 * @author romanlojko
 */
public class Snimac {
    private Vstup hodnotaVstupu;

    public Snimac() {
        this.hodnotaVstupu = Vstup.LOG_0;
    }

    public void setHodnotaVstupu(Vstup paHodnotaVstupu) {
        this.hodnotaVstupu = paHodnotaVstupu;
    }

    public Vstup getHodnotaVstupu() {
        return this.hodnotaVstupu;
    }
}

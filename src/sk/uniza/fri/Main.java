package sk.uniza.fri;

import java.awt.event.KeyListener;
import java.util.EventListener;
import java.awt.event.KeyEvent;

/**
 * Created by IntelliJ IDEA.
 * User: romanlojko
 * Date: 28/11/2021
 * Time: 14:58
 */
public class Main implements EventListener, KeyListener {

    private static Okno okno;
    private static Parkovisko parkovisko;

    public static void main(String[] args) {
        okno = new Okno();

        Main main = new Main();
        okno.addKeyListener(main);

        parkovisko = new Parkovisko();


    }

    public void resetniAutomat() {
        parkovisko = new Parkovisko();
        this.vypisDoOkna();
    }

    public void vypisDoOkna() {
        okno.setSnimacA(String.valueOf(parkovisko.getSnimacA().getHodnotaVstupu()));
        okno.setSnimacB(String.valueOf(parkovisko.getSnimacB().getHodnotaVstupu()));
        okno.setStav(parkovisko.getStav());
        okno.setSignalizacia(parkovisko.signalizacia());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // musia bzt kvoli keyeventu
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        // Tlacidlo R
        if (key == KeyEvent.VK_R) {
            resetniAutomat();
            return;
        }

        // Tlacidlo A
        if (key == KeyEvent.VK_A || key == KeyEvent.VK_B) {
            if (key == KeyEvent.VK_A) {
                if (parkovisko.getSnimacA().getHodnotaVstupu() == Vstup.LOG_0) {
                    parkovisko.getSnimacA().setHodnotaVstupu(Vstup.LOG_1 );

                } else {
                    parkovisko.getSnimacA().setHodnotaVstupu(Vstup.LOG_0);
                }
            }
            // Tlacidlo B
            if (key == KeyEvent.VK_B) {
                if (parkovisko.getSnimacB().getHodnotaVstupu() == Vstup.LOG_0) {
                    parkovisko.getSnimacB().setHodnotaVstupu(Vstup.LOG_1 );
                } else {
                    parkovisko.getSnimacB().setHodnotaVstupu(Vstup.LOG_0);
                }
            }
            parkovisko.nastavStavAutomatu();
            this.vypisDoOkna();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // musia bzt kvoli keyeventu
    }
}

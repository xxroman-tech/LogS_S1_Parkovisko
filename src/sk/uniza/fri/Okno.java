package sk.uniza.fri;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.KeyListener;

/**
 * 28/11/2021 - 14:58
 *
 * @author romanlojko
 */
public class Okno {

    private final JFrame frame;
    private final JPanel panel;
    private final GridBagConstraints gbc;
    private final Label snimacA;
    private final Label snimacB;
    private final Label stav;
    private final Label signalizacia;
    private final Font ovladanieFont;
    private final Font font;

    public Okno() {
        /**
         * Nastavenie fontu
         */
        this.ovladanieFont = new Font("Serif", Font.ITALIC, 15);
        this.font = new Font("Serif", Font.BOLD, 20);

        /**
         * Layout
         */
        this.gbc = new GridBagConstraints();

        this.frame = new JFrame("Parkovisko Zadanie S1");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLayout(new BorderLayout());

        this.panel = new JPanel();
        this.panel.setLayout(new GridBagLayout());

        Label label1 = new Label("Reset automatu --> Stlacte R");
        label1.setFont(this.ovladanieFont);

        this.snimacA = new Label();
        this.snimacA.setFont(this.font);
        this.snimacB = new Label();
        this.snimacB.setFont(this.font);
        this.stav = new Label();
        this.stav.setFont(this.font);
        this.signalizacia = new Label();
        this.signalizacia.setFont(this.font);

        /**
         * Ovladanie
         */
        this.setXY(0, 4, 2);
        this.panel.add(label1, this.gbc);

        /**
         * Programovy vypis
         */
        this.setXY(0, 0, 1);
        JLabel labelSnimace = new JLabel("Snímače");
        labelSnimace.setFont(this.ovladanieFont);
        this.panel.add(labelSnimace, this.gbc);

        // Snimac A
        this.setXY(0, 1, 1);
        JLabel labelSnimacA = new JLabel("A: ");
        labelSnimacA.setFont(this.font);
        this.panel.add(labelSnimacA, this.gbc);
        this.setXY(1, 1, 1);
        this.panel.add(this.snimacA, this.gbc);

        // Snimac B
        this.setXY(0, 2, 1);
        JLabel labelSnimacB = new JLabel("B: ");
        labelSnimacB.setFont(this.font);
        this.panel.add(labelSnimacB, this.gbc);
        this.setXY(1, 2, 1);
        this.panel.add(this.snimacB, this.gbc);

        // Stav automatu
        this.setXY(0, 3, 1);
        JLabel labelStav = new JLabel("Stav automatu: ");
        labelStav.setFont(this.font);
        this.panel.add(labelStav, this.gbc);
        this.setXY(1, 3, 1);
        this.panel.add(this.stav, this.gbc);

        // Signalizacia
        this.setXY(2, 3, 1);
        JLabel labelSignalizacia = new JLabel("Semafor: ");
        labelSignalizacia.setFont(this.font);
        this.panel.add(labelSignalizacia, this.gbc);
        this.setXY(3, 3, 1);
        this.panel.add(this.signalizacia, this.gbc);

        this.frame.add(this.panel, BorderLayout.CENTER);
        this.frame.setVisible(true);
        this.frame.pack();
        this.frame.setMinimumSize(new Dimension(800, 300));
        this.frame.setBounds(500, 500, 800, 300);
    }

    /**
     * Pomocna metoda pre nastavenie layout
     * @param x
     * @param y
     * @param width
     */
    private void setXY(int x, int y, int width) {
        this.gbc.gridx = x;
        this.gbc.gridy = y;
        this.gbc.gridwidth = width;
        this.gbc.fill = GridBagConstraints.BOTH;
        this.gbc.weightx = 0.1;
        this.gbc.weighty = 0.1;
    }

    public void setSnimacA(String text) {
        this.snimacA.setText(text);
    }

    public void setSnimacB(String text) {
        this.snimacB.setText(text);
    }

    public void setStav(String text) {
        this.stav.setText(text);
    }

    public void setSignalizacia(String text) {
        if (text.equals("ZELENÁ")) {
            this.signalizacia.setForeground(Color.GREEN);
        } else {
            this.signalizacia.setForeground(Color.RED);
        }
        this.signalizacia.setText(text);
    }

    /**
     * Keylistener pre ovladanie klavesnicou
     * @param keyListener
     */
    public void addKeyListener(KeyListener keyListener) {
        this.frame.addKeyListener(keyListener);
    }
}

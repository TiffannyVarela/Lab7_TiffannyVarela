/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_tiffannyvarela;

/**
 *
 * @author tiffa
 */
import javax.swing.JProgressBar;

public class adminTiempo extends Thread {
    private JProgressBar progBar;
    private boolean avanzar;
    private boolean vive;

    public adminTiempo(JProgressBar progBar) {
        this.progBar = progBar;
        avanzar = true;
        vive = true;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void setVida(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue() + 1);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }

    }
}

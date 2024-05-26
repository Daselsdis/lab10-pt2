package hlm;

import java.util.Random;

import hl.Casilla;

public class CasillaTresColores extends Casilla {
    static final Random r = new Random(31416);

    public CasillaTresColores() {
        int rnd = r.nextInt(0, 99);
        if (rnd < 20) {
            color = 1;
        } else if (rnd < 40) {
            color = 2;
        } else {
            color = 0;
        }
    }

    @Override
    public void cambiarColor() {
        color = (color + 1) % 3;
    }

}

package hlm;

import hl.Casilla;
import hl.ICuadricula;

public class CuadriculaTresColores implements ICuadricula {

    public static final int DIM = 11;
    protected CasillaTresColores[][] casillas = new CasillaTresColores[DIM][DIM];

    public CuadriculaTresColores() {
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                casillas[i][j]= new CasillaTresColores();
            }
        }
    }

    @Override
    public Casilla casilla(int x, int y) throws IndexOutOfBoundsException {
        if (x >= DIM || x < 0 || y >= DIM || y < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return casillas[x][y];
        }
    }

}

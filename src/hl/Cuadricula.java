package hl;

public class Cuadricula implements ICuadricula{
    public static final int DIM = 11;

    private Casilla[][] casillas = new Casilla[DIM][DIM];

    public Cuadricula(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[0].length; j++) {
                casillas[i][j]= new Casilla();
            }
        }
    }
    @Override
    public Casilla casilla (int i, int j)throws IndexOutOfBoundsException{
        if (i>=DIM||i<0||j>=DIM||j<0) {
            throw new IndexOutOfBoundsException();
        } else {
            return casillas[i][j];
        }
    }

    
}

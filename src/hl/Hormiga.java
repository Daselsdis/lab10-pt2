package hl;

public class Hormiga implements IHormiga {
    private int[] posicion = new int[]{0,0};
    private Orientacion orientacion;

    public Hormiga() {
        this.orientacion = Orientacion.IZQUIERDA;
    }

    @Override
    public void mover(int incX, int incY) {
        posicion[0] += incX;
        posicion[1] += incY;
    }

    @Override
    public Giro girar(ICuadricula cuadricula) {
        switch (cuadricula.casilla(posicion[0], posicion[1]).color) {
            case 0: // White
                return Giro.IZQUIERDA;
            case 1: // Black
                return Giro.DERECHA;
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public void cambiarColor(ICuadricula cuadricula) {
        cuadricula.casilla(posicion[0], posicion[1]).cambiarColor();    
    }

    @Override
    public void avanzar() {
        switch (orientacion.getAnguloEnGrados()) { //TODO ?????
            case 0:
                mover(0, 1);
                break;
            case 90:
                mover(-1, 0);
                break;
            case 180:
                mover(0, -1);
                break;
            case 270:
                mover(1, 0);
                break;
            default:
                break;
        }
    }

    @Override
    public void tick(ICuadricula cuadricula) {
        girar(cuadricula);
        cambiarColor(cuadricula);
        avanzar();
    }

    @Override
    public int[] coordenadas() {
        return posicion;
    }

    @Override
    public String rutaDeLaImagen() {
        return "res/ant_1.png";
    }

    @Override
    public int getAnguloEnGrados() {
        return orientacion.getAnguloEnGrados();
    }

}

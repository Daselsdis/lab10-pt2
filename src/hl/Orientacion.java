package hl;

public class Orientacion {
    private int rumbo;

    private static int[][] unitarios = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    private Orientacion(int rumbo) {
        this.rumbo = rumbo;
    }

    public Orientacion girarMediaVuelta() {
        return new Orientacion((rumbo + 2) % 4);
    }

    public Orientacion girarIzquierda() {
        return new Orientacion((rumbo - 1) % 4);
    }

    public Orientacion girarDerecha() {
        return new Orientacion((rumbo + 1) % 4);
    }

    public void mover(IHormiga h) {
        h.mover(unitarios[rumbo][0], unitarios[rumbo][1]);
    }

    public int getAnguloEnGrados(){
        return rumbo*90;
    }

    public static final Orientacion IZQUIERDA = new Orientacion(3);
}

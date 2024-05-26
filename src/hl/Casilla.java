package hl;

public class Casilla {
    protected int color;

    public Casilla(){
        color=0;
    }

    public void cambiarColor() {
        color = (color+1)%2;
    }

    public int color(){
        return color;
    }
}

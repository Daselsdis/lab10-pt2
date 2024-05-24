package hl;

public class Casilla {
    int color =0;

    public void cambiarColor() {
        color = (color+1)%2;
    }

    public int color(){
        return color;
    }
}

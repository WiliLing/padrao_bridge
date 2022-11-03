package org.bridge;

public class Warrior extends Classes{
    private int forca;

    public Warrior(float danoBase){
        super(danoBase);
    }

    public void setForca(int forca){
        this.forca = forca;
    }

    public float calcularDano(){
        return this.danoBase * this.forca * (1 + this.cr.multiplicadorDano());
    }

}

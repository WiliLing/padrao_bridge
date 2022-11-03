package org.bridge;

public abstract class Classes {
    protected ChallengeRating cr;
    protected float danoBase;


    public Classes(float danoBase) {
        this.danoBase = danoBase;
    }

    public void setRank(ChallengeRating cr){
        this.cr = cr;
    }
    public void setDanoBase(float danoBase){
        this.danoBase = danoBase;
    }


    public abstract float calcularDano();
}
package com.company;

public class Hero {
    // 2 constructeurs
    private int pointDeVie = 200;
    private int flasqueDeau;

    public Hero(int ptv, int fde) {
        this.pointDeVie = ptv;
        this.flasqueDeau = fde;
    }

    public int getPointDeVie() {
        //accède à l'objet en privé
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {

        this.pointDeVie = pointDeVie;
    }

    public int getFlasqueDeau() {

        return flasqueDeau;
    }

    public void setFlasqueDeau(int flasqueDeau) {

        this.flasqueDeau = flasqueDeau;
    }
}


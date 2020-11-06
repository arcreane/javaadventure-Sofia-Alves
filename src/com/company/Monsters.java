package com.company;

public class Monsters {

    // donnez des attributs, pv d'attaque. crée une classe
    //

    private String nom;
    private int pointDeVie;
    private int pointAttaque;

    public Monsters(String nom, int pointDeVie, int pointAttaque) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.pointAttaque = pointAttaque;
    }

    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public int getPointDeVie() {

        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {

        this.pointDeVie = pointDeVie;
    }

    public int getPointAttaque() {
        return pointAttaque;
    }

    public void setPointAttaque(int pointAttaque) {
        this.pointAttaque = pointAttaque;
    }
}

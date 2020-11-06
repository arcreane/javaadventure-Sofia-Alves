package com.company;

import java.util.Random;

public class Equipement {

    private String nom_Arme;
    private int degat;

    public Equipement(String nom_Arme, int degat) {
        this.nom_Arme = nom_Arme;
        this.degat = degat;
    }

    public String getNom_Arme() {

        return nom_Arme;
    }

    public void setNom_Arme(String nom_Arme) {

        this.nom_Arme = nom_Arme;
    }

    public int getDegat() {

        return degat;
    }

    public void setDegat(int degat) {

        this.degat = degat;
    }
}

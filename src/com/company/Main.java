package com.company;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Hero aventurier = new Hero(200, 100);

        aventurier.setFlasqueDeau(10);
        aventurier.setPointDeVie(200);

        System.out.println("Bienvenue dans le dongeon");
        System.out.println("Vous avez " + aventurier.getPointDeVie() + " Point de vie, " + aventurier.getFlasqueDeau() + " flasques pour combatre vos ennemies et une ");

        System.out.println("Room one");

    }

}

package com.company;

import java.util.Random;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Hero aventurier = new Hero(200, 100);
        Equipement epee = new Equipement("epee", 0);
        Monsters sorciere = new Monsters("witch", 180, 0);
        Monsters barbare = new Monsters("olaf", 160, 0);

        aventurier.setFlasqueDeau(10);
        aventurier.setPointDeVie(200);


        System.out.println("Bienvenue dans le dongeon");
        System.out.println("Vous avez " + aventurier.getPointDeVie() + " Point de vie, " + aventurier.getFlasqueDeau() + " flasques pour combatre vos ennemies et une ");
        int i = 1;
        do {

            if (aventurier.getPointDeVie() > 0) ;
            {
                System.out.println("Room" + i);

                Random random = new Random();
                int nbrAl = random.nextInt(1);

                if (nbrAl == 0) {
                    Monsters enemieActuel = sorciere;
                } else {
                    Monsters enemieActuel = barbare;
                }

                Monsters enemieActuel = barbare || sorciere;


                if (enemieActuel == barbare) {

                    do {
                        epee.setDegat((int) (5 + (Math.random() * 30)));
                        int degat = epee.getDegat();
                        barbare.setPointDeVie(barbare.getPointDeVie() - degat);
                        System.out.println("Il reste au barbare " + barbare.getPointDeVie());

                        barbare.setPointAttaque((int) (5 + (Math.random() * 30)));
                        int pointDattaque = barbare.getPointAttaque();
                        aventurier.setPointDeVie(aventurier.getPointDeVie() - pointDattaque);
                        System.out.println("il vous reste " + aventurier.getPointDeVie());

                    } while (aventurier.getPointDeVie() >= 0 && barbare.getPointDeVie() >= 0);
                    if (aventurier.getPointDeVie() > 0 && i == 5) {
                        System.out.println("Bravo vous avez gagné ! =)");
                    } else if (aventurier.getPointDeVie() > 0) {
                        System.out.println("Bravo tu passes à la pièce suivante");
                        aventurier.setPointDeVie(200);
                        barbare.setPointDeVie(160);
                        i += 1;
                    } else {
                        System.out.println("Game Over");
                        i = 6;
                    }

                }//else ---> faire le mm do while que pr le barbare mais ac la sorciere, pensé à utiliser la fiole et pas l'épée
                else {
                    do {
                        aventurier.setFlasqueDeau((int) (5 + (Math.random() * 30)));
                        int degat = aventurier.getFlasqueDeau();
                        sorciere.setPointDeVie(sorciere.getPointDeVie() - degat);
                        System.out.println("Il reste à la Sorcière " + sorciere.getPointDeVie());

                        sorciere.setPointAttaque((int) (5 + (Math.random() * 30)));
                        int pointDattaque = sorciere.getPointAttaque();
                        aventurier.setPointDeVie(aventurier.getPointDeVie() - pointDattaque);
                        System.out.println("il vous reste " + aventurier.getPointDeVie());

                    } while (aventurier.getPointDeVie() >= 0 && sorciere.getPointDeVie() >= 0);
                    if (aventurier.getPointDeVie() > 0 && i == 5) {
                        System.out.println("Bravo vous avez gagné ! =)");
                    } else if (aventurier.getPointDeVie() > 0) {
                        System.out.println("Bravo tu passes à la pièce suivante");
                        aventurier.setPointDeVie(200);
                        sorciere.setPointDeVie(160);
                        i += 1;
                    } else {
                        System.out.println("Game Over");
                        i = 6;
                    }
                }
            }
        } while (i <= 5 && aventurier.getPointDeVie() > 0);

    }
}


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
        // les dégats et point d'attaque seront agrémenté après en ramdom .

        aventurier.setFlasqueDeau(10);
        aventurier.setPointDeVie(300);


        System.out.println("Bienvenue dans le dongeon");
        System.out.println("Vous avez " + aventurier.getPointDeVie() + " Point de vie, " + aventurier.getFlasqueDeau() + " flasques pour combatre vos ennemies et une ");
        // variable en int est pour le nombre de pièce. Dans le do, selon la condition les pièces change.
        int i = 1;

        do {

            if (aventurier.getPointDeVie() > 0) ;// if pour avec en argument "aventurier.getPointDeVie..." pour continuer (pour pas) s'il a plus de vie !
            {
                System.out.println("Room" + i);

                Monsters enemieActuel;// pour random les enemies

                Random random = new Random();
                int nbrAl = random.nextInt(2);

                if (nbrAl == 0) {
                    enemieActuel = sorciere;
                } else {
                    enemieActuel = barbare;
                }

                // a cause de cette ligne (38), je n'arrive pas à faire le random entre barbare et sorcière !!!



                if (enemieActuel == barbare) {

                    // on va faire un random pour infliger nombre de dégat aléatoire.
                    //do et while
                    do {
                        //Le .get est une fonction renvoyant une propriété, alors que le .set définit la propriété.
                        epee.setDegat((int) (5 + (Math.random() * 30))); // int pour renvoyer un entier
                        int degat = epee.getDegat();
                        barbare.setPointDeVie(barbare.getPointDeVie() - degat); // on enlève les dégats au vie du barbare
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


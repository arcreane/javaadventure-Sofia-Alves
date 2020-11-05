package com.company;
import java.util.Random;

public class Equipement {
    private Random random;

    public Equipement() {
        random = new Random();
    }

    public int Coupdepee(){
        int b = (int) (5 +  (Math.random() * 30));
    }

}

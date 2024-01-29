package main;

import java.util.ArrayList;
import java.util.Scanner;

class Animal {//Animal luokka.
    String laji;
    String nimi;
    int ika;

    public Animal(String laji, String nimi, int ika) {//Animal rakentaja.
        this.laji = laji;
        this.nimi = nimi;
        this.ika = ika;
    }

    public void juokse() {//Juokse metodi.
        System.out.println(nimi + " juoksee kovaa vauhtia!");
    }

    public String toString() {//toString metodi.
        return laji + ": " + nimi + ", " + ika + " vuotta";
    }
}
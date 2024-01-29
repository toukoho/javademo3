package main;

import java.util.ArrayList;
import java.util.Scanner;

class Zoo {//Zoo luokka.
    private String nimi;
    private ArrayList<Elukka> elaimet;

    public Zoo(String nimi) {//Zoo rakentaja.
        this.nimi = nimi;
        this.elaimet = new ArrayList<>();//Luodaan lista, johon myöhemmin eläimet lisätään.
    }

    public void addElukka(Elukka elain) {//addElukka metodi.
        elaimet.add(elain);//Lisätään eläin eläimet listaan.
        System.out.println(elain.nimi + " lisätty " + nimi + "-eläintarhaan.");
    }

    public void listElukat() {//listElukat metodi.
        System.out.println(nimi + " pitää sisällään seuraavat eläimet:");
        for (Elukka elain : elaimet) {
            System.out.println(elain.toString());//Käydään for loopilla läpi Elukka tyyppiset eläimet listassa eläimet
        }
    }

    public void runElukat(int kierrokset) {//runElukat metodi.
        for (int i = 0; i < kierrokset; i++) {
            for (Elukka elain : elaimet) {
                elain.juokse();//Kutsutaan juokse metodia.
            }
        }
    }
}

class Elukka {//Elukka luokka.
    String laji;
    String nimi;
    int ika;

    public Elukka(String laji, String nimi, int ika) {//Elukka rakentaja.
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
package main;

import java.util.ArrayList;
import java.util.Scanner;

class Zoo {//Zoo luokka.
    private String nimi;
    private ArrayList<Animal> elaimet;

    public Zoo(String nimi) {//Zoo rakentaja.
        this.nimi = nimi;
        this.elaimet = new ArrayList<>();//Luodaan lista, johon myöhemmin eläimet lisätään.
    }

    public void addAnimal(Animal elain) {//addAnimal metodi.
        elaimet.add(elain);//Lisätään eläin eläimet listaan.
        System.out.println(elain.nimi + " lisätty " + nimi + "-eläintarhaan.");
    }

    public void listAnimal() {//listAnimal metodi.
        System.out.println(nimi + " pitää sisällään seuraavat eläimet:");
        for (Animal elain : elaimet) {//Käydään listan eläimet löpi for loopilla.
            System.out.println(elain.toString());//Tässä kohdassa kutsutaan toString metodia.
        }
    }

    public void runAnimal(int kierrokset) {//runAnimal metodi.
        for (int i = 0; i < kierrokset; i++) {
            for (Animal elain : elaimet) {//For loopilla käydään läpi kaikki listan eläimet, jotka sitten juoksevat.
                elain.juokse();//Kutsutaan juokse metodia.
            }
        }
    }
}
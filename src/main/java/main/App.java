package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Tämän avulla luetaan käyttäjän syöte.

        System.out.println("Anna eläintarhan nimi:");
        if (scanner.hasNextLine()) {
            String tarhaNimi = scanner.nextLine();
            Zoo elaintarha = new Zoo(tarhaNimi);
        
        while (true) { //Aloitetaan loop.
            System.out.println("1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma");
            int valinta = scanner.nextInt();
            scanner.nextLine(); 

            switch (valinta) { //Valikko.
                case 1:
                    System.out.println("Mikä laji?");
                    String laji = scanner.nextLine();
                    System.out.println("Anna eläimen nimi:");
                    String nimi = scanner.nextLine();
                    System.out.println("Anna eläimen ikä:");
                    int ika = scanner.nextInt();
                    scanner.nextLine(); // Tyhjentää rivinvaihdon 

                    Animal uusiElain = new Animal(laji, nimi, ika); //Luodaan Animal olio.
                    elaintarha.addAnimal(uusiElain);//Kutsutaan addAnimal metodia.
                    break;
                    
                case 2:
                    elaintarha.listAnimal();//Kutsutaan listAnimal metodia.
                    break;

                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int kierrokset = scanner.nextInt();
                    scanner.nextLine(); // Tyhjentää rivinvaihdon
                    elaintarha.runAnimal(kierrokset);//Kutsutaan runAnimal metodia.
                    break;

                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Syöte oli väärä.");
                    break;
            }   
        }
    }
}}
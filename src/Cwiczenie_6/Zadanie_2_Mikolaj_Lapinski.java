package Cwiczenie_6;

import javax.swing.*;
import java.util.Scanner;

public class Zadanie_2_Mikolaj_Lapinski {
    public static void main(String[] args) {


    }
}
class Animal {
    static Scanner scanner = new Scanner(System.in);
    static String []name = new String[100];
    static String [] age= new String[100];
    static String [] weight = new String[100];
    static  void eat(){
        System.out.println("Hej");

    }
    static void detVoice(){

    }

}
class Mammal extends Animal{
    static String IloscNug;

    static void pies(){
        System.out.println("Wpisz ilośc nug: ");
        IloscNug = scanner.next();
    }
}
class Dog extends Mammal {
    static String [] Breed = new String[100];
    static int i = 1;
    static void Breed(){

        System.out.println("Wpisz rasę: ");
        Breed [i] = scanner.next();
        i++;
    }
    static void odczyt(){

    }

}
class Bird extends Animal{
    static String featherColor;


}
class Pigeon extends Bird{
    static String species;
}
class Fish extends Animal{
    static String species;
}
class Blowfish extends Fish{
    static String nadmuchanie;
}
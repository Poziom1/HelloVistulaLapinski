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
        System.out.println("Co zwierzak je: ");

    }
    static void detVoice(){

    }

}
class Mammal extends Animal{
    static String [] IloscNug = new String[100];
    static String jedzenie [] = new String[100];
    static void pies( int i){
        System.out.println("Wpisz ilośc nug: ");
        IloscNug[i] = scanner.next();
    }
}
class Dog extends Mammal {
    static String [] Breed = new String[100];


    static void imie( int i){
        System.out.println("Napisz imie zwierzaka: ");
        name[i] = scanner.next();
    }
    static void wiek( int i){
        System.out.println("Wiek zwierzędzia: ");
        age[i]= scanner.next();
    }
    static void wysokosc( int i){
        System.out.println("Napisz wysokość zwierzaka: ");
        weight[i] = scanner.next();
    }
    static void eat( int i){
       eat();
       jedzenie [i] = scanner.next();
    }
    static void rasa( int i){
        System.out.println("Wpisz rasę: ");
        Breed [i] = scanner.next();

    }

    static void Zapisz(int i){
        System.out.println("Nowy pies");
        imie(i);
        wiek(i);
        rasa(i);
        wysokosc(i);
        eat(i);
        pies(i);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+Breed [j]+" "+weight[j]+" "+jedzenie [j]+" "+IloscNug[i]);
        }

    }
    static void odczyt(int i,int j){
        if (i>=j){
            for (int k = 0; j>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+Breed [k]+" "+weight[k]+" "+jedzenie [k]+" "+IloscNug[k]);
            }
        }else {
            for (int k = 0; i>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+Breed [k]+" "+weight[k]+" "+jedzenie [k]+" "+IloscNug[k]);
            }
            System.out.println("Nie ma wiecej zarejestrowanych psów.");
        }
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
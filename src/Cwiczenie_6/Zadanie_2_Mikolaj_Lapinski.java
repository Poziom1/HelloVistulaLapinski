package Cwiczenie_6;

import javax.swing.*;
import java.util.Scanner;

public class Zadanie_2_Mikolaj_Lapinski {
    static Scanner scanner = new Scanner(System.in);
    static int wybur;
    static int p,g,r, j= 0;
    static boolean wybór;
    static String wybórS;
    static boolean zakończ = false;
    public static void main(String[] args) {
        System.out.println("Witam "+System.getProperty("user.name")+", co dzisiaj robimy?");
        do{
            System.out.println("0. Wyjście.");
            System.out.println("1. Cała lista zwierząt.");
            System.out.println("2. Lista psów.");
            System.out.println("3. Zarejestruj psa.");
            System.out.println("4. Lista gołębi.");
            System.out.println("5. Zarejestruj gołębia.");
            System.out.println("6. Lista rozdymek.");
            System.out.println("7. Zarejestruj rozdymek.");
            System.out.println("Resta w trakcie robienia.");
            wybur = scanner.nextInt();
            switch (wybur){
                case 0:
                    zakończ = true;
                    break;
                case 1:
                    System.out.println("Psy:");
                    if(p>=1){

                        Dog.odczyt(p);
                    }else{
                        System.out.println("Nie ma listy.");
                    }
                    System.out.println("Gołębie:");
                    if (g>=1){

                        Pigeon.odczyt(g);
                    }else{
                        System.out.println("Nie ma listy.");
                    }
                    System.out.println("Rozdymki:");
                    if (r>=1){

                        Blowfish.odczyt(r);
                    }else{
                        System.out.println("Nie ma listy.");
                    }
                    break;
                case 2:
                    if(p>=1) {

                        System.out.println("Czy chcesz wyświetlić całą listę?");
                        wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                        if (wybór) {
                            System.out.println("Wybierz, wybierz z jakiego przedziału, jeżeli chcesz całą to "+p+" jest zarejestrowanych zwieźąt:");
                            j = scanner.nextInt();
                            Dog.odczyt(p,j);
                        } else {
                            System.out.println("Wybierz, numer zwieźęcia: ");
                            j = scanner.nextInt();
                            Dog.odczytPojedynczy(j);
                        }
                    }else {
                        System.out.println("Nie ma listy.");
                    }
                    break;
                case 3:
                    do{
                    System.out.println("Ile chcesz zarejestrować zwieżąt?");
                    j=scanner.nextInt();
                    for (int licz = 0;j>licz;licz++){
                        Dog.Zapisz(p);
                        Dog.odczytPojedynczy(p);
                        p++;
                    }
                    System.out.println("Czy napewno wszystkie?");
                    wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                    } while (!wybór);

                    break;
                case 4:
                    if(g>=1) {

                        System.out.println("Czy chcesz wyświetlić całą listę?");
                        wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                        if (wybór) {
                            System.out.println("Wybierz, wybierz z jakiego przedziału, jeżeli chcesz całą to "+g+" jest zarejestrowanych zwieźąt:");
                            j = scanner.nextInt();
                            Pigeon.odczyt(g,j);
                        } else {
                            System.out.println("Wybierz, numer zwieźęcia: ");
                            j = scanner.nextInt();
                            Pigeon.odczytPojedynczy(j);
                        }
                    }else {
                        System.out.println("Nie ma listy.");
                    }
                    break;
                case 5:

                    do{
                        System.out.println("Ile chcesz zarejestrować zwieżąt?");
                        j=scanner.nextInt();
                        for (int licz = 0;j>licz;licz++){
                            Pigeon.Zapisz(g);
                            Pigeon.odczytPojedynczy(g);
                            g++;
                        }
                        System.out.println("Czy napewno wszystkie?");
                        wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                    } while (!wybór);
                    break;
                case 6:
                    if(r>=1) {

                        System.out.println("Czy chcesz wyświetlić całą listę?");
                        wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                        if (wybór) {
                            System.out.println("Wybierz, wybierz z jakiego przedziału, jeżeli chcesz całą to "+r+" jest zarejestrowanych zwieźąt:");
                            j = scanner.nextInt();
                            Blowfish.odczyt(r,j);
                        } else {
                            System.out.println("Wybierz, numer zwieźęcia: ");
                            j = scanner.nextInt();
                            Blowfish.odczytPojedynczy(j);
                        }
                    }else {
                        System.out.println("Nie ma listy.");
                    }
                    break;
                case 7:

                    do{
                        System.out.println("Ile chcesz zarejestrować zwieżąt?");
                        j=scanner.nextInt();
                        for (int licz = 0;j>licz;licz++){
                            Blowfish.Zapisz(r);
                            Blowfish.odczytPojedynczy(r);
                            r++;
                        }
                        System.out.println("Czy napewno wszystkie?");
                        wybórS = scanner.next();
                        if(wybórS.contains("t")||wybórS.contains("y")){
                            wybór = true;
                        } else {
                            wybór = false;
                        }
                    } while (!wybór);
                    break;
            }
        }while(!zakończ);

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
    static void odczytPojedynczy( int j){
        System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+Breed [j]+" "+weight[j]+" "+jedzenie [j]+" "+IloscNug[j]);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+Breed [j]+" "+weight[j]+" "+jedzenie [j]+" "+IloscNug[j]);
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
    static String jedzenie [] = new String[100];
    static String [] featherColor = new String[100];
    static void kolorPiur( int i){
        System.out.println("Napisz kolor upierzenia zwierzaka: ");
        featherColor[i] = scanner.next();
    }

}
class Pigeon extends Bird{
    static String [] species = new String[100];
    static void wysokosc( int i){
        System.out.println("Napisz wysokość zwierzaka: ");
        weight[i] = scanner.next();
    }
    static void gatunek (int i){
        System.out.println("Napisz jaki to gatunek: ");
        species[i] = scanner.next();
    }
    static void imie( int i){
        System.out.println("Napisz imie zwierzaka: ");
        name[i] = scanner.next();
    }
    static void wiek( int i){
        System.out.println("Wiek zwierzędzia: ");
        age[i]= scanner.next();
    }
    static void eat( int i){
        eat();
        jedzenie [i] = scanner.next();
    }
    static void Zapisz(int i){
        System.out.println("Nowy gołąb");
        imie(i);
        wiek(i);
        wysokosc(i);
        gatunek(i);
        kolorPiur(i);
        eat(i);
    }
    static void odczytPojedynczy(int j){
        System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+featherColor[j]+" "+jedzenie [j]);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+featherColor[j]+" "+jedzenie [j]);
        }

    }
    static void odczyt(int i,int j){
        if (i>=j){
            for (int k = 0; j>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+species [k]+" "+weight[k]+" "+featherColor[k]+" "+jedzenie [k]);
            }
        }else {
            for (int k = 0; i>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+species [k]+" "+weight[k]+" "+featherColor[k]+" "+jedzenie [k]);
            }
            System.out.println("Nie ma wiecej zarejestrowanych psów.");
        }
    }
}
class Fish extends Animal{
    static String[] species = new String[100];
    static String[] jedzenie = new String[100];
}
class Blowfish extends Fish{
    static String[] nadmuchanie = new String[100];
    static void wysokosc( int i){
        System.out.println("Napisz wysokość zwierzaka: ");
        weight[i] = scanner.next();
    }
    static void nadmuchiwanie (int i){
        System.out.println("Napisz czy sie nadmuchuje: ");
        nadmuchanie[i] = scanner.next();
    }
    static void gatunek (int i){
        System.out.println("Napisz jaki to gatunek: ");
        species[i] = scanner.next();
    }
    static void imie( int i){
        System.out.println("Napisz imie zwierzaka: ");
        name[i] = scanner.next();
    }
    static void wiek( int i){
        System.out.println("Wiek zwierzędzia: ");
        age[i]= scanner.next();
    }
    static void eat( int i){
        eat();
        jedzenie [i] = scanner.next();
    }
    static void Zapisz(int i){
        System.out.println("Nowy rozdymka");
        imie(i);
        wiek(i);
        wysokosc(i);
        gatunek(i);
        eat(i);
        nadmuchiwanie(i);
    }
    static void odczytPojedynczy(int j){
        System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+jedzenie [j]+" "+nadmuchanie[j]);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+jedzenie [j]+" "+nadmuchanie[j]);
        }

    }
    static void odczyt(int i,int j){
        if (i>=j){
            for (int k = 0; j>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+species [k]+" "+weight[k]+jedzenie [k]+" "+nadmuchanie[k]);
            }
        }else {
            for (int k = 0; i>k;k++){
                System.out.println((k+1)+") "+name[k]+" "+age[k]+" "+species [k]+" "+weight[k]+" "+jedzenie [k]+" "+nadmuchanie[k]);
            }
            System.out.println("Nie ma wiecej zarejestrowanych psów.");
        }
    }
}
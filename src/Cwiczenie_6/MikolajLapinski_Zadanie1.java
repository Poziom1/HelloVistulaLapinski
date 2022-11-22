package Cwiczenie_6;

import java.util.Scanner;

public class MikolajLapinski_Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        Kadra.inicjuj1();
        Kadra.drukuj1();
    }
}
 class Osoba{
     public static String imie;
     public static String nazwisko;
     public static String ulica;
     public static String kod;
     public static String miasto;
    static void inicjuj(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imie: ");
        imie = scanner.next();
        System.out.println("Wpisz imie: ");
        nazwisko = scanner.next();
        System.out.println("Wpisz imie: ");
        ulica = scanner.next();
        System.out.println("Wpisz imie: ");
        kod = scanner.next();
        System.out.println("Wpisz imie: ");
        miasto = scanner.next();
    }
    static void drukuj(){
        System.out.println(" Imię: "+ imie+" Nazwisko: "+nazwisko+" Ulica: "+ulica+"Miasto: "+miasto+"Kod: "+kod);

    }

}
class Kadra extends Osoba{
    public static String wyksztalcenie;
    public static String stanowisko;
    static void inicjuj1(){
        inicjuj();
        Scanner scanner = new Scanner(System.in);
        wyksztalcenie=scanner.next();;
        stanowisko = scanner.next();;
    }
    static  void drukuj1(){
        System.out.println("Imię: "+ imie+"Nazwisko: "+nazwisko+"Ulica: "+ulica+"Miasto: "+miasto+"Kod: "+kod+"Wykształcenie: "+wyksztalcenie+"Stanowisko: "+stanowisko);
    }
}
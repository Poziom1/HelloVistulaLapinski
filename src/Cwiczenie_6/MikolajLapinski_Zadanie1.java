package Cwiczenie_6;

import java.util.Scanner;

public class MikolajLapinski_Zadanie1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wynagrodzenie f= new Kadra();
        System.out.println();
        Kadra.inicjuj1();

        Kadra.drukuj1();
        if(Kadra.maDodatek){
            System.out.println("Wynagrodzenie: "+f.wynagrodzenieZaNadgoedziny(f.wynagrodzenieDoWypłacenia(Kadra.wynagrodzenieNetto,Kadra.brutto),Kadra.Dodatek) );
        }else{
            System.out.println("Wynagrodzenie: "+ f.wynagrodzenieDoWypłacenia(Kadra.wynagrodzenieNetto,Kadra.brutto));
        }
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
        System.out.println("Wpisz nazwisko: ");
        nazwisko = scanner.next();
        System.out.println("Wpisz ulica: ");
        ulica = scanner.next();
        System.out.println("Wpisz kod: ");
        kod = scanner.next();
        System.out.println("Wpisz miasto: ");
        miasto = scanner.next();
    }
     static void drukuj(){
        System.out.println(" Imię: "+ imie+" Nazwisko: "+nazwisko+" Ulica: "+ulica+"Miasto: "+miasto+"Kod: "+kod);

    }

}
interface Wynagrodzenie{
    float wynagrodzenieDoWypłacenia(float wynNetto,float procentBrutto);
    default float wynagrodzenieZaNadgoedziny(float wypłata,float dodatek){return wypłata*dodatek;}
    static boolean sprawdzaPremie(int lataDoświadczenia){
        return lataDoświadczenia>2;
    }

}

class Kadra extends Osoba implements Wynagrodzenie{



    public static Scanner scanner = new Scanner(System.in);
    public static String wyksztalcenie;
    public static String stanowisko;
    public static float wynagrodzenieNetto,wynagrodzenieBrutto;
    public static float brutto = 23;
    public static int ilośćLatwPracy;
    public static boolean maDodatek;
    public static float Dodatek = 23;
    static void inicjuj1(){
        inicjuj();
        System.out.println("Wpisz wyksztalcenie: ");
        wyksztalcenie = scanner.next();
        System.out.println("Wpisz stanowisko: ");
        stanowisko = scanner.next();
        System.out.println("Wpisz ile pracował: ");
        ilośćLatwPracy = scanner.nextInt();
        System.out.println("Wpisz wynagrodzenie w netto: ");
        wynagrodzenieNetto = scanner.nextFloat();
        maDodatek = Wynagrodzenie.sprawdzaPremie(ilośćLatwPracy);

    }
       static void drukuj1(){




        drukuj();
        System.out.println(" Wykształcenie: "+wyksztalcenie+" Stanowisko: "+stanowisko);
    }

    @Override
    public float wynagrodzenieDoWypłacenia(float wynNetto, float procentBrutto) {

        return wynNetto-((wynNetto*procentBrutto)/100);
    }
}
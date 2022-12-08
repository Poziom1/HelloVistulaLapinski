package Cwiczenie_6;

import java.util.Arrays;
import java.util.Scanner;

public class Zadanie_2_Mikolaj_Lapinski {
    static AnimalBehavior Pies = new Dog();
    static AnimalMove PiesMove = new Dog();
    static AnimalBehavior Gołąb = new Pigeon();
    static AnimalMove GołąbMove = new Pigeon();
    static AnimalBehavior Rozdymka = new Blowfish();
    static AnimalMove RozdymkaMove = new Blowfish();
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
                        Dog.tab[p] [7]= Dog.sleep[p] = Pies.sleep();
                        Dog.tab[p][8]= PiesMove.move();
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
                            Pigeon.tab[g][8] = GołąbMove.move();
                            Pigeon.tab[g][7] = Pigeon.sleep[g]= Gołąb.sleep();
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
                            Blowfish.tab[r][8]= RozdymkaMove.move();
                            Blowfish.tab[r][7]=Blowfish.sleep[r]= Rozdymka.sleep();
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
interface AnimalBehavior{
    String sleep();


}
interface AnimalMove{
    String move();
}
interface AnimalName{
    static String name(){

    return null;}
}
class Animal implements AnimalMove, AnimalName{
    static Scanner scanner = new Scanner(System.in);
    static String tab[][] = new String[100][9];
    static String [] move = new String[100];
    static String []sleep = new String[100];
    static String []name = new String[100];
    static String [] age= new String[100];
    static String [] weight = new String[100];
    static  void eat(){
        System.out.println("Co zwierzak je: ");

    }
    static void detVoice(){

    }

    @Override
    public String move() {
        return null;
    }
    public static String name(){
        return "Tu powinna być jakaś funkcja gatName, ale na wcześniejszych zajęciach jej nie robiliśmy. ";
    }
}
class Mammal extends Animal implements AnimalMove{
    static String [] IloscNug = new String[100];
    static String jedzenie [] = new String[100];
    static void pies( int i){
        System.out.println("Wpisz ilośc nug: ");
        IloscNug[i] = scanner.next();
    }
}
class Dog extends Mammal implements AnimalBehavior,AnimalMove {
    static String [] Breed = new String[100];


    static void imie(int i){
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
        tab[i][0]=(i+1)+") ";
        imie(i);
        tab[i][1] = name[i];
        wiek(i);
        tab[i][2] = age[i];
        rasa(i);
        tab[i][3]=Breed[i];
        wysokosc(i);
        tab[i][4]= weight[i];
        eat(i);
        tab[i][5] = jedzenie[i];
        pies(i);
        tab[i][6] = IloscNug[i];
    }
    static void odczytPojedynczy( int j){
        System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+Breed [j]+" "+weight[j]+" "+jedzenie [j]+" "+IloscNug[j]+" "+sleep[j]);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println(Arrays.toString(tab[j]));
        }

    }
    static void odczyt(int i,int j){
        if (i>=j){
            for (int k = 0; j>k;k++){
                System.out.println(Arrays.toString(tab[k]));
            }
        }else {
            for (int k = 0; i>k;k++){
                System.out.println(Arrays.toString(tab[k]));
            }
            System.out.println("Nie ma wiecej zarejestrowanych psów.");
        }
    }


    @Override
    public String sleep() {
        System.out.println("Napisz ile śpi zwierzak: ");
        return scanner.next();
    }
    public String move(int i){
        return tab[i][8]="Dog run on four paws.";
    }
}
class Bird extends Animal implements AnimalMove{
    static String jedzenie [] = new String[100];
    static String [] featherColor = new String[100];
    static void kolorPiur( int i){
        System.out.println("Napisz kolor upierzenia zwierzaka: ");
        featherColor[i] = scanner.next();
    }

}
class Pigeon extends Bird implements AnimalBehavior, AnimalMove{
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
        tab[i][0]=(i+1)+"";
        imie(i);
        tab[i][1] = name[i];
        wiek(i);
        tab[i][2] = age[i];
        wysokosc(i);
        tab[i][3]=weight[i];
        gatunek(i);
        tab[i][4]=species[i];
        kolorPiur(i);
        tab[i][5]=featherColor[i];
        eat(i);
        tab[i][6]=jedzenie[i];

    }
    static void odczytPojedynczy(int j){
        System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+featherColor[j]+" "+jedzenie [j]+" "+sleep[j]);
    }
    static void odczyt(int i){
        for (int j = 0; i>j;j++){
            System.out.println((j+1)+") "+name[j]+" "+age[j]+" "+species [j]+" "+weight[j]+" "+featherColor[j]+" "+jedzenie [j]+" "+sleep[j]);
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

    @Override
    public String sleep() {
        return scanner.next();
    }
    public String move(int i){
        return "Pigeon is fly.";
    }
}
class Fish extends Animal implements AnimalMove{
    static String[] species = new String[100];
    static String[] jedzenie = new String[100];
}
class Blowfish extends Fish implements AnimalBehavior, AnimalMove{
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
        tab[i][0]=(i+1)+"";
        imie(i);
        tab[i][1]=name[i];
        wiek(i);
        tab[i][2]=age[i];
        wysokosc(i);
        tab[i][3]=weight[i];
        gatunek(i);
        tab[i][4]=species[i];
        eat(i);
        tab[i][5] = jedzenie[i];
        nadmuchiwanie(i);
        tab[i][6] = nadmuchanie[i];
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

    @Override
    public String sleep() {
        return scanner.next();
    }
    public String move(){
        return null;
    }
}
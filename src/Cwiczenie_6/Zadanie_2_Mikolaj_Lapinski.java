package Cwiczenie_6;

import javax.swing.*;

public class Zadanie_2_Mikolaj_Lapinski {
    public static void main(String[] args) {

    }
}
class Animal {
    String []name = new String[100];
    String [] age= new String[100];
    String weight;
    static  void eat(){
        String food;

    }
    static void detVoice(){

    }

}
class Mammal extends Animal{
    String IloscNug;
    static void pies(){

    }
}
class Dog extends Mammal{
    String Breed;

}
class Bird extends Animal{
    String featherColor;

}
class Pigeon extends Bird{
    String species;
}
class Fish extends Animal{
    String species;
}
class Blowfish extends Fish{

}
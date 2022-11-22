import java.util.Random;

public class ćwiczenieNr5Zadanie2MŁ59357 {
    public static void main(String[] args) {
        int min = 100;
        int max = 0;
        Random generator = new Random();
        int tab[] = new int[10];
        for (int i = 0; i<10;i++){
            tab[i] = (generator.nextInt(100)+1);
            if (tab[i] < min) {
                min = tab [i];
            } else if (tab[i]>max) {
                max = tab[i];
            }
            System.out.println("Tablica ["+i+"] ma wartość: "+tab[i] );
        }
        System.out.println("Minimalna liczba z tablicy: "+ min );
        System.out.println("Maksymalna liczba z tablicy: "+ max );
    }
}

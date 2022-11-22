import java.util.Scanner;

public class ćwiczenieNr5Zadanie4MŁ59357 {
    public static void main(String[] args) {
        String pierwszy;
        String drógi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsze: ");
        pierwszy = scanner.next();
        System.out.print("Podaj drógie: ");
        drógi = scanner.next();
        String Sum1 = pierwszy+drógi;
        String Sum2 = drógi+pierwszy;
        System.out.println("Pierwsze + drógie = "+Sum1);
        System.out.println("Drógie + pierwsze = "+Sum2);


    }
}

public class ćwiczenieNr5Zadanie3MŁ59357 {
    public static void main(String[] args) {
        int matrix[][]= new int[10][10];
        int suma = 0;
        System.out.println("Tablica dwuwymiarowa: ");

        for (int i1 =0;i1<10;i1++){
            for (int i2=0;i2<10;i2++){
                if (i1 == i2) {
                    matrix[i1][i2] = i1;
                    suma += i1;
                }else
                    matrix[i1][i2] = 0;
                System.out.print(matrix[i1][i2]);
            }
System.out.println();
        }
        System.out.println("Suma przekątnej: "+ suma);
    }
}

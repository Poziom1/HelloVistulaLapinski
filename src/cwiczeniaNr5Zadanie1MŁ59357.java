public class cwiczeniaNr5Zadanie1MŁ59357 {
    public static void main(String[] args) {
        int tab[] = new int[10];
        int i,i2;
        i2=0;
        for (i=tab.length;i>0;i--) {
            tab[i - 1] = i2;
            i2++;
        }
        i2 = 0;
        for(int x: tab){
            System.out.println("Wartość tablicy ["+i2+"]: "+ x );
            i2++;
        }
    }
}

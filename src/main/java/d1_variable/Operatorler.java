package d1_variable;

public class Operatorler {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(a + b);


        b = b + a;
        b = b - a;
        b = b * a;
        b = b / a;


        String name = "Ankara";
        System.out.println(name);//ankara
        name = "Istanbul";
        System.out.println(name);//istabul


//Ornek 1: Bir String ve iki int variable olusturun.
// String degeri ile Integer’larin topla console’a yazdirin.

        String name1 = "Fatma";
        int a1 = 30;
        int b1 = 7;
        System.out.println(name1 + (a1 + b1));//false
        System.out.println();


        int a2 = 3;
        int b2 = 5;
        int c = 4;
        int d = 3;
        System.out.println(a2 == c);//false
        System.out.println(b2 < d);//false
        System.out.println(a2 == d);//true
        System.out.println(b2 > c);//true
        System.out.println(c != d);//true

        int f = 12;
        int m = 6;
        int s = 4;

        boolean kosul1 = (f < m);
        boolean kosul2 = (m > s);
        boolean sonuc = kosul2 || kosul1;
        System.out.println(sonuc);


    }
}


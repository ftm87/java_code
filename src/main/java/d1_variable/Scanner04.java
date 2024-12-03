package d1_variable;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {


        int mat, kimya, tarih, fizik;


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen mateamtik notunu giriniz");
         mat = scan.nextInt();

        System.out.println("Lutfen kimya notunu giriniz");
        kimya = scan.nextInt();

        System.out.println("Lutfen tarih notunu giriniz");
        tarih = scan.nextInt();

        System.out.println("Lutfen fizik notunu giriniz");
        fizik = scan.nextInt();

        int toplam =mat+kimya+tarih+fizik;
        double sonuc =toplam/2;

        System.out.println(sonuc);


    }
}
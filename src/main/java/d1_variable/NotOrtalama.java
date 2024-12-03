package d1_variable;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {

        //kosullu ifadeleler sinifi gecme durumunu kontrol ediniz ortalama=55 ise gecti


        Scanner scan =new Scanner(System.in);

        System.out.println("Mtematik notunuz: ");
        int mat = scan.nextInt();

        System.out.println("Fizik notunuz: ");
        int fizik = scan.nextInt();

        System.out.println("Kimya notunuz: ");
        int kimya = scan.nextInt();

        System.out.println("Tarih notunuz: ");
        int tarih = scan.nextInt();

        System.out.println("Turkce notunuz: ");
        int turk = scan.nextInt();

       double  ort =(mat+fizik+kimya+tarih+turk)/5;

       if (ort<=55){
           System.out.println("Sinifta kaldiniz seneye tekrar gorusmek uzere");
       }else {
           System.out.println("Tebrikler sinifi gectiniz");
       }
        System.out.println("Ortalamaniz:"+ ort);
    }
}

package d1_variable;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

                    /*Ornek 1:
                Kullanıcıdan;

                i)Adini ve Soyadini ii)Yaşını
                iii)Boyunu
                iv)Kilosunu
                v)Medeni durumunu girmesini isteyin.
                */


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
       String name=scan.nextLine();
        System.out.println("Litfen soyadinizi girin");
        String surname=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int age =scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        int boy = scan.nextInt();
        System.out.println("Lutfen kilonuzu giriniz");
        double weight = scan.nextDouble();
        System.out.println("Lutfen medeni durumunuzu giriniz");
        String durum =scan.next();
scan.close();

        //Ornek 3: Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz.

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=input.nextDouble();
        double sayi2 =input.nextDouble();
        System.out.println(sayi1+sayi2);



    }
}
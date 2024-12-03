package d2_ternaryStringManipulation;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String pwd = input.nextLine();


        // i)En az 8 karakter olsun

        boolean uzunluk =pwd.length()>7;

        // ii)Space karakteri password'de olmasin

         boolean kontrol =!pwd.contains(" ");

        // iii)En az bir tane buyuk harf olsun

        boolean bHrf=pwd.replaceAll("[^A-Z]","").length()>0;


        //iv)En az bir tane kucuk harf olsun

        boolean kHrf =pwd.replaceAll("[^a-z]","").length()>0;

       // v)En az bir tane rakam olsun

        boolean rkm =pwd.replaceAll("[^0-9]","").length()>0;


        boolean sonucDogru =uzunluk && kontrol && kHrf && bHrf && rkm;

        if (sonucDogru){
            System.out.println("Sifre gecerli");

        }else {
            System.out.println("Sifre gecersiz");
        }


    }
}

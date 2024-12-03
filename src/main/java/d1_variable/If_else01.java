package d1_variable;

import java.util.Scanner;

public class If_else01 {
    public static void main(String[] args) {

        int a =4;
        int b = 2;
        if (b<a){
            System.out.println("condition dogru");
        }
        if (b>a){
            System.out.println("condition yanlis");
        }

        //Ornek 1: Sayi 0 (dahil) ile 10 (haric) arasinda ise ekrana "Rakam" yazdirin.

        int num =11;
        if (num>=0 && num<10){
            System.out.println("Rakam");
        }else {
            System.out.println("Rakam degil");
        }

        //Ornek 2: Sayi uc basamakli ise ekrana "Sayi üç basamaklidir" yazdirin.

        int sayi =123;
        if (sayi>99 && sayi<1000){
            System.out.println("Sayi üç basamaklidir");
        }else {
            System.out.println("Sayi üç basamakli degildir");
        }

        //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num1 =input.nextInt();
         if (num1%2==0){
             System.out.println("cift sayi");
         }
         if (num1%2!=0){
             System.out.println("tek sayi");
         }

    }
}

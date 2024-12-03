package d2_ternaryStringManipulation;

import java.util.Scanner;

public class Tearnary {
    public static void main(String[] args) {

        //Ornek : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        //Example : Write the code to check if the given number has 3 digits


     //(condition)? true :false;

        int a =-123;

        a =Math.abs(a);

      String result  = (a>99 && a < 1000) ? "Sayi uc basamaklidir": "Sayi uc basamkli degildir";


        System.out.println(result);



        /*kullanicindan bir tamsyi alin
        Eger tam sayi 0 dan kucuk ise ekrana "Negatif "
        Diger durumlarda ekrana "Negatif degil " yazdirin  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        String result1=(sayi<0) ? "Negatif" : "Negatif degil";
        System.out.println(result1);

      // eger iki data tipi olursa onu direk soutta yazdirin -

    }

}

package d1_variable;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.---23453----23+53=76



        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int sayi = input.nextInt();

        int ilkbasamak=sayi/1000;
        int sonbasamak =sayi%100;
        System.out.println(ilkbasamak+sonbasamak);
    }
}

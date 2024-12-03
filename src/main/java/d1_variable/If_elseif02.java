package d1_variable;

import java.util.Scanner;

public class If_elseif02 {
    public static void main(String[] args) {

        //Ornek 1:Kullanicidan alinan bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi>0) {
            System.out.println("Sayi pozitif");
        } else if (sayi<0) {
            System.out.println("Sayi negatif");
        } else if (sayi==0) {
            System.out.println("Sayi notur");
        }

    }
}

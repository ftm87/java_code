package d1_variable;

import java.util.Scanner;

public class If_elseif {
    public static void main(String[] args) {
        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu olusturunuz.

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis*/

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int age = input.nextInt();

        if (age<0){
            System.out.println("Lutfen gecerli bir yas giriniz");
        } else if (age<5 ){
            System.out.println("bebek");
        } else if (age<13) {
            System.out.println("cocuk");
        } else if (age<21) {
            System.out.println(" genc");
        } else if (age<31) {
            System.out.println("yetiskin");
        }else {
            System.out.println("Tanimlanmamis");
        }


    }
}

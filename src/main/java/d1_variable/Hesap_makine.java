package d1_variable;

import java.util.Scanner;

public class Hesap_makine {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("ilk sayi giriniz");
        int n1 =scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminz: ");
        int select= scan.nextInt();

        if (select==1){
            System.out.println("Toplam:"+(n1+n2));
        } else if (select==2) {
            System.out.println("cikarma:"+(n1-n2));
        } else if (select==3) {
            System.out.println("Carpma:"+(n1*n2));
        } else if (select==4) {
           if (n2!=0){
               System.out.println("bolme:"+(n1/n2));
           }else {
               System.out.println("bir sayi 0 a bolunmez");
           }

        }else {
            System.out.println("yanlis secim yaptiniz tekrar deneyiniz");
        }

       //---------------------------------------------------------------------

       switch (select){
           case 1:
               System.out.println("Toplam:"+(n1+n2));
               break;
           case 2:
               System.out.println("cikarma:"+(n1-n2));
               break;
           case 3:
               System.out.println("Carpma:"+(n1*n2));
               break;
           case 4:
               if (n2!=0){
                   System.out.println("bolme:"+(n1/n2));
               }else {
                   System.out.println("bir sayi 0 a bolunmez");
               }
               break;
           default:
               System.out.println("yanlis secim yaptiniz tekrar deneyiniz");






       }


    }


}

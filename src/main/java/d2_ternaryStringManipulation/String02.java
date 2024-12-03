package d2_ternaryStringManipulation;

public class String02 {
    public static void main(String[] args) {

        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

          String s="Learn Java earn money";
          String result= s.replace("money","dolar");
          System.out.println(result);//Learn Java earn dolar

        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.

        String result1 =s.replace("e","");
        System.out.println(result1);


        //Ornek 1: s1 String’indeki tum rakamlari(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) “*” a ceviriniz.

        String s1 ="1,2,3 Hayat Guzeldir.! 3,2,1";

        String sonuc =s1.replaceAll("[0-9]","*");
        System.out.println(sonuc);//*,*,* Hayat Guzeldir.! *,*,*
        String sonuc2=s1.replaceAll("\\p{Punct}","*");
        System.out.println(sonuc2);

        //Ornek 2: “s1” String’indeki rakam sayisini bulunuz.

        int s3 =s1.replaceAll("[^¨0-9]","").length();
        System.out.println(s3);//6

    }
}

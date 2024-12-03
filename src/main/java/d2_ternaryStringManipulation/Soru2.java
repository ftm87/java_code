package d2_ternaryStringManipulation;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
olmadığını kontrol etmek için kod yazınız.
Örnek:‘Ali  Can’ için konsolda false yazmalıdır.

         */
        String name ="  Ali Can ";
        String name1 =name.trim().replaceAll("\\s","");

        boolean sonuc =name.trim().length()-name1.length()==1;
        System.out.println("ortada tek bosluk var :"+sonuc);






    }
}

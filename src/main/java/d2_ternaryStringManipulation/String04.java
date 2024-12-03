package d2_ternaryStringManipulation;

public class String04 {
    public static void main(String[] args) {


        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv ="$456.99";
        String laptop ="$875.99";

       tv =tv.replace("$","");
       laptop =laptop.replace("$","");

       double total  =Double.valueOf(tv)+Double.valueOf(laptop);

        System.out.println(total);

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuk hale getirerek console'a yazdiriniz.
        //           "   ali cAN   " ==> AC

        String name ="  ali cAN  ";

        char isim1 =name.trim().toUpperCase().charAt(0);
        char isim2 =name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(""+isim1+isim2);














    }
}

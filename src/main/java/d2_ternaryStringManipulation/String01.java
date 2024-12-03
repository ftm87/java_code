package d2_ternaryStringManipulation;

public class String01 {
    public static void main(String[] args) {

        //Ornek 1: "s" String'inde kullanilan karakter sayisini bulunuz.

        //NOT: string ifadelerde karakter sayini bulmak icin kullanilan method-- lenght()

        String s ="Benim adim fatma ve ben mutluyum";

        int s1 =s.length();
        System.out.println(s1);//32


        //Ornek 2: "s" String'inde ilk ve son index'teki karakterleri aliniz.

        char s2 =s.charAt(0);
        System.out.println(s2);//B
        char s3 =s.charAt(s.length()-1);
        System.out.println(s3);//m

        //Ornek 3: “s” String’indeki ilk 4 karakteri aliniz.

        //NOTE;stringde eger belli karakterler isteniyorsa subsitring kullanilmali

        String ilk =s.substring(0,4);
        System.out.println(ilk);

        //Ornek 4: “s” String’indeki “fatma” kelimesini aliniz.

        String s4 =s.substring(11,16);
        System.out.println(s4);//fatma

        //Note: substring(int beginIndex): Belirtilen indeksten başlayarak sonuna
        // kadar olan substring'i döndürür.tek parametreli kullanim

       String s5 =s.substring(24);
        System.out.println(s5);

        //Ornek 6: “s" String'inde fatma kelimesinin var olup olmadigini kontrol ediniz.

        boolean b1 =s.contains("fatma");
        System.out.println(b1);//true

        //Ornek 7: “s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.

             boolean b2 =s.startsWith("B");
        System.out.println(b2);//true


        //Ornek 8: "s" String'inin "mutluyum" ile bitip bitmedigini kontrol ediniz.

        boolean b3 =s.endsWith("mutluyum");
        System.out.println(b3);//TRUE

    }
}

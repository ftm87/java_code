package d2_ternaryStringManipulation;

public class Soru {
    public static void main(String[] args) {
       /* Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.*/



        String cty = " mIAMI ";
        cty=cty.trim().toLowerCase();
        String name =cty.substring(0,1).toUpperCase()+cty.substring(1);
        System.out.println(name);//Miami
     //--------------------------------------------

        //Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        //Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz

       String s1 =" Ali Can";
       String s2 ="Merve Star";
       String s3 ="Mark Tom";

       Integer name1=s1.replaceAll("\\s","").length();
       Integer name2=s2.replaceAll("\\s","").length();
       Integer name3=s3.replaceAll("\\s","").length();
        System.out.println(name1+name2+name3);//22

    /*
    replaceAll("\\s", ""), s1 string'inde bulunan tüm boşluk karakterlerini
     boş string ("") ile değiştirir,yani kaldırır.
     */

    //---------------------------------------------

       /* Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir*/


        String sehir= "Miami 33018!!!";

        Integer toplam=sehir.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println(toplam);
     //----------------------------------------
       /* Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.*/


        String karakter ="1a3Bcf4!...";
        Integer sonuc =karakter.replaceAll("[0-9]","").length();
        System.out.println(sonuc);

     //----------------------------------------------------------

       /* Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.  */

        String shrf=" Ali Can  ";
        int sn=shrf.trim().length()-1;
        String sn2 =shrf.trim().substring(sn,sn+1);
        System.out.println(sn2);

        //-----------------------------------
     /*
     Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
      */
       String a="Java";
     String sonuc2 = a.substring(1);
        System.out.println(sonuc2);//ava

             /*
             Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız

              */
        //1.yol
     String ad = "Java";
     String b =ad.toUpperCase().substring(0,3);
      //  System.out.println(b);//JAV
        //2.yol
        Integer sonKrkter =ad.length()-1;
        String c =ad.substring(0,sonKrkter).toUpperCase();
        System.out.println(c);//JAV




        //-----------------------------


    }
}

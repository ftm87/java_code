package d2_ternaryStringManipulation;

public class String05 {
    public static void main(String[] args) {


        //Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz.      abc@gmail.com ===> gmail


        String s = " abc@gmail.com";
        String s1 = s.substring(5, 10);
        System.out.println(s1);//gmail

        String s2 =s.split("@")[1].split("\\.")[0];
        System.out.println(s2);//gmail



        //Ornek 1: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        // yusuf ==> ysf


        String name = "yusuf";

        if (name.indexOf("y")==name.lastIndexOf("y")){
            System.out.print("y");
        }

        if (name.indexOf("s")==name.lastIndexOf("s")){
            System.out.print("s");
        }

        if (name.indexOf("f")==name.lastIndexOf("f")){
            System.out.print("f");
        }

        System.out.println();

        //Ornek 2: Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın

        //           1234 6789 1234 6789 ==> **** **** **** 6789


         String cardnum="1234 6789 1234 6789";
         String sonuc =cardnum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(sonuc);//**** **** ****


        String last =cardnum.substring(15);
        System.out.println(last);//6789

         String result =(sonuc+last);
        System.out.println(result);//**** **** **** 6789

        //----------------------------------------------

         /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        String pwd ="a";


        // 1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        boolean pwdEmpty =pwd.isEmpty();
        System.out.println(pwdEmpty);//false

        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.

        boolean pwdBlank=pwd.isBlank();
        System.out.println(pwdBlank);


        //3- Başında ve sonunda boşluk olmamalıdır

        boolean pwdTrim =pwd.trim().equals(pwd);
        System.out.println(pwdTrim);

      if (pwdEmpty){
          System.out.println("hicbirsey yazmadan gecilmez");
      }
      if (pwdBlank){
          System.out.println("Parola bos birakilmamali ve bosluk haric karakterler olmali");
      }
      if (!pwdTrim){
          System.out.println("Parolada basinda ve sonunda bosluk olmamali");
      }

    }



}

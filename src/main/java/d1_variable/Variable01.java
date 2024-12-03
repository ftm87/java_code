package d1_variable;

public class Variable01 {
    public static void main(String[] args) {

        int number = 10;
        number=15;
        System.out.println(number);//15



        //ORNEK;bir dikdortgenin cevresini ve alanini hesaplayan variable yapalim


        int kisaKenar =12;
        int uzunKenar =3;
        int alan =kisaKenar*uzunKenar;
        int cevre =2*(kisaKenar+uzunKenar);
        System.out.println(alan);//36
        System.out.println(cevre);//30



       char c1 ='J';
       char c2 ='A';
       char c3 ='V';
       char c4 ='A';
        System.out.println(""+ c1 + c2 + c3 + c4);//JAVA cift tirnak eklemeliyiz cunku string istiyorum
    }
}

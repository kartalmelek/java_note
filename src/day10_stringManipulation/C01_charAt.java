package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str ="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harf yazdir  J

        System.out.println(str.toUpperCase().charAt(7));  // R yazdirir

        System.out.println(str.charAt(21)); //  l

       // System.out.println(str.charAt(22));  // hata verir
       // son harfi bulmak icin str'in uzunlugunun 1 eksigi index olarak gireriz
       // eger index olarak uzunlugu veya daha bir sayiyi girersek java exception  verir


       // charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
       // String methodlaridan kullanmamiz gereken bir method varsa
       // chatAt( )'den once kullanmaliyiz
    }

}

package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {


        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // Bana integer dondurur
                                              // int'de yok diye bir deger bulunmuyor
                                              // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
                                              // Java -1 dondurmeyi tercih etmistir
        String str5 ="wertvfuuimsawhpjnmsawzu,axft.";

        // str5'de p harfi varmidir.
        if (str5.indexOf("p")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5'de istenen karakter kullanilmis");
        }

    }
}

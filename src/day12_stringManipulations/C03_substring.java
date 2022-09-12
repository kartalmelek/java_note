package day12_stringManipulations;

import java.util.Locale;

public class C03_substring {
    public static void main(String[] args) {

        String isim ="Suleyman";
        String soyisim ="Karanfil";
        String kartNo ="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyisim.substring(soyisim.length()-3));

        System.out.println(isim.substring(2,4));// le

        // isim ve soyisim ilk harf, geriye kalam *
        // kredi kartinin ilk 4 rakamai gorunsun geriye kalan *

        String isimIlkHarf =isim.substring(0,1).toUpperCase(Locale.ROOT);
        String isimGeriyeKalan= isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf =soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGriyeKlanlar=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "
                +soyisimIlkHarf+soyisimGeriyeKalan+"\n "
                +kkIlk4+kkGriyeKlanlar );



    }
}

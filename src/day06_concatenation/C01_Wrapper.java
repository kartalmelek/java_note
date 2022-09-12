package day06_concatenation;

import java.util.Scanner;

public class  C01_Wrapper {
    public static void main(String[] args) {

        /*
         Wrapper class javanin hazir methodlari kullanabilmemiz icin
         primitive data turlerinin herbiri icin actigi class'lardir

         int-->Integer
         char-->Character
         digerleri primitive data turu ile ayni sadece bas harfi buyuk
         */

        String str= "Java ile hayat cok guzel";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT COK GUZEL

        boolean guzelMi = true;
        // guzelMi. boolean primitive oldugundan hazir methodu bulunmuyor

        Boolean buGuzelmi = true;
        buGuzelmi.toString();

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32768


        String ogrNo= "123456";

        // kullanicidan bir sifre isteyin
        //eger sifre rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi= Integer.parseInt(sifre);


        System.out.println("girilen sifre:"+ sifre);
        System.out.println("Integer sifre:"+ sifreSayi);

        /*
        Wrapper classlar ileride kullanabilecegimiz pekcok faydali hazir method icerir
         */


    }
}

package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_ScannerIlkHarf {

    public static void main(String[] args) {
        // kullanicidan ismini alip ,ilk harfini buyuk harf olarak yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isimizi giriniz");
        /*
         Java Scanner class'inda nextchar() method'u yoktur
         bunun yerinr String olarak ilk kelimeyi alip
         onunda ilk harfini alabiliriz
         */
        char ilkharf = scan.next().toLowerCase().charAt(0);
        System.out.println("ismin ilk harfi :"+ilkharf);
    }
}

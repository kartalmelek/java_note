package day09_ternary;

import java.util.Scanner;

public class  C05_NestedTernary {
    public static void main(String[] args) {
        // kullanicidan bir harf isteyin
        // kucuk harf ise consola " kucuk harf " yazdirin
        // buyuk harfse consola " buyuk harf "
        // yoksa " girdiginiz karakter harf degil " yazdirin.


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf =scan.next().charAt(0);

        /*
          String sonuc=(harf >='a' && harf <='z') ?("kucuk harf")
                ("Buyuk harf veya gecersiz karater");

         */
        String sonuc = (harf>='a' && harf <='z')? ("kucuk harf"):
                      ((harf>='A' && harf<='z')? "Buyuk harf": "Gecersiz karater");

        System.out.println(sonuc);

    }
}

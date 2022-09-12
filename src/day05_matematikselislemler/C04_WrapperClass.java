package day05_matematikselislemler;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String str = "Java cok guzel";
        str.toUpperCase();

        int sayi =10;
        // primitive data turlerinin yaninda method'lar olmaz
        // java bazi mehod'lari kullanabilmemiz icin
        // her bir primitve data turu icin bir wrapper class olusturmustur.

        Integer sayi2 =10;

        sayi2.byteValue();

    }
}

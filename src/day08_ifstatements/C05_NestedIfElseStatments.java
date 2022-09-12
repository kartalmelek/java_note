package day08_ifstatements;

import java.util.Scanner;

public class C05_NestedIfElseStatments {
    public static void main(String[] args) {
    /*
    Nested If kullanaraK asagidaki soruyu cozen kodu yaziniz.
    kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise"A" olup olmadigini kontrol edin.
    Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre "yazdirin.

    Eger ilk harf kucuk harf ise "z" olup olmadigini konrtol edin.
    Ikl harf z ise "Gecerli Sifre " degilse "Gecersiz Sifre "yazdirin.

     */

        // ilk harf buyuk mu kucuk mu ?
        // ilk harf A  veya z mi ?
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre  giriniz");
        String sifre = scan.nextLine();
        char ilkHarf =sifre.charAt(0);

        if (ilkHarf>='A'&& ilkHarf<='Z'){ // ilk harfi buyuk harf olan kelimeler

            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
            } else if (ilkHarf>='a' && ilkHarf<='z') { // ilk harf kucuk harf
            if (ilkHarf=='z'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }

            }else {
            System.out.println("lutfen ilk karater icin sadece harf kullanin");
        }
    }

}
package day08_ifstatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        kullanicidan 4 basamakli bir sayi girmesini isteyin.
        girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        son rakami 0 ise ekrana "5' e bolunen cift sayi " yazdirin.
        son rakami 0 degil ise "5'e bolunen tek sayi "yazdirin.
        girrdigi sayi 5'e bolunmuyorsa ekrana "Tekrar deneyin "yazdirin.

         */

          Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt();

        // sayinin 5'e bolunup bolunmemesi
        // sayinin son basamaginin sifir olup olmamasi

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lutfen 4 basamakli bir tam sayi giriniz");
        } else if (sayi % 5== 0) { // sayi 4 basamakli ve 5'e bolunebiliyor
             if(sayi%10== 0){
                 System.out.println("5'e bolunen cift sayi" );

             }else {

                 System.out.println("5'e bolunen tek sayi");
             }


        } else { //sayi 4 basamakli ama 5'e  bolunemiyor

            System.out.println("tekrar deneyin");
        }
    }
}
package day13_MethodCreation;

import java.util.Scanner;

public class C02_StringManupulation {
    public static void main(String[] args) {
        /*
        kullanicidan bir sifre girmesini isteyin,
        Asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi",
        sartlari saglamazsa " islem basarisiz,lutfen yeni bir sifre giriniz" yazdirin
        - Ilk harf buyuk harf olmali
        -son harf kucuk harf olmali
        -sifre bosluk icermemeli
        -sifre uzunlugu en az 8 karekter  olmali

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sifre giriniz");
        String sifre=scan.nextLine();
        int kontrol=0;

        // Ilk harf kontrolu

        if(sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z'){
           kontrol++;
        }else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

        // Son harf kontrolu

        if (sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("son harf kucuk harf olmali");
        }

        // Bosluk kontrolu

        if (sifre.contains(" ")){
            System.out.println("lutfen bosluk icermemeli");
        }else {
            kontrol++;
        }

        // Sifre uzunluk kontrolu

        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("sifre en az 8 karater olmali");
        }

        if (kontrol==4){
            System.out.println("sifre basari ile tanimlandi");
        }else {
            System.out.println("islem basarisiz,Lutfen yeni bir sifre girin");
        }

    }
}

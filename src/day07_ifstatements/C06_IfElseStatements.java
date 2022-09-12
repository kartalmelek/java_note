package day07_ifstatements;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
      /*
      kullaniciya yasini sorun,
      eger yas 65'den kucuk ise "emekli olamazsin,calismalisin",
      65'e esit veya buyukse "emekli olabilirsin" yazdirin

       */

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();


        if (yas<65){
            System.out.println("emekli olamazsin,"+(65-yas)+" yil daha calismalisin");
        } else {
            System.out.println("emekli olabilirsin");
        }

    }
}

package day07_ifstatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
      /*
       soru 3- Kullanicidan gun ismini alin ve hafta ici veya hafta sonu oldugunu yazdirin
       ornek : gun = Pazar output= "Hafta sonu"
               gun = Sali output = "Hafta ici"
          *** String icin equals method'unu kullanin
       */



        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGun= scan.next().toLowerCase();
        // Pazar, pazar, PAZAR, paZar, PAzar???  bilemeyiz,
        // pazar, pazar, pazar, pazar, pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }

           if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
           || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
           || girilenGun.equals("cuma") ){
               System.out.println("Girilen gun HAFTAICI");
           }

           if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali")
              || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
              || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
              || girilenGun.equals("pazar"))){
               System.out.println("lutfen gecerli bir gun ismi giriniz");



           }

    }

}

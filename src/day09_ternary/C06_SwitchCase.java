package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
         /*
          kullanicidan gun numarasini alip
          1 ise pazartesi,
          ....
          7 ise pazar yazdirin
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        /*
        swich yanina yazilan ( ) neye gore case atayacagimizi gosterir
        java girilen degere gore case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye kadar veya switch parantezine kadar devam eder.

        if -else if -.......-else yapisinda oldugu gibi
        hicbir sarta uymayanlari default keyword kulanilir
        */

        switch (gunNo){

            case 1:
                System.out.println("pazartesi");
                break;
            case 2 :
                System.out.println("sali");
                break;
            case 3 :
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println(" pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi girin ");
        }
    }
}

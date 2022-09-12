package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
       // kullanicidan  ismini isteyin
       // girilen ismi
       // isminiz : Ismail  seklinde yazdirin

       // insanlarin dunyasindan  kod'larimizin  bulundugu  class'a  deger almak icin
       // Scanner class'ini kullaniriz

       // 1-Scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);

       // 2-kullaniciya ne istedigimizi soyleyelim
        System.out.println("lutfen isminizi giriniz");

       // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
       // olusturacagimiz uyugun bir variable'a atayalim

        String kullanici =scan.next();

        System.out.println("Isminiz :"+ kullanici);




    }
}

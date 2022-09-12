package day08_ifstatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        // kullanicidan 100 uzrinden notu isteyin.
       //  Notu harf sistemine cevirip yazdirin.
       // 50'den kucukse "D",
       // 50-60 arasi "C",
       // 60-80 arasi "B",
       // 80' nin uzeri "A",
       // gecersiz not girildiginde uyari verelim

        Scanner scan= new Scanner(System.in) ;
        System.out.println("lutfen 0'dan 100'e kadarbir not degeri giriniz");
        double note= scan.nextDouble();

        if (note<0 || note>100){
            System.out.println("lutfen gecerli bir not giriniz");
        } else if(note<50){// bu satira geldiysek notumuz 0 ile 100 arasindadir
            System.out.println("Notunuz: D");
        } else  if (note<60){   // bu satira geldiysek notumuz 50 ile 100 arasindadir
            System.out.println("Notunuz C");
        } else if (note<80){   // bu satira geldiysek notumuz 60 ile 100 arasindadir
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");
        }
    }
}

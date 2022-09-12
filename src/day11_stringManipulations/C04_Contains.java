package day11_stringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        kullanicidan bir cumle isteyin.
        cumle "buyuk"kelimesi iceriyorsa tum cumleyi buyuk harf olarak
        "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icerimiyorsa "cumle kucuk yada buyuk kelimesi icermiyor" yazdirin
         */

        String cumle ="Java buyuk,dunya kucuk";
        cumle=cumle.toLowerCase();
        // requrements'de buyukharf kucuk harf hassasiyeti hakkinda bir sey soylenmemis
        // ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        // ek requurements : iksinide iceriyorsa " karar ver buyuk mu yazdirayim kucuk mi?"
        // case sensitive olmasin

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu yazdirayim kucuk mu?");
        }else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}

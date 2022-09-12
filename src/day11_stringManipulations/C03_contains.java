package day11_stringManipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*
        kullanicidan email adresini girmesini isteyin,
        mail@gmail.com icermiyorsa " lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa " Email adresiniz kaydedildi",
        @gmail.com ile bit,iyorsa "lutfen yazimi kontrol edin "yazdirin

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen email yaziniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if (email.lastIndexOf("@gmail.com")==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}

package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
          /*
        kullanicidan email adresini girmesini isteyin,
        mail@gmail.com icermiyorsa " lutfen gmail adresi giriniz",
        @gmail.com ile bitiyorsa " Email adresiniz kaydedildi",
        @gmail.com ile bit,iyorsa "lutfen yazimi kontrol edin "yazdirin
         */
        String input="fatih@gmail.com";
        
        if (!input.contains("@gmail.com")){

            System.out.println("lutfen gmail adresi giriniz");

        } else if (input.endsWith("@gmail.com")) {

            System.out.println("Email adresiniz kaydedildi");

        }else {

            System.out.println("lutfen yazimi kontrol edin");
        }
    }
}

package day13_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        // input olarak verilen 2 integer'i toplayip sonucunu yazdiran
        // bir method olusturun

        int input1 =10;
        int input2 =20;

        // method'u 4 adimda olusturun
        // 1. adim method call
        // 2. adim argument eklenmesi gerekiyorsa ekleyelim
        //    eger method'un return type void'den farkli olacaksa
        //    bir variable olusturup, method call'u assign edelim

       topla(input1,input2);
    }


    public static void topla(int input1,int input2) {

        // 3. adim  method deklerasyonunda degistirilmesi gereken

        // bolumleri degistir (access modifier,return Typevb..)

        // 4. adim eger return type void disinda bir seyse

        //   return keywor'u ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami :"+(input1+input2));
    }


}

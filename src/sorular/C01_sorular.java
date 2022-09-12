package sorular;

public class C01_sorular {
    public static void main(String[] args) {
       int a= 3;
       int b =5;


       cikar(a,b);
       carp (a,b);
       bol(a,b);
       toplam(a,b);
    }

    private static void toplam(int a, int b) {
        System.out.println(a+b);
    }

    private static void bol(int a, int b) {
        System.out.println(a/b);
    }

    private static void carp(int a, int b) {
        System.out.println(a*b);
    }

    private static void cikar(int a, int b) {
        System.out.println(a-b);
    }
}



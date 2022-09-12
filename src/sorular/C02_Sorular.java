package sorular;

public class C02_Sorular {
    public static void main(String[] args) {

        int a= 3;
        int b =5;
        System.out.println(cikarma(a,b));
        int sonuc = cikarma(a,b);
        System.out.println(sonuc);

        cikarma(a,b);
        carpma (a,b);
        bolme(a,b);
        toplama(a,b);
    }

    private static int toplama(int a, int b) {
        return a+b;
    }

    private static int bolme(int a, int b) {
        return a/b;
    }

    private static int carpma(int a, int b) {
        return a*b;
    }

    private static int cikarma(int a, int b){
        return a-b;

    }
}

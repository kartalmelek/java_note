package day05_matematikselislemler;

public class    C02_Pre_post_Increment {

    public static void main(String[] args) {

        int sayi =10;

        System.out.println("pre-increment:"+  ++sayi); // 11


        System.out.println("post-increment:"+ sayi++); // 11


        System.out.println("post-increment'den sonra :"+ sayi); // 12

    }
}

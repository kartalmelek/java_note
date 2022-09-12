package day07_ifstatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        /*
        kullanicidan bir karekter girmesini isteyin
        ve girilen karekterin harf olup olmadigini yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karekter giriniz");
        char harf =scan.next().charAt(0);

        if ((harf>='a'&& harf<='z') || (harf>='A' && harf<='Z')){
            System.out.println("Girilen karekter bir harf");
        } else {
            System.out.println("Girilen karekter bir harf degil");
        }
    }
}

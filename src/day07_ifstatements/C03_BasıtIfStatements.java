package day07_ifstatements;

public class C03_BasıtIfStatements {
    public static void main(String[] args) {
        /*
        Bir if statements'da } kullanimazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        Eger birden fazla satir ayni if sartina baglanmis ise mutlaka } kullanmaliyiz
         */
        int sayi=23;

        if(sayi>0)
            System.out.println("sayi pozitif"); // degere bagli
            System.out.println("sayi pozif kalacaktir"); // herzaman calisir
            System.out.println("ucuncu satir"); //herzaman calisir

        if(sayi %2 ==0 )
            System.out.println("sayi cift");// degere bagli
            System.out.println("sayi cift kalacaktir");// herzaman calisir


        if (sayi%5 ==0)
            System.out.println("sayi 5'in tam kati"); // degere bagli

    }
}

package day04_dataCasting;

public class C04_ExpliciNarrowing {
    public static void main(String[] args) {

        int sayi1 = 50;

        byte sayi2= (byte)  sayi1 ;

        System.out.println(sayi2);// 50

        /*
          Genis data turundeki degeri,dar data  turundeki variable'a atamak isterseniz
          Java sizin genis data turundeki degerin,dar data turunun
          sinirlarina uyup uymayacagini calistirana kadar bilemez
          ama java Risk almaz
          Riski sifira indirmek icin buruda bir sorun olursa
          sorumlulugu kabul etmenizi bekler
          bunun icin degerin onune parantez icerisinde istedigimiz data turunu
          yazmamiz yeterlidir.

          Bu riski ustlendigimizde, 3 durum olusabilir
          1- Bizim degerimiz,dar kalip degerilerine uygun olursa hic bir kayip olmadan cast olur
          2- Double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabilirsiniz
          3- Genis kalibtan degeri dar kaliba koydugunuzda, sinirlari asan durumlarda
             veri baskalasabilir.



         */

    }
}

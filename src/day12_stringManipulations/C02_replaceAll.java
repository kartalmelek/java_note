package day12_stringManipulations;

public class    C02_replaceAll {
    public static void main(String[] args) {

        String str ="1Bu2gu3n Ja*va- cok g3uz/el ";

        // str'in Bugun java cok guzel haline getirelim
        // replaceAll() deki all'un amaci ayni ozellikteki tum karakterlerikapsamasidir
        // butun sayilari sil
        // butun ozel karakterleri sil


        // tum ozel karekterleri silelim dedigimiz de space'ler de siliniyor
        // spaceleri korumak icin en basta onlarin yerine cumlede bulunmayacak
        // bir String koyalim
        // "qazwsx"

        str=str.replace(" ","qazwsx");
        System.out.println(str);


        str=str.replaceAll("\\W","");
        System.out.println(str);// 1Bu2gu3n Ja*va- cok g3uz/el

        str=str.replaceAll("\\d","");

        // istenmeyen ozel karakter ve sayilardan kurtulduk
        // simdi spaceleri geri getirelim

        str =str.replace("qazwsx"," ");
        System.out.println(str);
    }
}

package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str= "Bu gun ha va cok guz el";
        System.out.println(str.replace(" ",""));

        //hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        // guzel yerine harika yapalim

        System.out.println(str.replace("guz el","harika"));

        // cumleyi replace kullanarak Bugun Java cok guzel yapalim

        System.out.println(str.replace("Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("guz el","guzel"));

    }
}

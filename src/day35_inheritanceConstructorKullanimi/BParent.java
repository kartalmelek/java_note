package day35_inheritanceConstructorKullanimi;

public class BParent extends AGrandParent {

    protected String isim = "Parent isim belirtilmedi";
    protected String parentKlupAdi = "Parent Klubu";

    void BParent() {
        System.out.println("Parent constructor calisti");
    }
}
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class vucutkitleendeksi{
    public static void main(String[] args) {
        // değişkenleri tanımlayalım
        double kilo,boy,endeks;

        // import sınıfını tanımlayalım
        Scanner input = new Scanner(System.in);

        // kullanıcıdan input alalım
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        kilo = input.nextDouble();
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz x,y");
        boy = input.nextDouble();

        endeks = kilo / boy*boy;

        System.out.println("Vücut Kitle İndeksiniz : " + endeks);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Manavdaki ürünleri, ürünlere ait birim fiyatlarını ve satış sonunda eder miktarını tanımlayalım.

        double armut , elma , domates , muz , patlican ;
        double armutBrm , elmaBrm , domatesBrm, patlicanBrm ;
        double armutSts , elmaSts , domatesSts , muzSts , patlicanSts , toplamSts ;

        // Buradaki birim fiyatları her fiyat güncellemesinde gözden geçirilmelidir.

        armutBrm = 2.14 ;
        elmaBrm = 3.67  ;
        domatesBrm = 1.11 ;
        patlicanBrm = 5.0 ;

        System.out.print ("Kaç kg armut aldınız = ");
        armut = inp.nextDouble();
        armutSts = (armut * armutBrm) ;

        System.out.print ("Kaç kg elma aldınız = ");
        elma = inp.nextDouble();
        elmaSts = (elma * elmaBrm) ;

        System.out.print ("Kaç kg domates aldınız = ");
        domates= inp.nextDouble();
        domatesSts = (domates * domatesBrm);

        System.out.print ("Kaç kg muz aldınız = ");
        muz = inp.nextDouble();
        muzSts = (muz * armutBrm) ;

        System.out.print ("Kaç kg palıcan aldınız = ");
        patlican = inp.nextDouble();
        patlicanSts = (patlican * patlicanBrm) ;

        toplamSts = (armutSts + elmaSts + domatesSts + muzSts + patlicanSts );

        System.out.println(toplamSts + " Tl ödeme tutarı mevcuttur.");
    }
}
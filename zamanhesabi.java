//Girilen gün sayısı doğrultusunda gün sayısının kaç saat dakika saniye olduğunu hesaplar.
import java.util.Scanner;
public class zamanhesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birgünsaat = 24, birsaatdk = 60, birdksn = 60;
        int günsayisi;

        System.out.print("Gün Sayısı Giriniz: ");
        günsayisi = input.nextInt();

        int saat = günsayisi * birgünsaat;
        int dakika = saat * birsaatdk;
        int saniye = dakika * birdksn;

        System.out.println(saat + "saat");
        System.out.println(dakika + "dakika");
        System.out.println(saniye + "saniye");
    }
}

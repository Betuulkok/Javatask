//Ürünün tutarı ve kdv oranı kullanıcı tarafından girilir. Kdv oranı girilirken nokta yerine virgül kullanınız.
import java.util.Scanner;
public class kdvhesabi {
    public static void main(String[] args) {
        double tutar, oran ;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücreti Giriniz: ");
        tutar = input.nextDouble();
        System.out.print("KDV Oranını Giriniz: ");
        oran = input.nextDouble();

        double kdvtutari = tutar * oran;
        double toplamtutar = tutar + kdvtutari;
        System.out.print("KDV Oranı:" + kdvtutari);
        System.out.print("KDVli Tutar:" + toplamtutar);
    }
}

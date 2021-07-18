import java.util.Scanner;
public class taksimetrehesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startPrice, minPrice;
        double km, perkm, total; //double değerlerini nokta yerine virgül ile giriniz
        System.out.print("Taksimetre açılış ücretini giriniz: ");
        startPrice = input.nextInt();
        System.out.print("Ödenecek minimum tutarı giriniz: ");
        minPrice = input.nextInt();
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextDouble();
        System.out.print("km başına düşen ücreti giriniz: ");
        perkm = input.nextDouble();
        total = startPrice +(km*perkm);
        total= total <= minPrice ? minPrice : total;
        System.out.print("Toplam tutar: "+total);

    }

}

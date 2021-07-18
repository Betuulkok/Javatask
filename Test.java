import java.util.Scanner;
public class Test {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);

        double sonuc = toplam / 6.0;

        System.out.print("Ortalamanız: " + sonuc);

        int gecmenotu = 60;

        boolean sinifgecmekosulu = sonuc >= gecmenotu;

        String sinifgecmedurumu = sinifgecmekosulu ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";

        System.out.print(sinifgecmedurumu);
    }
}

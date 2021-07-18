import java.util.Scanner;
public class ucgenalanhesaplama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int a, b, c, u, cevre;
        double alan;

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = girdi.nextInt();
        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = girdi.nextInt();
        u = (a+b+c)/2;
        cevre = 2*u;
        System.out.println("Üçgenin Çevresi: "+ cevre);
        alan = Math.sqrt (u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+ alan);
    }
}

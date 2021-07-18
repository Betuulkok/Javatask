import java.util.Scanner;
public class hipotenushesaplama {
    public static void main(String[] args ) {
        Scanner girdi = new Scanner(System.in);
         int a, b;
         double c;
         System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = girdi.nextInt();
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = girdi.nextInt();
        //Math.sqrt karekök alma işlemi yapan sınıf
        c = Math.sqrt ((a*a)+(b*b));
        System.out.print("Hipotenüs: "+c);
    }
}

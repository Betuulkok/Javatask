import java.util.Scanner;

public class daireninalaninihesaplama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r,a, cevre, alan, dairedilimininalani,pi=3.14;
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r=input.nextDouble();
        System.out.print("Daire Diliminin Açısını Giriniz: ");
        a=input.nextDouble();
        cevre=2*pi*r;
        System.out.println("Dairenin Çevresi: "+ cevre);
        alan=pi*r*r;
        System.out.println("Dairenin Alanı: "+alan);
        dairedilimininalani=(pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı: "+dairedilimininalani);
    }



}

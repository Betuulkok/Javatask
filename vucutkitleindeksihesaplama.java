import java.util.Scanner;
public class vucutkitleindeksihesaplama {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double height, weight, vucutkitleindeksi;
        System.out.print("Boy uzunluğunuzu m cinsinden giriniz: ");
        height=input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        weight=input.nextDouble();
        vucutkitleindeksi=weight/(height*height);
        System.out.println("Vücut kitle indeksiniz: "+vucutkitleindeksi);
}
}

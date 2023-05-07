import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        double yariCap;
        double alan;
        double sonuc;
        alan=Math.PI;
        Scanner input=new Scanner(System.in);
        System.out.print("Yaçap değerini gir: ");
        yariCap=input.nextDouble();
        sonuc=alan*yariCap*yariCap;
        System.out.printf("Yarı çapı %.2f olan dairenin alanı: %.2f 'dir",yariCap,sonuc);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("4.\tKullanıcıya ismini ve cinsiyetini soran ve bu veriler ile merhaba diyen programı\n ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String name = scanner.next();
        System.out.println("Lütfen cinsiyetinizi yazın(Bey veya Hanım):");
        String cinsiyet = scanner.next();
        System.out.println("Merhaba " + name + " " + cinsiyet);
    }
}
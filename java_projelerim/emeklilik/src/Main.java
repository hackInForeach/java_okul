import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kullanıcıdan cinsiyet ve yasini alın, Kadi, 60 ve üzeri, Erkek 65 ve üzeri emekli olabilir." +
                "Cinsiyet ve yaş dikkate alınarak \"Emekli olabilirsin\" veya  \"Emekli olmak için ... yil\" daha çalışman gerek.\" yazsın." +
                "Bu programı tasarlayınız.");

        Scanner openThe = new Scanner(System.in);

        System.out.println("Lütfen Cinsiyetinizi girin(Kadın için 1, Erkek için 2): ");
        int cinsiyet = openThe.nextInt();
        System.out.println("Lütfen yaşınızı girin: ");
        int yas = openThe.nextInt();

        int sartKadin = 60 - yas;
        int sartErkek = 65 - yas;
        boolean emeklilikKadin = yas >= 60;
        boolean emeklilikErkek = yas >= 65;

        if (cinsiyet == 1) {
            if (emeklilikKadin) {
                System.out.println("Tebrikler Bayan! Artık Emekli Olabilirisiniz.");
            } else {
                System.out.printf("Emeklilik için %d Yıl Daha Çalışman Gerek.", sartKadin);
            }
        } else if (cinsiyet == 2) {
            if (emeklilikErkek) {
                System.out.println("Tebrikler Bayım! Artık Emekli Olabilirisiniz.");
            } else {
                System.out.printf("Emeklilik için %d Yıl Daha Çalışman Gerek.", sartErkek);
            }
        }
    }
}
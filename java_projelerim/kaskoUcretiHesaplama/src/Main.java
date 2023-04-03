import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("""
                                
                Soru: Sürücünün yaşına ve yaptığı kaza sayısına göre  araba
                kasko ücretini hesaplayan bir java programı tasarlayınız.
                Temel sigorta fiyatı 500$'dır. 
                Eğer sürücü 25 yaşından küçükse 100$ fazladan ödeme yapmalıdır.
                Aşağıdaki tabloda göserildiği biçimde kaza sayısına göre
                fazladan ücret ödenmelidir.
                                
                Kaza sayısı  Ekstra ücret
                     1            50
                     2            125
                     3            225
                     4            375
                     5            575
                6 veya fazla      sigorta yapılamaz
                                
                Yazılacak programda sürücün yaşı ve kaza sayısı girdi olarak alınmlıdır.
                                
                """);

        int baseKasko = 500;
        int extraMoneyAge = 100;
        int money = 0;
        int accidentLimit = 6;
        int extraMoney = 75;
        int newExtraMoney = 50;
        String message = "Sigorta yapılamaz!";

        System.out.print("Merhaba DoğuKASKO ya hoşgeldiniz\nKASKO Hesaplama işlemi için lütfen yaşınızı giriniz: ");
        int age = input.nextInt();
        System.out.print("Yapılan Kaza Sayısını Giriniz: ");
        int accidentNumber = input.nextInt();

        if (age < 25 && age > 0) {
            if (accidentNumber > 0 && accidentNumber < accidentLimit) {
                for (int i = 1; i < accidentNumber; i++) {
                    extraMoney = extraMoney * i;
                    newExtraMoney = newExtraMoney + extraMoney;
                    extraMoney = 50;
                }
                money = newExtraMoney + baseKasko + extraMoneyAge;
                System.out.printf("Sayın müşterimiz 25 yaşından küçük olduğunuz için extra: %d ödemeniz çıkmıştır", extraMoneyAge);
                System.out.printf("Toplam KASKO ücretiniz: %d", money);
            } else {
                System.out.printf("Yapılan %d adet kazadan dolayı %s", accidentNumber, message);
            }
        } else if (age >= 25) {
            if (accidentNumber > 0 && accidentNumber < accidentLimit) {
                for (int i = 1; i < accidentNumber; i++) {
                    extraMoney = extraMoney * i;
                    newExtraMoney = newExtraMoney + extraMoney;
                    extraMoney = 50;
                }
                money = newExtraMoney + baseKasko;
                System.out.printf("Toplam KASKO ücretiniz: %d", money);
            } else {
                System.out.printf("Yapılan %d adet kazadan dolayı %s", accidentNumber, message);
            }
        }else {
            System.out.printf("Girilen değerlere göre: %s",message);
        }
    }
}
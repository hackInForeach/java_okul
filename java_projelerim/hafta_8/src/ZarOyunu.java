import java.util.Scanner;

public class ZarOyunu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1 = 0, number2 = 0, number3 = 0;
        int netPuan = 0;
        int maxPuan = 20;
        int ortaPuan = 10;
        int dusukPuan = 5;
        int kural1 = 6;
        System.out.println("""
                Merhaba oyunun kuralları şöyle;
                Eğer 3 zar da 6 ise 20 puan
                Eğer 3 zarda aynı ama 6 değilse 10 puan;
                Eğer 3 zardan herhangi 2si aynıysa 5 puan.
                İyi şanslar :)
                """);
        System.out.print("Kaç oyuncu var: ");
        int kisiSayisi = input.nextInt();
        int[] kisiler = new int[kisiSayisi];
        for (int i = 0; i < kisiSayisi; i++) {

            System.out.println((i + 1) + ". oyuncu");
            System.out.print("Lüften 1 e bas ve ilk zarını at: ");
            if (input.nextInt() == 1) {
                number1 = zarAtimi();
                System.out.print("Lüften 2 e bas ve ikinci zarını at: ");
                if (input.nextInt() == 2) {
                    number2 = zarAtimi();
                    System.out.print("Lüften 3 e bas ve son zarını at: ");
                    if (input.nextInt() == 3) {
                        number3 = zarAtimi();
                    } else {
                        System.out.println("Hata! Lütfen belirtilen adımları izle!");
                        break;
                    }
                } else {
                    System.out.println("Hata! Lütfen belirtilen adımları izle!");
                    break;
                }
            } else {
                System.out.println("Hata! Lütfen belirtilen adımları izle!");
                break;
            }

            if (number1 + number2 + number3 == 3 * kural1) {
                netPuan += maxPuan;
            } else {
                if (number1 == number2 && number2 == number3) {
                    netPuan += ortaPuan;
                }
            }

            if (number1 == number2 || number2 == number3 || number1 == number3) {
                netPuan += dusukPuan;
            }

            System.out.println("**************************************************");
            System.out.printf("\n%d. oyuncu puanları: 1:%d 2:%d 3:%d \n", (i + 1), number1, number2, number3);

            kisiler[i] = netPuan;
            netPuan = 0;
            System.out.println("**************************************************");
        }
        System.out.println("***********************");
        for (int i = 0; i < kisiler.length; i++) {
            System.out.println((i + 1) + ". oyuncu: " + kisiler[i]);
        }
        System.out.println("***********************");
    }

    public static int zarAtimi() {
        double rand = Math.random();
        int number = (int) (6 * rand + 1);
        return number;
    }

}
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("7.\tKullanıcı tarafından girilen sayının pozitif mi negatif mi nötürmü olduğunu bulup ekrana yazdıran programı \n");
        Scanner scan = new Scanner(System.in);
        String secim;
        String secim2;
        do {
            System.out.println("Bir sayı girin: ");
            int number1 = scan.nextInt();

            if (number1 > 0) {
                System.out.println("Girilen sayı pzitif");
            } else if (number1 < 0) {
                System.out.println("Girilen sayı negatif");
            } else {
                System.out.println("girilen sayı nötür");
            }
            System.out.println("Lütfen devam için 'devam' bitirmer için ise 'bitir' yazınız: ");
            secim2 = "devam";
            secim = scan.next();

        } while (Objects.equals(secim,secim2));
        System.out.println("İyi günler");


    }
}
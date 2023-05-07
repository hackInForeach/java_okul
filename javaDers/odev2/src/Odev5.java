import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kare için=2 | küp için=3 yazın: ");
        int sec = input.nextInt();
        while (sec != 2 && sec != 3) {
            System.out.print("kare için=2 | küp için=3 yazın: ");
            sec = input.nextInt();
        }

        System.out.print("1.sayıyı gir: ");
        int number1 = input.nextInt();
        System.out.print("2.sayıyı gir: ");
        int number2 = input.nextInt();
        if (sec == 2) {
            System.out.printf("Kare toplamları sonucu: %d", kare(number1, number2));
        } else {
            System.out.printf("Küp toplamları sonucu: %d", kup(number1, number2));
        }


    }

    public static int kare(int number, int number1) {
        int sonuc= number * number + number1 * number1;
        return sonuc;
    }

    public static int kup(int number, int number1) {
        int sonuc= number * number * number + number1 * number1 * number1;
        return sonuc;
    }
}

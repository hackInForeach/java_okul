import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Pozitif bir tamsayı gir: ");
        int number=input.nextInt();
        System.out.print("2. Pozitif bir tamsayı gir: ");
        int number1=input.nextInt();
        int sum=faktoriel(number1)+faktoriel(number);
        System.out.printf("%d! ile %d! toplamı: %d ",number,number1,sum);

    }

    public static int faktoriel(int number1) {
        int fakt = 1;
        for (int i = 1; i <= number1; i++) {
            fakt *= i;
        }
        return fakt;

    }
}

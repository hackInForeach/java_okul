import java.util.Scanner;

public class DiziIslem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Oluşturulacak dizi kaç elemanlı: ");
        int arrayNum = input.nextInt();
        int say = 0;
        int[] numbers = new int[arrayNum];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf((i + 1) + ". sayı: ");
            numbers[i] = input.nextInt();
            if (i == (arrayNum - 1)) {
                for (int k = 0; k < numbers.length; k += 1) {
                    int number = numbers[k];
                    boolean write = true;
                    for (int j = 0; j < k; j += 1) {
                        if (number == numbers[j]) {
                            write = false;
                            break;
                        }
                    }
                    if (write) {
                        for (int j = k; j < numbers.length; j += 1) {
                            if (number == numbers[j]) {
                                say += 1;
                            }
                        }
                        System.out.printf("\nDizide %d sayısından %d adet var.", number, say);
                    }
                    say = 0;
                }
            }
        }
    }
}




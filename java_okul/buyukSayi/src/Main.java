import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("8.\tKlavyeden girilen iki sayının büyük olanını ekrana yazdıran programı tasarlayınız.\n");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı gir:");
        int number1 = scanner.nextInt();
        System.out.println("Bir sayı daha gir:");
        int number2 = scanner.nextInt();
        if (number1>=number2){
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }


    }
}
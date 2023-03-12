import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen sayı tek mi çift mi ?");

        System.out.println("Bir sayı gir: ");
        int a = scanner.nextInt();

        if (a%2!=0){
            System.out.println("Girilen "+a+" sayısı tek");
        }else {
            System.out.println("Girilen "+a+" sayısı çift");
        }


    }
}
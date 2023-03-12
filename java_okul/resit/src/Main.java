import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("5.\tKullanıcıya yaşını sorup reşit olup olmadığını söyleyen programı \n");
        Scanner scanner = new Scanner(System.in);

        String message = "Lütfen bir sayı giriniz!";

        try {
            System.out.println("Lütfen yaşınızı giriniz: ");
            int age = scanner.nextInt();
            if (age >= 0) {
                if (age<18){
                    System.out.println("eşit değilsiniz!");
                }else {
                    System.out.println("Reşitsiniz");
                }
            }else {
                System.out.println("Lütfen pozitif bir sayı kullanın!");
            }
        }catch (InputMismatchException exception){
            System.out.println(message);

        }finally {
            System.out.println("İyi günler...");
        }

    }
}
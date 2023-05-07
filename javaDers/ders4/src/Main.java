import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int number=input.nextInt();
        if (number%5==0){
            System.out.println("5 in bir katıdır");
        }else {
            System.out.println("5 in katı değildir");
        }

        // veya
        System.out.println(number%5==0?"5 in katı":"5 katı değil");



    }
}
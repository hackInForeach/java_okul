import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("6.\tKlavye yardımıyla girilen iki sayının büyüklük, küçüklük ve eşitlik durumunu değerlendiren ve bunu ekrana yazdıran programı \n");
        Scanner scan = new  Scanner(System.in);
        System.out.println("Bir sayı gir: ");
        int number1 = scan.nextInt();
        System.out.println("Bir sayı daha girin: ");
        int number2 = scan.nextInt();

        if (number1==number2){
            System.out.println("Eşit");
        } else if (number1>number2) {
            System.out.println("İlk sayı ikincisinde büyük");
        }else {
            System.out.println("İkinc sayı ilkinden büyük");
        }


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("10.\tBir üçgenin iç açıları toplamı 180 derece. Açıları kullanıcı tarafından girilen üçgenini üçgen olup olmadığını bulup ekrana yazdıran programı tasarlayınız.\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("İlk açıyı gir: ");
        int number1 = scanner.nextInt();
        System.out.println("İkinci  açıyı gir: ");
        int number2 = scanner.nextInt();
        System.out.println("Üçüncü açıyı gir: ");
        int number3 = scanner.nextInt();
        int total=number1+number2+number3;
        if(total==180){
            System.out.println("Üçgen");
        }else {
            System.out.println("Üçgen değil");
        }


    }
}
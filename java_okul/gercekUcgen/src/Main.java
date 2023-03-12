import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("11.\tBir üçgen çizilebilmesi için 3 kenar uzunluğundan biri diğer iki kenar uzunluğu farkından büyük toplamından küçük olmalıdır. Klavyeden girilen üç kenar uzunluğu ile üçgen çizilip çizilemediğini söyleyen programı tasarlayınız.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci açı girin");
        int num1 = scanner.nextInt();
        System.out.println("ikinci açı girin");
        int num2 = scanner.nextInt();
        System.out.println("Üçüncü açı girin");
        int num3 = scanner.nextInt();

        if (num1 + num2 >= num3 && num2 - num3 <= num1 && num3 + num1 >= num2 && num1 - num2 <= num3 && num2 + num3 >= num1 && num3 - num1 <= num2) {
            System.out.println("Gerçek üçgen");
        } else {
            System.out.println("Gerçek üçgen değil");
        }


    }
}
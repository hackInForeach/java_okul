import java.util.Scanner;

public class CumleKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir cümle yazın");
        String cumle = scanner.nextLine();

        for (String kelime:cumle.split(" ")){
            System.out.println(kelime);
        }

        //.split(cümle nasıl ayrılacak) metodu bir cümle bütününün kelime keli ekrana basılmasını sağlar Yani bir diziyi verilen ifadeye göre kırar


    }
}

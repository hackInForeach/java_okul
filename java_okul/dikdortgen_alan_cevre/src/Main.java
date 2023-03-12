import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2.\tKenar uzunlukları kullanıcı tarafından girilen dikdörtgenin alanını ve çevresini ");

        System.out.println("Uzun kenarı gir: ");
        int a = scanner.nextInt();
        System.out.println("Kısa kenarı gir: ");
        int b = scanner.nextInt();

        System.out.println(
                "Alanı: "+a*b
                +"\n"+
                "Çevresi: "+2*(a+b)
        );


    }
}
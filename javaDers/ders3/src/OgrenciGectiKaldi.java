import java.util.Scanner;

public class OgrenciGectiKaldi {
    public static void main(String[] argumans) {
        double gecmeNotu = 45;
        double not;
        Scanner input = new Scanner(System.in);
        System.out.print("Notu gir: ");
        not = input.nextDouble();

        boolean kosul;
        kosul = not >= gecmeNotu;
        if (not <= 100 & not >= 0) {
            if (kosul) {
                System.out.println("Geçtiniz.");
            } else {
                System.out.println("Kaldınız.");
            }
        }else {
            System.out.println("0-100 aralığında değer gir.");
        }


    }
}

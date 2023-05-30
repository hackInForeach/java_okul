import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int shops = 4; // satır
        int days = 7; // sütun

        int[][] sales = new int[shops][days];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < shops; i++) {
            System.out.println(i + 1 + ". Mağza: ");
            for (int j = 0; j < days; j++) {
                System.out.print(j + 1 + ". Gün Satış: ");
                int gir = input.nextInt();
            }
            System.out.println();
        }

        int rowSize = sales.length;//satır uzunluğu
        int columSize = sales[0].length;//sütun uzunluğu
        System.out.println("Satır sayısı: " + rowSize);
        System.out.println("Sütun sayısı: " + columSize);
        System.out.println("Kaça kaçlık bir tablo: " + rowSize * columSize);


    }
}
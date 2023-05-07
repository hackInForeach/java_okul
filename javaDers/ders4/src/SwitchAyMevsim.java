import java.util.Scanner;

public class SwitchAyMevsim {
    public static void main(String[] argumans){
        Scanner input=new Scanner(System.in);
        System.out.print("1-7 arası bir gün gir: ");
        int gun=input.nextInt();

        while (gun>7||gun<=0){
            System.out.print("1-7 arası değer gir: ");
            gun=input.nextInt();
        }

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");

        }




    }
}

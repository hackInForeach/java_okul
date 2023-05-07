import java.util.Scanner;

public class SwitchHaftaIciSonu {
    public static void main(String[] argumans){

        Scanner input= new Scanner(System.in);
        System.out.print("1-12 arası bir derğer gir: ");
        int number=input.nextInt();

        while (number<0||number>12){
            System.out.print("1-12 arası değer gir: ");
            number=input.nextInt();
        }
        switch (number){
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlk Bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son Bahar");
                break;

        }


    }
}

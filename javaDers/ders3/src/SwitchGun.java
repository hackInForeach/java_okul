import java.util.Scanner;

public class SwitchGun {
    public static void main(String[] argumans) {
        Scanner gunNo = new Scanner(System.in);
        System.out.print("1-7 arası sayı gir: ");
        int gun = gunNo.nextInt();
        switch (gun) {
            case 1:System.out.println("Pazartesi");break;
            case 2:System.out.println("Salı");break;
            case 3:System.out.println("Çarşamba");break;
            case 4:System.out.println("Perşembe");break;
            case 5:System.out.println("Cuma");break;
            case 6:System.out.println("Cumartesi");break;
            case 7:System.out.println("Pazar");break;
            default:System.out.println("1-7 arsı değer girmeyi dene");
        }

    }
}

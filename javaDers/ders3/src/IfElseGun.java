import java.util.Scanner;

public class IfElseGun {
    public static void main(String[] argumans){
        Scanner gunNo=new Scanner(System.in);
        System.out.print("1-7 sayıgir: ");
        int gun= gunNo.nextInt();
        boolean gunAralik=gun<=7&gun>=1;
        if (gunAralik){
            if (gun==1){
                System.out.println("Pazartesi");
            }
            else if (gun==2){
                System.out.println("Salı");
            }
            else if (gun==3){
                System.out.println("Çarşamba");
            }
            else if (gun==4){
                System.out.println("Perşembe");
            }
            else if (gun==5){
                System.out.println("Cuma");
            }
            else if (gun==6){
                System.out.println("Cumartesi");
            }
            else {
                System.out.println("Pazar");
            }
        }else {
            System.out.println("1-7 arlığını deneğiniz.");
        }

    }
}

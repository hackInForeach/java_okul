import java.util.Scanner;

public class IfElseKutleEndeks {
    public static void main(String[] argumans){
        Scanner input=new Scanner(System.in);
        System.out.print("Kilonuzu girin(örn:75,75): ");
        double kilo=input.nextDouble();
        System.out.print("Boyunuzu girin(örn:1,72): ");
        double boy=input.nextDouble();

        double kutleIndeks=kilo*1000/(boy*boy);

        boolean kosul=kilo>0&&boy>0;
        if (kosul){
            if (kutleIndeks>=30){
                System.out.println("obez");
            } else if (kutleIndeks>=25) {
                System.out.println("Kilolu");
            }else if(kutleIndeks>=20){
                System.out.println("Normal");
            }else {
                System.out.println("Zayif");
            }
        }else {
            System.out.println("kilo veya boy 0 olarak girildi farklı bir değer gir.");
        }


    }
}

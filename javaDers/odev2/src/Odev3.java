import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("1 den büyük sayı gir: ");
        int number=input.nextInt();
        while (number<=1){
            System.out.print("1 den büyük bir sayı gir: ");
            number=input.nextInt();
        }
        boolean sonuc=asal2(number);
        System.out.println(sonuc);


    }public static boolean asal2(int number1){

        boolean asal=true;
        for (int i=number1-1;i>1;i--){
            if (number1%i==0){
                asal=false;
                break;
            }
        }
        return asal;

    }
}

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sıfırdan farkllı pozitif bir tam satı gir: ");
        int number=input.nextInt();
        while (number<=0){
            System.out.print("Sıfırdan farklı pozitif: ");
            number=input.nextInt();
        }
        asal(number);

    }public static void asal(int number){
        boolean asal=true;
        for (int i=number-1;i>1;i--){
            if (number%i==0){
                asal=false;
                break;
            }
        }
        if (asal){
            System.out.println("Asal");
        }else {
            System.out.println("Asal değil");
        }
    }
}

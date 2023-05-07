import java.util.Scanner;

public class EskenarUcgen {
    public static void main(String[] argumans){
        Scanner input=new Scanner(System.in);
        int k1,k2,k3,sum;
        System.out.print("1.kenar: ");
        k1=input.nextInt();
        System.out.print("2.kenar: ");
        k2=input.nextInt();
        System.out.print("3.kenar: ");
        k3=input.nextInt();
        sum=k1+k2+k3;

        if (sum==180){
            if (k1==k2&k2==k3){
                System.out.println("Eşkenar üçgen");
            }
            else {
                System.out.println("Eşkenar üçgen değil");
            }
        }else {
            System.out.println("Bu üçgen değil");
        }


    }
}

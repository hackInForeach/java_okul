import java.util.Scanner;

public class Faktoryl {
    public static void main(String[] argumans){


        long n,faktoriel=1L;
        Scanner input=new Scanner(System.in);
        System.out.print("Negatif olmayan bir yası gir: ");
        n=input.nextLong();

        while (n<0){
            System.out.print("Negatif olmayan bir yası gir: ");
            n=input.nextInt();
        }
        if (n>0){
            for (long i=n;i>=1L;i--){
                faktoriel*=i;
            }
            System.out.printf("%d! => %d dir",n,faktoriel);
        }else {
            System.out.printf("%d! => 1 dir",n);
        }



    }
}

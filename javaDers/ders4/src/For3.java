import java.util.Scanner;

public class For3 {
    public static void main(String[] argumans){

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int number=input.nextInt();
        int carp=1;
        for (int i=1;i<=number;i+=2){
            carp*=i;
        }System.out.println(carp);

    }
}

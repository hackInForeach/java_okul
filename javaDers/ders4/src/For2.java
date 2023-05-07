import java.util.Scanner;

public class For2 {
    public static void main(String[] argumans){

        Scanner input=new Scanner(System.in);
        System.out.print("100 den küçük bir sayı gir: ");
        int number=input.nextInt();
        while (number>100){
            System.out.print("100 kçük bir sayı gir: ");
            number=input.nextInt();
        }
        for (int i=1;i<=number;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }

    }
}

import java.util.Scanner;

public class NestedForLoop1 {
    public static void main(String[] argumans){

        Scanner input =new Scanner(System.in);
        System.out.print("10 küçük pozitif bir tamsayı gir: ");
        int number=input.nextInt();

        while (number>10||number<0){
            System.out.print("10 küçü ve pozitif sayı gir: ");
            number=input.nextInt();
        }
        for (int i=1;i<=number;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }




    }
}

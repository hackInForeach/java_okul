import java.util.Scanner;

public class MethodFakt {
    public static void main(String[] argumans){

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı gir: ");
        int number=input.nextInt();
        int sonuc=faktoriel(number);
        System.out.printf("%d! ==> %d",number,sonuc);

    }
    public static int faktoriel(int number){
        int fakt=1;
        if (number>0){

            for (int i=1;i<=number;i++){
                fakt*=i;
            }
        } else if (number==0) {
            fakt=1;
        }
        return fakt;

    }
}

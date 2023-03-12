import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("9.\tGirilen üç sayıdan en büyük olanını bulup sonucu ekrana yazdıran programı tasarlayınız\n");
        Islem islem=new Islem();
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        islem.iislem(number1,number2,number3);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("12.\tKlavye yardımıyla girilen 100 sayıdan en büyük olanını bulup ekrana yazdıran programı tasarlayınız.\n" );
        Scanner scanner =   new Scanner(System.in);
        int num1 = scanner.nextInt();
        int enb = num1;
        for (int i=1;i<3;i++){
            num1 =scanner.nextInt();
            if (enb>num1){
                enb=num1;
            }else {
                num1=enb;
            }

        }
        System.out.println(enb);


    }
}
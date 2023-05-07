import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Bir aralık belirleyin: ");
        System.out.print("Başlangıç: ");
        double number=input.nextDouble();
        System.out.print("Bitişi: ");
        double number2=input.nextDouble();
        double sonuc=ort(number,number2);
        System.out.printf("%.0f ile %.0f arası sayıların ortlaması: %.1f",number,number2,sonuc);

    }public static double ort(double number,double number1){
        double sum=0;
        for (double i=number;i<=number1;i++){
            sum+=i;
        }
        sum=sum/(number1-number+1);
        return sum;
    }
}

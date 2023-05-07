import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı toplanaca(2,3,4): ");
        int sec = input.nextInt();
        while (sec >4 || sec<2) {
            if (sec>4){
                System.out.print("Cok sayi girdiniz, ben toplayamam tekrar dene: ");
                sec = input.nextInt();
            }else {
                System.out.print("Bu sen yapta görelim, ben toplayamam tekrar dene: ");
                sec = input.nextInt();
            }
        }
        int number, number1,number2 ,number3;
        if (sec == 2) {
            System.out.print("1.sayıyıgir: ");
            number=input.nextInt();
            System.out.print("2.sayıyıgir: ");
            number1=input.nextInt();
            ikiToplam(number,number1);
        } else if (sec==3) {
            System.out.print("1.sayıyıgir: ");
            number=input.nextInt();
            System.out.print("2.sayıyıgir: ");
            number1=input.nextInt();
            System.out.print("3.sayıyıgir: ");
            number2=input.nextInt();
            ucluToplam(number,number1,number2);
        }else {
            System.out.print("1.sayıyıgir: ");
            number=input.nextInt();
            System.out.print("2.sayıyıgir: ");
            number1=input.nextInt();
            System.out.print("3.sayıyıgir: ");
            number2=input.nextInt();
            System.out.print("4.sayıyıgir: ");
            number3=input.nextInt();
            dortluToplam(number,number1,number2,number3);
        }


    }

    public static void ikiToplam(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void ucluToplam(int number1, int number2, int number3) {
        System.out.println(number1 + number2 + number3);
    }

    public static void dortluToplam(int number1, int number2, int number3, int number4) {
        System.out.println(number1 + number2 + number3 + number4);
    }
}

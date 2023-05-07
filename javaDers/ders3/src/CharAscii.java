import java.util.Scanner;

public class CharAscii {
    public static void main(String[] argumans){
        int a='a'+'b';
        System.out.println(a);

        Scanner input=new Scanner(System.in);
        System.out.print("bir karakter gir: ");
        char girilenKarakter=input.next().charAt(0);

        System.out.println("Girilen karakter: "+girilenKarakter);

        System.out.println("bir sonraki karakter: "+(char)(girilenKarakter+1));
        System.out.println("iki sonraki karakter: "+(char)(girilenKarakter+2));
        System.out.println("üç sonraki karakter: "+(char)(girilenKarakter+3));

        for (int i=0;i<=24;i++){
            System.out.println(i+" sonraki karakter: "+(char)(girilenKarakter+i));
        }

    }
}

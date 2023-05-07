import java.util.Scanner;

public class DataCastingBolme {
    public static void main(String[] argumans){
        Scanner input=new Scanner(System.in);
        System.out.print("Bölünecek sayıyı gir: ");
        int a= input.nextInt();

        System.out.print("Bölecek sayıyı gir: ");
        int b= input.nextInt();

        System.out.println("a/b nin değer: "+a/b);
        //değerler int olduğundan ondalık değer 0 olarak gözükecek

        double sonuc=a/b;

        System.out.println("Bolumu double atama yaparsak: "+sonuc);

        //ama çevirme yaparsak:
        sonuc=(double) a/b;

        System.out.println("Bolumu double atama yaparsak ve doubleye çevirirsek: "+sonuc);

    }
}

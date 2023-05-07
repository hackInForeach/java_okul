import java.util.Scanner;

public class OgrenciHarfNotu {

    public static void main(String[] argumans){

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen notu gir(0-100): ");
        double not=input.nextDouble();

        if (not<=100||not>0){
            if (not>=85){
                System.out.println("AA");
            }else if (not>=65){
                System.out.println("BB");
            }else if (not>=50){
                System.out.println("CC");
            }else if(not>=45){
                System.out.println("DD");
            }else {
                System.out.println("FF");
            }
        }else{
            System.out.println("Girilen not geçersiz: "+not);
        }


    }
}

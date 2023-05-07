import java.util.Scanner;

public class ShiftElements {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dizi Kaç Elemanlı Olsun: ");
        int number=input.nextInt();

        int[] ilk= diziOlustur(number);
        System.out.println("İlk hali: ");
        goster(ilk);
        int[] son = ilk;
        System.out.println("Son hali: ");
        goster(kaydir(son));

    }
    public static int[] diziOlustur(int n) {
        int[] dizi=new int[n];

        for (int i=0;i<dizi.length;i++){
            dizi[i]= (int)(10*Math.random()+1);
        }
        return dizi;
    }public static int[] kaydir(int[] n){

        int ilk=n[0];
        for (int i=1;i<n.length;i++){
            n[i-1]=n[i];
        }
        n[n.length-1]=ilk;
        return n;
    }
    public static void goster(int[] n){

        int x=n.length;

        for (int i=0;i<x;i++){
            System.out.println(n[i]);
        }
        System.out.println("***********");

    }
}
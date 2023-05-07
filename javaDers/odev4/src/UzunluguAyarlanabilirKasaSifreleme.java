import java.util.Scanner;

public class UzunluguAyarlanabilirKasaSifreleme {
    public static void main(String[] args) {
        int uzunluk = 10;
        int[] kriptolu = karistir(sifre(uzunluk));
        Scanner input = new Scanner(System.in);
        boolean yanlisMi= true;
        int say;

        for (int i=0;i<kriptolu.length;i++){
            System.out.print(kriptolu[i]+" ");
        }
        while (yanlisMi){
            System.out.println("Bir sayi dene: ");
            say=0;
            for (int i=0;i<kriptolu.length;i++){
                if (input.nextInt()==kriptolu[i]){
                    System.out.println(i+1+". Şifre doğru");
                    say++;
                }else {
                    System.out.println(i+1+". Şifre yanliş");
                }
            }if (say==uzunluk){
                System.out.println("Şifre doğru");
                for (int i=0;i<kriptolu.length;i++){
                    System.out.print(kriptolu[i]+", ");
                }
                yanlisMi=false;
            }else {
                System.out.println("Şifre yanlış");
            }
        }
    }
    public static int[] sifre(int n) {

        int[] dizi = new int[n];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (5 * Math.random() + 1);
        }
        return dizi;
    }
    public static int[] karistir(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int rasGeleAta = (int) (Math.random() * (i + 1));
            int ata = n[rasGeleAta];
            n[rasGeleAta] = n[i];
            n[i] = ata;
        }
        return n;
    }
}
import java.util.Scanner;

public class DiziIslem2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Oluşturulacak dizi kaç elemanlı: ");
        int tekEleman=0,ciftEleman=0,pozitifEleman=0,negatifEleman=0;

        int[] numbers=new int[input.nextInt()];
        for (int i=0;i<numbers.length;i++){
            System.out.printf((i+1)+". sayı: ");
            numbers[i]=input.nextInt();
            if (numbers[i]%2==0){
                ciftEleman+=1;
            }else {
                tekEleman+=1;
            }
            if (numbers[i]>0){
                pozitifEleman+=1;
            }else {
                negatifEleman+=1;
            }
        }
        System.out.printf("\nOluşturulan dizi: %d elemanlı",numbers.length);
        System.out.printf("\nOluşturulan dizi de %d tek, %d çif eleman var",tekEleman,ciftEleman);
        System.out.printf("\nOluşturulan dizi de %d pozitif, %d negatif eleman var",pozitifEleman,negatifEleman);

    }
}

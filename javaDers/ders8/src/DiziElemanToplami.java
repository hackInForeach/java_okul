public class DiziElemanToplami {
    public static void main(String[] args) {

        double[] ondalikliSayi={1.25,4.5,2.1,5.1};
        double sum=0;

        for (int i=0;i<ondalikliSayi.length;i++){
            sum+=ondalikliSayi[i];
        }
        System.out.printf("dizi toplam sonucu: %.2f",sum);

    }
}
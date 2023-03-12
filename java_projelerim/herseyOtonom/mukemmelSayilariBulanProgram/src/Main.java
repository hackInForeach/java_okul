public class Main {
    public static void main(String[] args) {
    System.out.println("Bu program kendi kendine mükemmel sayıları bulur.");
    // çokdaha büyük sayılar istersen long tanımla ve işlemci hızına göre biraz bekle ben en büyük 8128 i gördüm şuan :D
        int total=0;

        for (int k=1;k>-1;k++) {

            for (int i=1;i<k;i++){
                if (k%i==0){
                    total=total+i;
                }
            }
            if (k==total){
                System.out.println("Girilen sayı mükemmel sayıdır.");
                System.out.println(k);
            }
            total=0;
        }
    }
}
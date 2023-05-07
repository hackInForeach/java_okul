public class Main {
    public static void main(String[] args) {

    for(int i=1;i<=100;i++){
        if (istenilenSayiMi(i)){
            System.out.println(i);
        }
    }

    }public static int toplamHesap(int n){
        int toplam=0;
        while (n>0){
            toplam+=n%10;
            n/=10;
        }
        return toplam;
    }
    public static int carpimHesap(int n){
        int carpim=1;
        while (n>0){
            carpim*=n%10;
            n/=10;
        }
        return carpim;
    }public static boolean istenilenSayiMi(int n){
        return toplamHesap(n)== carpimHesap(n);
    }
}
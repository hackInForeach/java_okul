public class TernaryOutput {
    public static void main(String[] argumans){
        int a=10;
        System.out.println(a>0?"Sayı pozitif":"Sayı negatif");
        System.out.println(a>20?a*a:a++);
        System.out.println(a<100||a<0?3*a+1:2+a/5);

        int x=10;
        int y=15;
        int z=a>0?y++:--x;
        System.out.println(x+", "+y+", "+z);


    }
}

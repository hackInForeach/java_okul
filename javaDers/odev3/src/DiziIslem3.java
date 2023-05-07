import java.util.Scanner;

public class DiziIslem3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Oluşturulacak dizi kaç elemanlı: ");
        int son = 0;
        int[] numbers=new int[input.nextInt()];
        for (int i=0;i<numbers.length;i++){
            System.out.print(i+1+". eleman: ");
            numbers[i]=input.nextInt();
            son=numbers[i];
        }if(numbers[0]>son){
            System.out.printf("Girilen ilk değer olan %d son değerden daha büyük, son değer: %d",numbers[0],son);
        }else{
            System.out.printf("Girilen ilk değer olan %d son değerden daha küçük, son değer: %d",numbers[0],son);
        }
    }
}

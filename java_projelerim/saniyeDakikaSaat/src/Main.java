import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bu program saiye türünde girilen zamanın saat,dakika,saniye şeklinde ekranda gösterir.");

        Scanner openTheDoor = new Scanner(System.in);

        System.out.print("Lütfen zamanı saniye türünde belirti: ");
        int second = openTheDoor.nextInt();

        int hour= second/3600;
        int minute=(second/60)-(hour*60);
        int second1 =(second-((hour*60+minute)*60));
        System.out.printf("\nGirilen toplam saniye değeri: %d dir.\n\n%d saat, %d dakika, %d saniye eder.",second,hour,minute,second1);

    }
}
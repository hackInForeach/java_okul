import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println(
                "3.\tYarı çap uzunluğu kullanıcı tarafından girilen çemberin hacmini\n "
        );
        System.out.println("Çemberin yarı çap(r)'ını girini: ");
        int r = scanner.nextInt();
        System.out.println(
                "Çemberin hacmi: "+4/3*3.14*r*r*r
        );



    }
}
import java.util.Scanner;

public class Emeklilik {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Cinsiyetinizi girin(Kadın/Erkek): ");
        String cinsiyet=input.next();
        System.out.print("Yaşınızı girin: ");
        int yas=input.nextInt();
        int emekliSartKadin=60-yas;
        int emekliSartErkek=65-yas;


        switch (cinsiyet){
            case "Erkek":
                if (yas>=65){
                    System.out.println("Emekli olabilirsin");
                }else {
                    System.out.printf("Emekli olmak için %d yıl çalışman gerek",emekliSartErkek);
                }
                break;
            case "Kadın":
                if (yas>=60){
                    System.out.println("Emekli olabilirsin");
                }else {
                    System.out.printf("Emekli olmak için %d yıl çalışman gerek",emekliSartKadin);
                }
        }


    }
}
import java.util.Scanner;
import java.util.StringTokenizer;

public class Odev3 {
    public static void main(String[] args) {

        //hepsi burada :)
        choose();




    }

    public static int searchString(String s1, String ar1) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s1, " ,!");

        int say = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            sb.append(s);
            if (s.equalsIgnoreCase(ar1)) {
                say++;
            }
        }
        return say;
    }

    public static int searchString1(String s1, String ar1) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s1, " ,!");

        int say = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            sb.append(s);
            if (s.equals(ar1)) {
                say++;
            }
        }
        return say;
    }
    public static int searchString2(String s1, String ar1) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s1, " ,!.?");

        int say = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            sb.append(s);
            if (s.equalsIgnoreCase(ar1)) {
                say++;
            }
        }
        return say;
    }

    public static int searchString3(String s1, String ar1) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s1, " ,!.?");

        int say = 0;

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            sb.append(s);
            if (s.equals(ar1)) {
                say++;
            }
        }
        return say;
    }

    public static void printSentence() {
        Scanner input = new Scanner(System.in);
        String s1, ar1;


        boolean degerYanlisMi = true;
        while (degerYanlisMi) {
            System.out.print("Hassasiyet ayarı(Yes:1 Or No:2): ");
            int number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    System.out.print("Bir cümle gir: ");
                    s1 = input.nextLine();

                    System.out.print("Aranacak kelime: ");
                    ar1 = input.next();

                    System.out.printf("Aradnılan kelime \"%s\" \nVerilen kelimede bulunan adet: %d  ", ar1, searchString1(s1, ar1));
                    degerYanlisMi = false;
                    break;

                case 2:
                    System.out.print("Bir cümle gir: ");
                    s1 = input.nextLine();

                    System.out.print("Aranacak kelime: ");
                    ar1 = input.next();

                    System.out.printf("Aradnılan kelime \"%s\" \nVerilen kelimede bulunan adet: %d  ", ar1, searchString(s1, ar1));

                    degerYanlisMi = false;
                    break;

                default:
                    System.out.println("Lütfen 1 veya 2'yi tuşla!\n \"Enter'a Tıkla...\" ");
                    degerYanlisMi = true;
            }
            input.nextLine();
        }

    }

    public static void printParagraph() {
        Scanner input = new Scanner(System.in);
        String s1, ar1;

        boolean degerYanlisMi = true;
        while (degerYanlisMi) {
            System.out.print("Hassasiyet ayarı(Yes:1 Or No:2): ");
            int number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    System.out.print("Bir paragraf gir: ");
                    s1 = input.nextLine();

                    System.out.print("Aranacak kelime: ");
                    ar1 = input.nextLine();

                    System.out.printf("Aradnılan kelime \"%s\" \nVerilen kelimede bulunan adet: %d  ", ar1, searchString2(s1, ar1));
                    degerYanlisMi = false;
                    break;

                case 2:
                    System.out.print("Bir paragraf gir: ");
                    s1 = input.nextLine();

                    System.out.print("Aranacak kelime: ");
                    ar1 = input.nextLine();

                    System.out.printf("Aradnılan kelime \"%s\" \nVerilen kelimede bulunan adet: %d  ", ar1, searchString3(s1, ar1));

                    degerYanlisMi = false;
                    break;

                default:
                    System.out.println("Lütfen 1 veya 2'yi tuşla!\n \"Enter'a Tıkla...\" ");
                    degerYanlisMi = true;
            }
            input.nextLine();
        }
    }

    public static void choose(){
        Scanner input = new Scanner(System.in);
        int number, number1;

        boolean degerYanlisMi = true;
        while (degerYanlisMi) {
            System.out.println("Paragrafta kelime aramak içi:1,\nCümlede kelime aramak için:2 tuşlayın: ");
            number = input.nextInt();
            switch (number) {
                case 1:
                    printParagraph();
                    degerYanlisMi = false;
                    break;
                case 2:
                    printSentence();
                    degerYanlisMi = false;
                    break;
                default:
                    System.out.println("Lütfen belirtilen adımları izle!!");
                    degerYanlisMi = true;

            }

        }
    }
}

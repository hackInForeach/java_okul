import java.util.Scanner;
import java.util.StringTokenizer;

public class Odev2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir metin gir: ");

        String s1 = input.nextLine();

        System.out.printf("%s ", changeChar(s1));


    }

    public static StringBuffer changeChar(String s) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(s, " ");

        int say = 0;
        while (st.hasMoreTokens()) {

            sb.append(st.nextToken());
            sb.append(" ");

            for (int i = 1; i < sb.length(); i++) {

                if (sb.charAt(i) == 'a') {
                    say++;
                    if (say == 2)
                        sb.setCharAt(i, 'A');
                }
            }
        }
        return sb;
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Odev4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir tarih girin: ");
        String history = input.nextLine();

        hisyoryString(history);

    }

    public static void hisyoryString(String history) {

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(history, " /.,");

        int historyLong=5;
        String historyBrace=",";

        while (st.hasMoreTokens()) {
            sb.append(st.nextToken());
            sb.append(" ");
        }
        print(sb,historyLong,historyBrace);
    }
    public static void print(StringBuffer sb,int historyLong,String historyBrace){

        switch (sb.substring(0,2)) {
            case "1","01":
                sb.replace(0, 2, "Ocak");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "2","02":
                sb.replace(0, 2, "Şubat");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "3","03":
                sb.replace(0, 2, "Mart");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "4","04":
                sb.replace(0, 2, "Nisan");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "5","05":
                sb.replace(0, 2, "Mayıs");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "6","06":
                sb.replace(0, 2, "Haziran");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "7","07":
                sb.replace(0, 2, "Temmuz");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "8","08":
                sb.replace(0, 2, "Ağustos");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "9","09":
                sb.replace(0, 2, "Eylül");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "10":
                sb.replace(0, 2, "Ekim");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "11":
                sb.replace(0, 2, "Kasım");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            case "12":
                sb.replace(0, 2, "Aralık");
                sb.insert(sb.length() - historyLong, historyBrace);
                System.out.println(sb);
                break;
            default:
                System.out.println("Yanlış bir tarih girdin: Örn: 04 or 4/20/1992 ");
        }
    }
}

import java.util.Scanner;
import java.util.StringTokenizer;

public class Odev1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime gir: ");
        String s1 = input.nextLine();

        StringBuffer sb=new StringBuffer();
        StringTokenizer st=new StringTokenizer(s1,"., ");



        while (st.hasMoreTokens()){
            sb.setLength(0);//mevcut nesne temizlenip yerine bir sonraki yazılır
            System.out.print(sb.append(st.nextToken()).reverse()+" ");
        }
    }
}
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {

        String s = "I, am. leae.nin,g java";
        StringTokenizer st = new StringTokenizer(s, ",.");

        System.out.println("The total number of words is: "+ st.countTokens());

        while (st.hasMoreTokens()){
            System.out.println("token: "+st.nextToken());
            System.out.println("number of token left: "+st.countTokens());
        }

    }
}
public class TestParsing {
    public static void main(String[] argumans){
        String s="3";
        double a= Double.parseDouble(s);

        a+=2;
        System.out.println(a);

        int b= Integer.parseInt(s);
        b+=3;
        System.out.println(b);

    }
}

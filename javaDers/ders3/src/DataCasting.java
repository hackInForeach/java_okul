public class DataCasting {
    public static void main(String[] args) {
        int a= 134;
        double b=23.34;
        short c=34;
        byte d=14;

        double e=a;
        int f = c;
        short g=d;

        short h = (short) b;
        System.out.println("double 23,34 short karşılığı: "+h);

        int n = (int) b;
        System.out.println("double 23,34 int karşılığı: "+n);

    }
}
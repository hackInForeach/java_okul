public class StringComparison {
    public static void main(String[] argumans){

        String st1= new String("Kelime1");
        String st2=st1;

        if (st1==st2){
            System.out.println("Eşit!");
        }else {
            System.out.println("Eşit değil!");
        }
        String st3= new String("Kelime1");
        if (st1==st3){
            System.out.println("Eşit!");
        }else {
            System.out.println("Eşit değil!");
        }

        if (st1.equals(st3)){
            System.out.println("Eşit!");
        }else {
            System.out.println("Eşit değil!");
        }

        System.out.println(st1+" compared to "+ st3+": "+st1.compareTo(st3));

        String st4=new String("abc");
        String st5=new String("abe");

        System.out.println(st4+" compared to "+st5+": "+st4.compareTo(st5));

        String st6=new String("cef");
        String st7=new String("cdk");

        System.out.println(st6+" compared to "+st7+": "+st6.compareTo(st7));

        String st8="Merhaba";
        String st9="mERhaBa";

        if (st8.equals(st9)){
            System.out.println(st8+" is equal to "+st9+" with equlas method");
        }else {
            System.out.println(st8+" is NOT equal to "+st9+" with equals method");
        }

        if (st8.equalsIgnoreCase(st9)){
            System.out.println(st8+" is equal to "+st9+" with equlasIgnoreCase method");
        }else {
            System.out.println(st8+" is NOT equal to "+st9+" with equlasIgnoreCase method");
        }
    }
}

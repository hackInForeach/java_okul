public class AppendString {
    public static void main(String[] argumans){

        StringBuffer strBff= new StringBuffer();

        strBff.append("Welcome");
        strBff.append(" ");
        strBff.append("to");
        strBff.append(" ");
        strBff.append("Java");

        System.out.println(strBff);//welcome to Java

        strBff.insert(11,"magnificiend ");
        System.out.println(strBff);//welcome to magnificiend Java

        strBff.setLength(5);
        System.out.println(strBff);//welco

        strBff.setCharAt(2,'p');//wepco
        System.out.println(strBff);

        strBff.reverse();
        System.out.println(strBff);//ocpew


    }
}

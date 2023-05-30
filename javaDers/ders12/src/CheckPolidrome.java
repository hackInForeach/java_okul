import java.util.Scanner;

public class CheckPolidrome {
    public static void main(String[] argumans){

        System.out.println("Enter a string: ");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();

        if (isPolidrome(s)){
            System.out.println(s+" is a polidrome");
        }
        else {
            System.out.println(s+" is not a polidrome");
        }

    }
    public static boolean isPolidrome(String s){

        int low=0;
        int up=s.length()-1;


        while (low<up){
            if (s.charAt(low)!=s.charAt(up)){
                return false;
            }
            low++;
            up--;
        }
        return true;
    }

}

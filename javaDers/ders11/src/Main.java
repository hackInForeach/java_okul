import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1=new Rectangle();

        System.out.println("Rectangle1:");
        System.out.println("en: "+rectangle1.en);//1
        System.out.println("boy: "+rectangle1.boy);//1
        System.out.println("alan: "+rectangle1.findArea());//1
        System.out.println("çevre: "+rectangle1.findPerimeter());//4

        System.out.println("**********");
        Rectangle rectangle2=new Rectangle(2,3);

        System.out.println("Rectangle2:");
        System.out.println("en: "+rectangle2.en);//2
        System.out.println("boy: "+rectangle2.boy);//3
        System.out.println("alan: "+rectangle2.findArea());//6
        System.out.println("çevre: "+rectangle2.findPerimeter());//10


    }
}
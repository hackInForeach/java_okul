public class TestPassingObect {
    public static void main(String[] argumans){
        Circle myCircle=new Circle(5.0);
        printCircle(myCircle);
        //changeValues(myCircle,7);
    }
    static void printCircle(Circle c){
        System.out.println("The area of the circle of radius "+c.radius+" is "+c.findArea());
    }
    static void changeValues(Circle d,int x){
        d.radius=x;
        System.out.println("yarı çap değeri: "+d.radius+" tamsayı değeri: "+x);
    }
}

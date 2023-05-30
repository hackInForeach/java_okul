public class TestMyPoit {
    public static void main(String[] args) {
        //bu x,y noktasından
        MyPoint myPoint=new MyPoint();
       // myPoint.setX(-1);
       // myPoint.setY(-5);

        myPoint.setX(0);
        myPoint.setY(0);

        //bu x,y noktasına
        MyPoint myPoint1=new MyPoint();
       // myPoint1.setX(1);
       // myPoint1.setY(5);

        myPoint1.setX(3);
        myPoint1.setY(5);

        //(x,y)dizisi oluşturulu(max noktaları)
//        myPoint.setXY(8,4);
//        myPoint1.setXY(2,2);


        //ekrana x,y nin kordinatları basıldı
       // myPoint.printXY();
       // myPoint1.printXY();

       // System.out.println();
        //bir noktanın x,y olan uzaklık hesabı
       // myPoint.printDistance(myPoint1);

        //parmetre olark verilen noktanın mypointee uzaklığı
        // myPoint1.printDistance(myPoint);

        //verilen noktanın 0,0 a olan uzaklığı
        myPoint1.printDistance(myPoint);




    }

}
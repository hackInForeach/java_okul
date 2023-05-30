public class Circle {
    double radius;
    Circle(){
        radius=1.0;
    }
    Circle(double r){
        radius=r;
    }
    double findArea(){
        return radius*radius*Math.PI;
    }
}

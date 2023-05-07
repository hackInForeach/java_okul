public class AvarageOfNumbers {
    public static void main(String[] argumans){

        System.out.println(avaragaOfNumber(2,11));
        System.out.println(avaragaOfNumber(18,43));
        System.out.println(avaragaOfNumber(113,157));
    }
    public static double avaragaOfNumber(double number1,double number2){
        double sum=0;
        for (double i=number1;i<=number2;i++){
            sum+=i;
        }
        sum=sum/(number2-number1+1);
        return sum;

    }
}

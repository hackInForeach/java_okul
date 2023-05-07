public class MethodCallStack {
    public static void main(String[] argumans){
        int a=-1,b=-2,c=3;
        int max=findMaximum(a,b,c);
        System.out.printf("Bu %d, %d ve %d sayılarından en büyüğü %d dir",a,b,c,max);


    }
    public static int findMaximum(int number1,int number2,int number3){

        int maxNumber =number1;
        if (number2>maxNumber){
            maxNumber=number2;
        }if (number3>maxNumber) {
            maxNumber=number3;
        }
        return maxNumber;

    }
}

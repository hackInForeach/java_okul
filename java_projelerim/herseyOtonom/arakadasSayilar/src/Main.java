public class Main {
    public static void main(String[] args) {

        System.out.println("Bu program arkadaş sayıları bulur");


        int number1 = 2201;
        int number2 = 284;

        int total1 = 0, total2 = 0;


        for (int i=1;i<number1;i++){
            if (number1%i==0){
                total1=total1+i;
            }
        }
        for (int i=1;i<number2;i++){
            if (number2%i==0){
                total2=total2+i;
            }
        }
        if (total1==number2 && total2==number1){
            System.out.print("Arakadaş sayılardır = ");
            System.out.println(number1+" "+number2);
        }else {
            System.out.print("Arkadaş sayı değildir = ");
            System.out.println(number1+" "+number2);
        }



    }
}
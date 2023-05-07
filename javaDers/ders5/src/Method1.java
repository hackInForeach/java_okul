public class Method1 {
    public static void main(String[] argumans){

        sayiYazdir(1,7);
        System.out.println();
        sayiYazdir(15,29);
        System.out.println();
        sayiYazdir(103,147);
    }
    public static void sayiYazdir(int number,int number1){
        for (int i=number;i<=number1;i++){
            System.out.print(i+" ");
        }

    }
}

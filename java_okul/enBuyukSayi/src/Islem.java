public class Islem extends Message{
    public void  iislem (int number1,int number2,int number3) {
        if (number1>number2&&number1>number3){
            this.mess1();
            System.out.println("En büyük: "+number1);
        }else if (number2>number1&&number2>number3){
            this.mess2();
            System.out.println("En büyük: "+number2);
        }else if (number3>number1&&number3>number2){
            this.mess3();
            System.out.println("En büyük: "+number3);
        }else {
            this.mess4();
            System.out.println("En büyük: "+number1);
        }
    }
}

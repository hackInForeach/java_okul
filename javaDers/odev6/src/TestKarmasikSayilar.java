public class TestKarmasikSayilar {
    public static void main(String[] args) {

        KarmasikSayilar number1 = new KarmasikSayilar(3, 4);
        KarmasikSayilar number2 = new KarmasikSayilar(5, 6);

        KarmasikSayilar topla= number1.topla(number2);
        KarmasikSayilar carp= number1.carp(number2);

        System.out.print("Sayı1: ");
        number1.yazdir();

        System.out.print("Sayı2: ");
        number2.yazdir();

        System.out.print("Toplam: ");
        topla.yazdir();
        System.out.print("Çarpım: ");
        carp.yazdir();

        if (number1.esitmi(number2))
            System.out.println("number1 == number2");
        else
            System.out.println("number1 != number2");
    }
}
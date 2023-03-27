import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Bir dağıtım şirketinde bir paketi kargoyla göndermenin bedeli 2 kilograma kadar 10 dolardır. 2 kilohramdan fazla pakketlerde fazladan her kilogram için fiyat 3.75 dolar artmaktadır. Eğer paketin ağırlığı 70 kilogramdan fazlaysa 10 dolarlık \"ağırlığı aşma ücreti\", toplam ücrete eklenir. Girilen değerlere göre bu hesaplama programını yazınız. ");


        Scanner theOpen= new Scanner(System.in);

        System.out.print("\nHoşgeldiniz, Doğukan LTD.AŞ.ŞTİ. Sizlere Hizmet Vermekten Gurur Duyar \nLütfen Göndermek istediğiniz kargonun ağırlığını (kg)kilogram cinsinden giriniz (1kg=1000gram)= ");

        double kilogram=theOpen.nextDouble();
        double kargoBedel=10;
        double fazladanKargoBedel=(kilogram-2)*3.75;
        double kargoAsmaBedeli=10;
        double fiyatlandirma=0;

        if (kilogram>0){
            if (kilogram>70){
                fiyatlandirma=kargoBedel+fazladanKargoBedel+kargoAsmaBedeli;

                System.out.println("\nSevgili müşterimiz, Getirmek üzere olduğunuz kargonuzun özeti şu şekildedir: ");

                System.out.printf("\nKargo Ağırlığı(Kg): %.2fKg\nKargo fiyatı(2kg'ye kadar): %.2f$\nKargo fiyatı(2kg den fazla ise her kg için 3.75$): %.2f$\nKargo fiyatı(70kg üzeri Ağırlık Aşma Ücreti): %.2f$\nToplam Kargo Fiyatı: %.2f$",kilogram,kargoBedel,fazladanKargoBedel,kargoAsmaBedeli,fiyatlandirma);

            } else if (kilogram>2) {
                fiyatlandirma=kargoBedel+fazladanKargoBedel;

                System.out.println("\nSevgili müşterimiz, Getirmek üzere olduğunuz kargonuzun özeti şu şekildedir: ");

                System.out.printf("\nKargo Ağırlığı(Kg): %.2fKg\nKargo fiyatı(2kg'ye kadar): %.2f$\nKargo fiyatı(2kg den fazla ise her kg için 3.75$): %.2f$\nToplam Kargo Fiyatı: %.2f$",kilogram,kargoBedel,fazladanKargoBedel,fiyatlandirma);

            }else {
                fiyatlandirma=kargoBedel;

                System.out.println("\nSevgili müşterimiz, Getirmek üzere olduğunuz kargonuzun özeti şu şekildedir: ");

                System.out.printf("\nKargo Ağırlığı(Kg): %.2fKg\nKargo fiyatı(2kg'ye kadar): %.2f$\nToplam Kargo Fiyatı: %.2f$",kilogram,kargoBedel,fiyatlandirma);
            }
        }
        else {
            System.out.println("\nSevgili müşterimiz, Getirmek üzere olduğunuz kargonuzun özeti şu şekildedir: ");
            System.out.printf("\nAğırlık %.2f$ dir. Ödenek yok.",kilogram);
        }





    }
}
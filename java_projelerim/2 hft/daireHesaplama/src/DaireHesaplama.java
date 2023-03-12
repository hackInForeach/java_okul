import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.PI;

public class DaireHesaplama {
    public static void main(String[] args) {
        //veri alabilmek için kullanılır
        Scanner girdi = new Scanner(System.in);
        System.out.println("Hoş geldiniz. Yapmak istediğiniz işlemi seçiniz: ");
        int sonsuz=0;

        while (sonsuz<1){
            //String bir dizi oluşturuldu
            String[] islemler = new String[2];
            islemler[0] = "1 - Daire Hesaplama";
            islemler[1] = "2 - Hesap makinesi";

            //oluşturulan diziyi gezmek için kullanılır
            for (String islem : islemler) {
                System.out.println(islem);
            }

            int sec = girdi.nextInt();

            //switch anahtarını kullanarak bir çok işlemi yaptık "if-else"de kullanabilirdik
            switch (sec) {
                case 1:
                    //kullanıcıdan mesaj ile veri istenir
                    System.out.print("Lütfen yarı çapı \"r\" giriniz: ");
                    int r = girdi.nextInt();

                    //işlem değişkenleri
                    double islemCevre = 2 * PI * r;
                    double islemAlan = PI * r * r;
                    int cap = r + r;

                    //verinin son hali
                    System.out.println(
                            "\nDairenin Çevresi: " + islemCevre +" birim"+
                                    "\nDairenin Alanı: " + islemAlan +" birim^2"+
                                    "\nDairenin Çapı: " + cap +
                                    "\nDairenin Yarıçapı: " + r
                    );
                    break;
                case 2:
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin: ");

                    char[] operasyonlar = new char[4];
                    operasyonlar[0] = '+';
                    operasyonlar[1] = '-';
                    operasyonlar[2] = '*';
                    operasyonlar[3] = '/';
                    for (char op : operasyonlar) {
                        System.out.println(op);
                    }

                    String operator = girdi.next();
                    //içeride bir "if-else" karar yapısını kullanarak bir hesap makinesi işlemi yaptık
                    switch (operator) {
                        case "+":
                            System.out.println("Toplama işlemi: ");
                            System.out.print("Birinci Sayıyı Gir: ");
                            int number1 = girdi.nextInt();
                            System.out.print("İkinci Sayıyı Gir: ");
                            int number2 = girdi.nextInt();
                            int sonuc = number1 + number2;
                            System.out.println("Sonuc: " + sonuc);
                            break;
                        case "-":
                            System.out.println("Çıkarma işlemi: ");
                            System.out.print("Birinci Sayıyı Gir: ");
                            number1 = girdi.nextInt();
                            System.out.print("İkinci Sayıyı Gir: ");
                            number2 = girdi.nextInt();
                            sonuc = number1 - number2;
                            System.out.println("Sonuc: " + sonuc);
                            break;
                        case "*":
                            System.out.println("Çarpma işlemi: ");
                            System.out.print("Birinci Sayıyı Gir: ");
                            number1 = girdi.nextInt();
                            System.out.print("İkinci Sayıyı Gir: ");
                            number2 = girdi.nextInt();
                            sonuc = number1 * number2;
                            System.out.println("Sonuc: " + sonuc);
                            break;
                        case "/":
                            System.out.println("Bölme işlemi: ");
                            System.out.print("Birinci Sayıyı Gir: ");
                            double number11 = girdi.nextDouble();
                            System.out.print("İkinci Sayıyı Gir: ");
                            double number12 = girdi.nextDouble();
                            double sonuc2 = number11 / number12;
                            System.out.println("Sonuc: " + sonuc2);
                            break;
                        default:
                            System.out.println("Hatalı bir tuşlama yaptınız!");
                            number1=number2=0;
                    }
            }
            System.out.println("\n");
            System.out.print("İşleme devam etmek için \"0\" ı, değilse \"1\"i tuşlayın = ");
            sonsuz=girdi.nextInt();
            System.out.println("\n");
        }
        System.out.println("İyi günler.");
    }
}

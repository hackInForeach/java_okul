import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("""
                Soru: Dört basamaklıpozitif bir tam sayının basamaklarını değiştirerek onu şifreleyen bir java
                programı yazın. Şifreleme şu şekilde olmalı: Her bir basamağa 7 ekleyip 10 ile 
                bölümünden kalanı alın. Daha sonra ilk basamağı üçüncü basamakla, ikinci basamağı da
                dördüncü basamakla yer değiştirin. Şifreleyeceğiniz tam sayı kullanıcı tarafından 
                girilmelidir ve şifrelenmiş yeni tam sayı ekrana yazdırılmalıdır. Program kullanıcının 
                istenen özelliklere sahip bir tamsayı girip girmediğini de kontrol etmelidir. Programın 
                ekran hörüntüsüne bir örnek aşağıdaki gibi olabilir.
                    
                        Enter a four digit data: 4712
                        Encrypte data is: 8914
                                
                """);

        Scanner input = new Scanner(System.in);

        int numberSizeShort = 1000;
        int numberSizeLong = 9999;
        int newNumber = 0;
        int numberDivide = 0;
        int newNumber2 = 0;
        int newNumberPlus = 0;

        String message = "The entered number is %d. Please go to a value within the specified range.";

        System.out.print("Hello, please enter a positive four digit number(1000<->9999): ");
        int number = input.nextInt();
        if (number >= numberSizeShort && number <= numberSizeLong) {

            for (int i = 1000; i >= 1; i /= 10) {
                numberDivide = number / i;
                newNumber = (numberDivide + 7) % 10;
                newNumberPlus = newNumberPlus + (newNumber * i);
            }
            newNumber2 = (newNumberPlus % 100) * 100 + newNumberPlus / 100;

            System.out.printf("Enter a for digit data: %d", number);
            System.out.printf("\nEncrypted data is: %d", newNumber2);
        } else {
            System.out.printf(message, number);
        }
    }
}
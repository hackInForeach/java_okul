import java.util.Scanner;

public class MethodParametresiOlarakIkiBoyutluDizi {
    public static void main(String[] argumans) {

        int[][] sales = {
                {15, 3, 0, 1, 10, 4, 5},
                {1, 3, 5, 12, 1, 4, 5},
                {5, 3, 0, 1, 10, 4, 5},
                {15, 31, 0, 12, 1, 4, 5}
        };

        int dailySale;
        int day;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day number(1-7): ");
        day = input.nextInt();

        dailySale = columSum(sales, day - 1);
        System.out.printf("total sale on day %d is %d", day, dailySale);


    }

    public static int columSum(int[][] arr, int columIndex) {
//göderilen dizi deki sadece şu sütun ile ilgili işlem yap
        int rowSiz = arr.length;

        int total = 0;

        for (int i = 0; i < rowSiz; i++) {
            total += arr[i][columIndex];
        }
        return total;

    }
}

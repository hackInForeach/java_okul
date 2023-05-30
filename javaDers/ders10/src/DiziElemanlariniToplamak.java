import java.util.Scanner;

public class DiziElemanlariniToplamak {
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int[][] sales={
                {15,3,0,12,10,4},
                {15,3,0,12,10,4},
                {15,3,0,12,10,4},
                {15,3,0,12,10,4}
        };

        int rowSize=sales.length;
        int columsSize=sales[0].length;
        int totalSales=0;

        for (int i=0;i<rowSize;i++){
            for (int j=0;j<columsSize;j++){
                totalSales+=sales[i][j];
            }
        }
        System.out.println("Total sales this week: "+totalSales);

        //veya

        System.out.println("Hangi satır: ");
        int row=input.nextInt();

        System.out.println("Hangi sütun: ");
        int colum=input.nextInt();

        System.out.println("Kaç ile: ");
        int degis=input.nextInt();

        int ilkHal=sales[row-1][colum-1];
        sales[row-1][colum-1]=degis;
        int sonHal=sales[row-1][colum-1];

        System.out.printf("ilk hali: %d | Son hali: %d",ilkHal,sonHal);







    }
}

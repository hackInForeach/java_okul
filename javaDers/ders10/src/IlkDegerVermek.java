import java.util.Scanner;

public class IlkDegerVermek {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        final int rows = 2;
        final int colums = 3;

        int[][] matrix=new int[rows][colums];

        for (int i=0;i<rows;i++){
            System.out.println(i+1+". satır: {");
            for (int j=0;j<colums;j++){
                matrix[i][j]=i;

                //System.out.println(j+1+". Sütun: {"+input.nextInt()+"}");//elle gir

                System.out.println(j+1+". sütun: {"+i+"}");//bırak kendi girsin :)

            }
            System.out.println("}");
        }


    }
}

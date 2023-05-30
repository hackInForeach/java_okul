import java.util.Scanner;
public class PascalUcgeniIkiBoyutluDizi {
    public static void main(String[] argumans){
        Scanner input=new Scanner(System.in);
        System.out.print("How tall do you want the triangle to be: ");
        int rowSize=input.nextInt();
        int[][] pascalTriangle=new int[rowSize+1][];
        //creat a new array for each row
        for (int row=0;row<rowSize;row++){
            //each new array is one lagger then one before
            pascalTriangle[row]=new int[row+1];
        }
        //calculate the values of each node of the triangle will hold
        pascalTriangle[0][0]=1;
        for (int row=1;row<rowSize;row++){
            for (int colums=0;colums<pascalTriangle[row].length;colums++){

                if (colums==0||colums== pascalTriangle[row].length-1){
                    pascalTriangle[row][colums]=1;
                }else {

                    pascalTriangle[row][colums]=pascalTriangle[row-1][colums-1]+pascalTriangle[row-1][colums];
                }
                    /*
                compute the value of the row-1 array
                              1
                             1 1
                            1 2 1
                           1 3 3 1
                 */
            }
        }
        printing(pascalTriangle,rowSize);
//        printing1(pascalTriangle,rowSize);
    }
    //printing
    public static void printing(int[][] pascalTriagle, int rowSize){
        //from start to finish
        for (int row=0;row<rowSize;row++){
            System.out.println();
            for (int space=0;space<rowSize-row-1;space++){
                System.out.print("\t");
            }
            for (int colums=0;colums<pascalTriagle[row].length;colums++){
                System.out.print(pascalTriagle[row][colums]+"\t\t");
            }
            System.out.println();
        }

        //from the end to the beginnig
        for (int row=rowSize-1;row>0;row--){
            System.out.println();
            for (int space=0;space<rowSize-row;space++){
                System.out.print("\t");
            }
            for (int colums=0;colums<pascalTriagle[row-1].length;colums++){
                System.out.print(pascalTriagle[row-1][colums]+"\t\t");
            }
            System.out.println();
        }
    }

//    public static void printing1(int[][] pascalTriagle, int rowSize){
//        for (int row=rowSize-1;row>0;row--){
//            System.out.println();
//            for (int space=0;space<rowSize-row;space++){
//                System.out.print("\t");
//            }
//            for (int colums=0;colums<pascalTriagle[row-1].length;colums++){
//                System.out.print(pascalTriagle[row-1][colums]+"\t\t");
//            }
//            System.out.println();
//        }
//    }
}

public class JaggedArray {
    public static void main(String[] args){

        int[][] arr= {{1,2},{3,4,5,6,7,8},{9}};

        printJaggedArray(arr);


    }public static void printJaggedArray(int[][] arr){
        int rowSize=arr.length;
        for (int i=0;i<rowSize;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

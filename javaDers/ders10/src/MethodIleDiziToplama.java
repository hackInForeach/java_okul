public class MethodIleDiziToplama {
    public static void main(String[] argumans){
        int[][] sales={
                {15,3,0,12,10,4},
                {15,3,0,12,10,4},
                {15,3,0,12,10,4},
                {15,3,0,12,10,4}
        };
        int total=sum(sales);
        System.out.print(total);


    }
    public static int sum(int[][] arr){
        int rowSize=arr.length;
        int columSize=arr[0].length;
        int totalSales=0;
        for (int i=0;i<rowSize;i++){
            for (int j=0;j<columSize;j++){
                totalSales+=arr[i][j];
            }
        }
        return totalSales;
    }
}

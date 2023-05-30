public class DiziElemanlariniEkranaYazdir {
    public static void main(String[] args) {

        int[][] dizi={
                {1,2,3,2,3,2,3},
                {3,4,5,4,5,4,5},
                {5,6,7,6,7,6,7},
                {7,8,9,8,9,8,9}
        };
        System.out.println("Dall salaes by shops: ");
        printArray(dizi);


    }

    public static void printArray(int[][] arr) {
        int rowSize = arr.length;
        int columSize = arr[0].length;
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columSize; j++) {
                System.out.print(arr[i][j] + "\t");
                //\t bir tab boşluk bırak
            }
            System.out.println();
        }
        System.out.println();
    }
}

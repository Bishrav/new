public class TwoD {
    public static void main(String[] args) {
        int[][] arr = new int[4][4]; 

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;

        arr[1][0] = 1;
        arr[1][1] = 1;
        arr[1][2] = 1;

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        arr[3][0] = 1;
        arr[3][1] = 1;
        arr[3][2] = 1;

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
}

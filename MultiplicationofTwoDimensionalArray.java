public class MultiplicationofTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                product *= arr[i][j];
            }
        }

        System.out.println("Product of two-dimensional array elements: " + product);
    }
}

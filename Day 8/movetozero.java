public class movetozero {

    static void pushZerosToEnd(int[] arr) {

        int count = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        // Fill remaining positions with 0
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        pushZerosToEnd(arr);

        // Print the updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}

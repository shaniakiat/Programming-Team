
public class duplicatesZeros {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            // if the current element is 0 and isnt the last element
            if (current == 0 && i != arr.length - 1) {

                // shifting the array
                // looping from the end of array to the index + 2
                // if you find 0 at index 1
                // stop the loop at index 3, since index 2 will be a 0 too
                for (int j = arr.length - 1; j >= i + 2; j--) {
                    // copy the previous index to the current index
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = 0;
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
import java.util.Arrays;

public class swap0 {
    public static void main(String[] args) {

               int[] arr = {1, 2, 0, 3};
                swap(arr);
                System.out.println(Arrays.toString(arr));
            }

            static void swap(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == 0) {
                        array[i] = array[i - 1] * (-1);
                    }
                }
            }
        }


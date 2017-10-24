import java.util.Arrays;

public class sortvibor {
    public static void main(String[] args) {
        int n = 10;

        int[] arr = {0, 1, 7, 9, 4, 6, 5, 2, 8, 3};
        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] array){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int indexOfMin = j;
            for (int i = j; i < n; i++) {
                if (array[indexOfMin] < array[i]) {
                    indexOfMin = i;
                }
            }
            int buf = array[j];
            array[j] = array[indexOfMin];
            array[indexOfMin] = buf;
        }
    }
}

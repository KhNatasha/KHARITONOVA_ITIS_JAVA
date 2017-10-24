import java.util.Arrays;

public class swap0 {
    public static void main(String[] args) {
        int n = 10;

        int[] arr = {0, 1, 7, 9, 4, 0, 5, 2, 0, 3};


        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] array){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int indexOfMin = j;
            for (int i = j; i < n; i++) {
                if ( i == 0) {
                i = (i-1) - (i-1)*2;
            }
            int buf = array[j];
            array[j] = array[indexOfMin];
            array[indexOfMin] = buf;
        }
    }
}
}

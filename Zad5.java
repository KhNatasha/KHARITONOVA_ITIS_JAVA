public class Zad5 {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 2, 0, 4, 7, 5};
        int[] arr2 = {7, 1, 3};
        System.out.println(repeat(arr1));
        System.out.println(repeat(arr2));
    }

    static boolean repeat(int[] arr) {

        boolean k = false;
        for (int i = 0; i < arr.length & !k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i == j) {
                    k = true;
                }
            }

        }
        return k;
     }
}




























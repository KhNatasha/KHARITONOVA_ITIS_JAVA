
import java.util.Scanner;


public class str {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "str";
        arr[1] = "asd";
        arr[2] = "sxh";
        System.out.println(exists (arr));


        }


    static boolean exists(String[] arr, String str) {
        Scanner sc = new Scanner(System.in);
        String arr1 = sc.next();

        char m = 'str';
        boolean k = false;
        for (int i = 0; i < arr.length & !k; i++) {
            if (arr[m].equals(arr[i])) {
                k = true;
            }
        }

        return k;
    }
}




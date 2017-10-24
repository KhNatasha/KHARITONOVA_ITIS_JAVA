
public class str {
    public static void main(String[] args) {
        String arr[] = {"as", "str", "shk"};
        System.out.println(exists(arr));
    }

    static boolean exists(String[] arr) {
        boolean k = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("str")) {
                k = true;
            }

        }
        return k;
    }
}







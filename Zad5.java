
public class Zad5 {
    public static void main(String[] args) {
             String[] arr = {"f", "awad", "ej"};
                System.out.println(exists(arr));
            }
            static boolean exists (String arr[]){
                boolean b = false;
                for(int j = 0; j < arr.length; j++){
                    for(int i = j+1; i < arr.length; i++)
                        if(arr[i] .equals (arr[j]))
                            b = true;
                }
                return b;
            }
        }






























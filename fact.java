import java.util.Scanner;
public class fact {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int n = sc.nextInt();
            System.out.println(fact(n));

        }

        static int fact(int n){
            int k = 1;
            for(int i = 1; i < n + 1; i++) {
                k = k*i;
            }
            return k;
        }
    }


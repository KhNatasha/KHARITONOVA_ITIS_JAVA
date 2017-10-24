import java.util.Scanner;

/**
 * Решение задачи: вывести сумму элементов, стоящих
 * на нечетных позициях во введенном массиве (0 - четное число! )
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];// объявили массив с числом элементов n

        //считываем элементы массива по одному
        for (int i = 0; i < n; i++){
            System.out.println("Введите следующий элемент массива: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        //находим сумму элементов, расположенных на четных позициях
        int sum = 0;
        for (int i = 1; i < n; i = i + 2){//обратите внимание, i увеличиваем на 2, чтобы брать только четные позиции
            sum += arr[i];
        }

        System.out.println("Сумма: " + sum);
    }
}

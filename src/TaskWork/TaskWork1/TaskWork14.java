package TaskWork.TaskWork1;
import java.util.Random;

public class TaskWork14 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        for (int i = 0; i < mass.length; i++) {
            Random random = new Random();
            int a = random.nextInt(40);
            mass[i] = (a - 20);
        }

        //Выведите максимальный и минимальный элемент массива.
        int max = 0;
        int min = 0;
        for (int i = 0; i < mass.length; i++) {
            max = Math.max(max, mass[i]);
            min = Math.min(min, mass[i]);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);}

        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        //Из максимального и минимального значения выведите наибольшее по модулю.
        if (Math.abs(max) > Math.abs(min)) {
            System.out.println("Из максимального и минимального значения выведите наибольшее по модулю " + Math.abs(max));
        }else {
        System.out.println("Из максимального и минимального значения выведите наибольшее по модулю " + Math.abs(min));
        }
    }

}

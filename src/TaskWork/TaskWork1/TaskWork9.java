package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork9 {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив типа double
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        double[] mass = new double[a];
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Введите данные массива:");
            double b = scanner.nextDouble();
            mass[i] = b;
        }
        // находим среднее арифметическое элементов массива
        double sum = 0;
        for( int i = 0 ; i < mass.length; i++){
            sum += mass[i];
        }
        double sred_arifm = sum/a;
        System.out.println("среднее арифметическое элементов массива равно " + sred_arifm);

        // производим вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for( int i = 0 ; i < mass.length; i++){
            System.out.println(mass[i] * sred_arifm);
        }
        scanner.close();
    }
}

package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        String a = scanner.nextLine();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int a1 = Integer.parseInt(a);

        //Сравнить 2 числа и вывести большее на экран .
        if (a1 > b) {
            System.out.println("Большее число " + a1);
            double b1 = b;
            System.out.println("Меньшее число " + b1);
        } else if (b > a1){
            System.out.println("Большее число " + b);
            double a2 = a1;
            System.out.println("Меньшее число " + a2);
        } else {
            System.out.println("Числа равны " + b);
        }
        scanner.close();
    }
}

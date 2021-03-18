package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n");
        int a = scanner.nextInt();
        int b = 0;
        for(int i = 0 ; i <= a ; i ++){
            if( i % 2 == 1){
                b += i;
            }
        }
        System.out.println("Сумма всех нечетных чисел: " + b);
        scanner.close();
    }
    }


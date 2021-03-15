package TaskWork.TaskWork1;
import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара: ");
        double d = scanner.nextDouble();
        System.out.print("Количество рублей: ");
        int r = scanner.nextInt();
        if(d <= 0){
            System.out.println("Введите значение курса доллара больше нуля");
        } else {
        double itogo = r/d ;
        double a = Math.pow(10,2);
        double result = Math.ceil(itogo * a)/a ;
        System.out.print("Итого: " + result + " долларов");
        }
        scanner.close();
    }
}

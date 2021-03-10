package TaskWork.TaskWork1;
import java.util.Scanner;


public class TaskWork4 {
    public static void main(String[] args){

        Scanner one = new Scanner(System.in);
        System.out.println("Введите первое число");

        int a = one.nextInt();


        System.out.println("Введите второе число");

        int b = one.nextInt();


        System.out.println("Введите третье число");

        int c = one.nextInt();

        int d = (a + b + c )/ 3;
        System.out.println("Среднее арифметическое трех числе " + d);

        if(d/2 > 3){
            System.out.println("Программа выполнена корректно");
        }
        one.close();
    }
}

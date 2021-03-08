package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork5 {
    public static void main(String[] args){
        Scanner one = new Scanner(System.in);
        System.out.println("Введите первое число ");

        int a = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("Введите второе число");

        int b = two.nextInt();

        Scanner oper = new Scanner(System.in);
        System.out.println("Введите один из символов + , - , * , / :");

        String c = oper.nextLine();

        switch (c) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
        }
    }
}

package TaskWork.TaskWork1;
import java.util.Locale;
import java.util.Scanner;

public class TaskWork12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст I like Java!!!");
        String java = scanner.nextLine();
        boolean a1 = java.contains("Java");
        boolean a2 = java.startsWith("I like");
        boolean a3 = java.endsWith("!!!");
        if (a1 == true && a2 == true && a3 == true ){
            String java1 = java.toUpperCase();
            System.out.println(java1);

            String java2 = java.replace("a","o");
            String java3 = java2.substring(7);
            System.out.println(java3);
        } else {
            System.out.println("Вы ввели текст неправильно");
        }
    }
}

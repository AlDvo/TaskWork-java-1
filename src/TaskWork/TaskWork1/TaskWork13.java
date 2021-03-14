package TaskWork.TaskWork1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст ");
        String a = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z[\\s]]*");
        Matcher matcher = pattern.matcher(a);
        int num = 0;
        while (matcher.find()){
            System.out.print(matcher.group());
            num ++;
        }
        System.out.println( "\nКоличество слов: " + num);
        scanner.close();
    }
}

package TaskWork.TaskWork1;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст ");
        String a = scanner.nextLine();
        String[] massiv = a.split(" ");
        int num = 0;
        for(int i = 0 ; i < massiv.length ; i++) {
            Pattern pattern = Pattern.compile("[a-zA-Z]\\w*");
            Matcher matcher = pattern.matcher(massiv[i]);
            boolean found = matcher.matches();
            if (found){
                System.out.println(massiv[i]);
                num++;
            }
        }
        System.out.println( "Количество слов: " + num);
        scanner.close();
    }
}

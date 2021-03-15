package TaskWork.TaskWork1;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввод: ");
        String str = scanner.nextLine();
        String[] words = str.split("");
        int x = str.indexOf("x");
        int plus = str.indexOf("+");
        int ravno = str.indexOf("=");

        if( plus > 0 && ravno == 3 &&  x == 4){
            int one = Integer.parseInt(words[0]);
            int two = Integer.parseInt(words[2]);
            int result = one + two;
            System.out.println("Вывод: "+ result);
        }else if ( plus < 0 && ravno == 3 &&  x == 4){
            int one = Integer.parseInt(words[0]);
            int two = Integer.parseInt(words[2]);
            int result = one - two;
            System.out.println("Вывод: "+ result);
        }else if ( plus > 0 && ravno == 3 &&  x == 0){
            int one = Integer.parseInt(words[2]);
            int two = Integer.parseInt(words[4]);
            int result = two - one;
            System.out.println("Вывод: "+ result);
        }else if ( plus < 0 && ravno == 3 &&  x == 0){
            int one = Integer.parseInt(words[2]);
            int two = Integer.parseInt(words[4]);
            int result = two + one;
            System.out.println("Вывод: "+ result);
        }else if ( plus > 0 && ravno == 3 &&  x == 2){
            int one = Integer.parseInt(words[0]);
            int two = Integer.parseInt(words[4]);
            int result = two - one;
            System.out.println("Вывод: "+ result);
        }else if ( plus < 0 && ravno == 3 &&  x == 2){
            int one = Integer.parseInt(words[0]);
            int two = Integer.parseInt(words[4]);
            int result = one - two;
            System.out.println("Вывод: "+ result);
        }else if ( ravno != 3){
            System.out.println("Программа принимает на вход строку длиной 5 символов.  Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. Введите уровнение заново ");
        }
        scanner.close();
    }
}

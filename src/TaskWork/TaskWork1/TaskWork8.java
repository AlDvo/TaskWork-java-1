package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] mass = new int[a];
        for(int i = 0 ; i < a ; i ++){
            mass[i] = i;
            System.out.println(mass[i]);
        }

        }
    }


package TaskWork.TaskWork1;
import java.util.Scanner;
import java.util.Arrays;

public class TaskWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива 1");
        int mass1 = scanner.nextInt();
        System.out.println("Введите размер массива 2");
        int mass2 = scanner.nextInt();
        int[][] mass = new int[mass1][mass2];
        for( int i = 0 ; i < mass.length ; i++ ){
            for( int c = 0 ; c < mass[0].length ; c++){
                System.out.println("Введите знасчение");
                int a = scanner.nextInt();
                mass[i][c] = a;
            }
        }
        //вывод первой строки матрицы на экран, где каждый элемент умножается на 3
        for(int i = 0 ; i< mass[0].length ; i++){
            System.out.println((mass[0][i])*3 );
        }
        scanner.close();
    }
}

package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int i = scanner.nextInt();
        int[] mass = new int[i];
        for(i=0 ; i < mass.length ; i++){
            System.out.println("Введите данные массива:");
            int a = scanner.nextInt();
            mass[i]=a;
        }
        int x = 30;
        int y = 12;
        int z = 2;
        for(i = 0 ; i < mass.length ; i++){
         if (mass[i]==x | mass[i]==y | mass[i]==z){
             System.out.println("Данное значение имеется в константах");
         }
        }
    }
}

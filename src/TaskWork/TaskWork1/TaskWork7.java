package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        int[] mass = new int[a];
        for(int i =0 ; i < mass.length ; i++){
            System.out.println("Введите данные массива:");
            int b = scanner.nextInt();
            mass[i]=b;
        }
        int x = 30;
        int y = 12;
        int z = 2;
        int n = 0;
        for(int i = 0 ; i < mass.length ; i++){
         if (mass[i]==x | mass[i]==y | mass[i]==z){
             n++;
         }
        }
        if (n > 1){
            System.out.println("Данное значение имеется в константах");}
    }
}

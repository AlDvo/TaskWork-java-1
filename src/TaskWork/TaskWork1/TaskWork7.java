package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork7 {
    public static void main(String[] args) {
        int x = 30;
        int y = 12;
        int z = 2;
        //Пользователь вводит размер массива и данные с клавиатуры в массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int a = scanner.nextInt();
        int[] mass = new int[a];
        for(int i =0 ; i < mass.length ; i++){
            System.out.println("Введите данные массива:");
            int b = scanner.nextInt();
            mass[i]=b;
        }
        //Сравнить элементы массива с заранее заданными константами x, y, z.
        boolean same = false;
        for(int i = 0 ; i < mass.length ; i++){
         if (mass[i]==x | mass[i]==y | mass[i]==z){
             same = true;
         }
        }
        //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        if (same){
            System.out.println("Данное значение имеется в константах");}
        else {
            System.out.println("Данных значений нет в константах");}
        scanner.close();
    }
}

package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");

        int value = scanner.nextInt();

        if (value == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

            int unit = scanner.nextInt();
            switch ( unit ){
                case 1:
                    System.out.println("Введите число :");

                    int c = scanner.nextInt();
                    System.out.println("Результат: \n Метров " + c + "\n Милли " + c * 0.00062 + "\n Ярды " + c * 1.094 + "\n Футы " + c * 3.281);
                break;
                case 2 :
                    System.out.println("Введите число :");

                    int d = scanner.nextInt();
                    System.out.println("Результат: \n Метров " + d * 1609.34 + "\n Милли " + d + "\n Ярды " + d * 1760 + "\n Футы " + d * 5280);
                    break;
                case 3 :
                    System.out.println("Введите число :");

                    int e = scanner.nextInt();
                    System.out.println("Результат: \n Метров " + e * 0.91 + "\n Милли " + e * 0.00057 + "\n Ярды " + e + "\n Футы " + e * 3);
                    break;
                case 4 :
                    System.out.println("Введите число :");

                    int f = scanner.nextInt();
                    System.out.println("Результат: \n Метров " + f * 0.4 + "\n Милли " + f * 0.00019 + "\n Ярды " + f * 0.33 + "\n Футы " + f);
                break;

            }
        } else if (value == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");

            int unit = scanner.nextInt();
            switch (unit){
                case 1:
                    System.out.println("Введите число :");

                    int g = scanner.nextInt();
                    System.out.println("Результат: \nКилограмм " + g + "\nФунт " + g * 2.2);
                    break;
                case 2 :
                    System.out.println("Введите число :");

                    int k = scanner.nextInt();
                    System.out.println("Результат: \nКилограмм " + k * 0.45 + "\nФунт " + k);
                    break;
            }
        }
        scanner.close();
    }
}

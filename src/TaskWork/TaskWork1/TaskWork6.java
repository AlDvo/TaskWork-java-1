package TaskWork.TaskWork1;
import java.util.Scanner;

public class TaskWork6 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");

        int a = one.nextInt();

        if (a == 2) {
            Scanner two = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

            int aa = two.nextInt();
            switch ( aa ){
                case 1:
                    Scanner three = new Scanner(System.in);
                    System.out.println("Введите число :");

                    int c = three.nextInt();
                    System.out.println("Результат: \n Метров " + c + "\n Милли " + c * 0.00062 + "\n Ярды " + c * 1.094 + "\n Футы " + c * 3.281);
                break;
                case 2 :
                    Scanner ab = new Scanner(System.in);
                    System.out.println("Введите число :");

                    int d = ab.nextInt();
                    System.out.println("Результат: \n Метров " + d * 1609.34 + "\n Милли " + d + "\n Ярды " + d * 1760 + "\n Футы " + d * 5280);
                    break;
                case 3 :
                    Scanner ac = new Scanner(System.in);
                    System.out.println("Введите число :");

                    int e = ac.nextInt();
                    System.out.println("Результат: \n Метров " + e * 0.91 + "\n Милли " + e * 0.00057 + "\n Ярды " + e + "\n Футы " + e * 3);
                    break;
                case 4 :
                    Scanner ad= new Scanner(System.in);
                    System.out.println("Введите число :");

                    int f = ad.nextInt();
                    System.out.println("Результат: \n Метров " + f * 0.4 + "\n Милли " + f * 0.00019 + "\n Ярды " + f * 0.33 + "\n Футы " + f);
                break;

            }
            /*if (aa == 1) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Метров " + c + "\n Милли " + c * 0.00062 + "\n Ярды " + c * 1.094 + "\n Футы " + c * 3.281);
            } else if (aa == 2) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Метров " + c * 1609.34 + "\n Милли " + c + "\n Ярды " + c * 1760 + "\n Футы " + c * 5280);
            } else if (aa == 3) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Метров " + c * 0.91 + "\n Милли " + c * 0.00057 + "\n Ярды " + c + "\n Футы " + c * 3);
            } else if (aa == 4) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Метров " + c * 0.4 + "\n Милли " + c * 0.00019 + "\n Ярды " + c * 0.33 + "\n Футы " + c);
            }*/
        } else if (a == 1) {
            Scanner two = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");

            int bb = two.nextInt();
            switch (bb){
                case 1:
                    Scanner bc = new Scanner(System.in);
                    System.out.println("Введите число :");

                    int g = bc.nextInt();
                    System.out.println("Результат: \n Килограмм " + g + "\n Фунт " + g * 2.2);
                    break;
                case 2 :
                    Scanner bd = new Scanner(System.in);
                    System.out.println("Введите число :");

                    int k = bd.nextInt();
                    System.out.println("Результат: \n Килограмм " + k * 0.45 + "\n Фунт " + k);
                    break;
            }
            /*if (bb == 1) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Килограмм " + c + "\n Фунт " + c * 2.2);
            } else if (bb == 2) {
                Scanner three = new Scanner(System.in);
                System.out.println("Введите число :");

                int c = three.nextInt();
                System.out.println("Результат: \n Килограмм " + c * 0.45 + "\n Фунт " + c);
            }*/
        }
    }
}

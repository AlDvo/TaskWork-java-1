package TaskWork.TaskWork1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FinalTask4 {
    public static void main(String[] args) throws IOException {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String otvet = "Заархивированный вирус";
        String podskazka = "Подсказка";
        int mistake = 0;
        int sovet = 0;

        for( int i = 0 ; i < 4 ; i++){
            boolean result;
            boolean advice;
            BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ответ:");
            String otvet1 = stroka.readLine();
            result = otvet1.equalsIgnoreCase(otvet);
            advice = otvet1.equalsIgnoreCase(podskazka);

            if (result && !advice){
            System.out.println("Правильно!");
            break;
        } else if (!result && mistake < 2 && !advice && sovet == 0){
            System.out.println("Подумай еще!");
            mistake++;
        } else if (!result && mistake == 2 && !advice){
            System.out.println("Обидно, приходи в другой раз");
            break;
        } else if (!result && advice && mistake < 1){
            System.out.println("Maybe look");
            sovet++;
        } else if (!result && mistake >=1 && advice){
            System.out.println("Подсказка уже недоступна");
        }else if (!result  && mistake == 0 && sovet == 1){
            System.out.println("Обидно, приходи в другой раз");
            break;
        }
        }
    }
}

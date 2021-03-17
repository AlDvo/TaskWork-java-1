package TaskWork.TaskWork1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {
        //вводим количество строк n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        //вводим сами строки
        String[] mass = new String[n];
        int i = 0 ;
        while(i < n){
            System.out.print("Строка " + (i+1)+" :");
            BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));
            String slovo = stroka.readLine();
            mass[i] = slovo;
            i++;
        }
        //определяем кол-во символов в строке
        int[] sym = new int[n];// массив где в каждой ячейке указано кол-во не повторяющихся символов

        for(i = 0 ; i < n ; i++){
            String myString = "";
            for ( int b = 0 ; b < mass[i].length() ; b++){
                int bykva = mass[i].indexOf(mass[i].charAt(b));
                if (bykva == b) {
                    myString = myString + mass[i].charAt(b);
                }
            }
            sym[i] = myString.length();
        }

        //определяем  номер строки с максимальным кол-вом символов
        int max = 0;
        int povtor = 0;
        for( i = 1 ; i < n ; i++){
            if (sym[max] < sym[i]){
                max = i;
            }else if (sym[max] == sym[i]){
               povtor++;
            }
        }
        // Если таких строк будет много(3 строки), то вывести первую.
        if(povtor < 2){
        System.out.println("Ответ: " + mass[max]);
        } else {
            System.out.println("Ответ: " + mass[0]);
        }
        scanner.close();
    }
}

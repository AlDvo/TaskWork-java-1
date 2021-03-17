package TaskWork.TaskWork1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int a = scanner.nextInt();
        String[] mass = new String[a];
        int i = 0 ;
        while(i < a){
            System.out.print("Строка " + (i+1)+" :");
            BufferedReader stroka = new BufferedReader(new InputStreamReader(System.in));
            String slovo = stroka.readLine();
            mass[i] = slovo;
            i++;
        }
        scanner.close();
    }
}

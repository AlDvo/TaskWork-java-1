package TaskWork.TaskWork1;

public class TaskWork3 {
    public static void main(String[] args){
        int[] a = {3,7,8,13,54};
        a[0] = a[a.length-1];
        a[4] = 3;
        System.out.println(a[0]+ a[a.length-3]);
    }
}

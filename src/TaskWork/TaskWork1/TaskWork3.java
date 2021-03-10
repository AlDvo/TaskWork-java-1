package TaskWork.TaskWork1;

public class TaskWork3 {
    public static void main(String[] args){
        int[] a = {3,7,8,13,54};
        int[] b = {a[a.length-1],a[a.length-5]};
        a[0] = b[b.length-2];
        a[4] = b[b.length-1];;
        System.out.println(a[0]+ a[a.length-3]);
    }
}

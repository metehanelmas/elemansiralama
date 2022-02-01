import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int count,size;
        Scanner inp=new Scanner(System.in);
        System.out.print("Array Size :");
        size=inp.nextInt();
        int[]list=new int[size];
        System.out.println("List Employee Enter :");
        for (int i=0;i< list.length;i++){
            System.out.print(i+1+"."+"Employee Enter :");
            count=inp.nextInt();
            list[i]=count;
        }
        System.out.println("Sortting :"+sortArrays(list) );
    }
    public static String sortArrays(int[] arr){
        Arrays.sort(arr);
        return Arrays.toString(arr);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
        int n = arr.length;
        Scanner input = new Scanner(System.in);
        System.out.println("input numbew = ");
        int number = input.nextInt();
        int index;
        do {
            System.out.println("input index = ");
            index = input.nextInt();
        }
        while (index < 0 || index > n);
        for(int i=n-1;i>=index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=number;
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
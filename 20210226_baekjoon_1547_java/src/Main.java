import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[4];
        boolean temp = false;

        arr[1] = true;
        arr[2] = false;
        arr[3] = false;
 

        for (int i = 0; i < n; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
 
            temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        } 
 
        for (int i = 1; i < 4; i++) {
            if (arr[i] == true)
                System.out.println(i);
        } 
    }
 
}
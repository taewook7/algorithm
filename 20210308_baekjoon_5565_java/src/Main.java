import java.util.Scanner;

import jdk.nashorn.api.tree.ForOfLoopTree;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=sc.nextInt();
        for (int i = 0; i < 9; i++) {
			
        	int value=sc.nextInt();
        	total-=value;
		}
        
        System.out.println(total);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws Exception, IOException {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int one = sc.nextInt();
        int two = sc.nextInt();
        int temp ;
        
        if(one > two) {
        	temp = one;
        	one= two;
        	two = temp;
        }
        int count = 0;
        n=n-1;
        while(true) {
        	n = n/2;
        	count++;
        	if(n==0) {
        		break;
        	}
        }
        while(true) {
        	int middle=(int) Math.pow(2, count-1);
        	if(one<=middle && two <= middle) {
        		count = count-1;
        	} else if(one>middle && two>middle) {
        		one=one-middle;
        		two=two-middle;
        		count=count-1;
        	} else if(one<=middle && two >middle) {
        		break;
        	}
        }
        System.out.println(count);
        sc.close();
        
    }
}
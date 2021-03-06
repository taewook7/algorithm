import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum,count =0;
        int mok=0;
        int namoji;
        
        
        
        for (int i = 1; i <= a; i++) {
			mok=i;
			sum=0;
			
        	while(true) {
        		if(mok ==0) break;
        		namoji = mok % 10;
        		mok=mok/10;
        		sum=sum+namoji;
        	}
        	if(i%sum ==0) count++;
		}
        System.out.println(count);
    }
}
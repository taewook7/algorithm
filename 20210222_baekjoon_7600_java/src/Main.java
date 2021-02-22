import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[26];
    	
    	while(true) {
    		int count =0;
    		String st = sc.nextLine();
    		
    		if(st.equals("#")) {
    			break;
    		}
    		
    		for(int i=0; i<st.length(); i++) {
    			if((int)st.charAt(i) >= 97 && (int) st.charAt(i) <=122) {
    				arr[(int)st.charAt(i)-97]++;
    			}
    			if((int)st.charAt(i) >= 65 && (int)st.charAt(i) <=90) {
    				arr[(int)st.charAt(i)-65]++;
    			}
    		}
    		
    		for(int i= 0; i<arr.length; i++) {
    			if(arr[i]>0) {
    				count++;
    				arr[i]=0;
    			}
    		}
    		System.out.println(count);
    	}
    	
    }
}

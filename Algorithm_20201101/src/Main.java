import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st=sc.next().toUpperCase();
		//a,b,c,d,e,f,g,h,i,j,k,m,l,n,o,p,q,r,s,t,u,v,w,x,y,z
		
		// 가장 많이나온 배열을 찾는다.
		int[] alphabet = new int[26];
		
		//가장 많이나온 배열이 여러개 일때를 위해 만든다.
		int[] alphabet2 =new int[26];
		
		//follow 같은 단어는 o 하고 l  2개씩임  
		for (int i = 0; i < st.length(); i++) {
			int a=st.charAt(i)-65;
			
			alphabet[a] +=1;
			alphabet2[a] +=1;
		}
		Arrays.sort(alphabet2);
		
		if(alphabet2[alphabet2.length-1] == alphabet2[alphabet2.length-2])
			System.out.println("?");
		else {
			//  가장많이나온 배열이 2개가 아니라면 마지막배열을 가져오고
			int a=alphabet2[alphabet2.length-1];
			
			for (int i = 0; i < alphabet2.length; i++) {
				char b=(char) (i+65);
				if (alphabet[i]==a) {
					System.out.println(b);
				}
			}
		}
		
	}
}

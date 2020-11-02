import java.util.Scanner;
public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String st=sc.nextLine();
		String st2= st+" ";
		int count = 0;
		for (int i = 0; i < st.length(); i++) {
			int k=st2.charAt(i)-65 ;
			int k1=st2.charAt(i+1)-65;
			if (k>=0 && k1 <0  ) {
				count++;
			}
		}		
		System.out.println(count);
	}
}

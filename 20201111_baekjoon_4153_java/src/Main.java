import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			String result=null;
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int aa= a * a;
			int bb= b * b;
			int cc= c * c;
			
			if (aa > bb) {
				if (aa>cc) {
					result=( (bb+cc)== aa ) ? "right":"wrong";
				} else {
					result=( (aa+bb)== cc ) ? "right":"wrong";
				}
			} else if(bb > cc) {
				
				if (bb > cc) {
					result=( (aa+cc)== bb) ? "right":"wrong";
				} else {
					result=( (aa+bb)==cc ) ? "right":"wrong";
				}
			} else if (cc > aa) {
				if (cc>bb) {
					result=( (aa+bb) == cc) ? "right":"wrong";
				} else {
					result=( (aa+cc)== bb) ?"right":"wrong";
				}
			}
			
			
			if(a == 0 && b == 0 && c== 0) {
				break;
			}	
			System.out.println(result);
		}
	}

}

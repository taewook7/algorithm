//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String A=sc.next();
//		String B=sc.next();
//		String e = null;
//		int c=Integer.parseInt(A);
//		int d=Integer.parseInt(B);
//		if (c>d) {
//			e= c+"";
//		}
//		if(c<d) {
//			e=d+"";
//		}
//		 
//		for (int i = A.length()-1; i >= 0 ; i--) {
//			System.out.print(e.charAt(i));
//		}
//	}
//}
//
//import java.util.Scanner;
//
//
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String A=sc.next();
//		String B=sc.next();
//		String e = null;
//		int c=Integer.parseInt(A);
//		int d=Integer.parseInt(B);
//		if (c>d) {
//			e= d+"";
//		}
//		if(c<d) {
//			e=c+"";
//		}
//		 
//		for (int i = A.length()-1; i >= 0 ; i--) {
//			System.out.print(e.charAt(i));
//		}
//	}
//}

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int aaa,aa,a =0;
		int bbb,bb,b=0;
		
		aaa=num1/100;
		aa= (num1/10) - (aaa*10) ;
		a=num1%10;
		
		bbb=num2/100;
		bb= (num2/10) - (bbb*10) ;
		b=num2%10;
		
		
		int tmp1,tmp2=0;
		tmp1= (a*100) +(aa*10) +(aaa);
		tmp2= (b*100) +(bb*10) +(bbb);
		
		if (tmp1>tmp2) {
			System.out.println(tmp1);
		} 
		if (tmp2>tmp1) {
			System.out.println(tmp2);
		}
		
	}
}






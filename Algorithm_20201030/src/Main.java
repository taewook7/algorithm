import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
// a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z 소문자 총 26개임
		int[] a=new int[26];
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String k;
		
		//일단 전부다 -1 로 만듬. 
		for (int i = 0; i < a.length; i++) {
			a[i]=-1;
		}
		
		//한글자씩 가져와야되니깐 char 형을 썼다. 
		//score
		// 단어에서 포함돼있는 경우 처음 등장위치를,포함돼있지 않은 경우는 -1을 출력하시오
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i) ;
			int zz=c;
			zz=zz-97;
			
			if (a[zz]==-1) {
				a[zz]=i;
			}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	
	}

}

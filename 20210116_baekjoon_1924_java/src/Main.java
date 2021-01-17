import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		Calendar cal = Calendar.getInstance();
		cal.set(2007, x-1, y);
			int m = cal.get(Calendar.DAY_OF_WEEK);
			
			switch (m) {
			case 1: {
				System.out.println("SUN");
				break;
			}
			case 2: {
				System.out.println("MON");
				break;
			}
			case 3: {
				System.out.println("TUE");
				break;
			}
			case 4: {
				System.out.println("WED");
				break;
			}
			case 5: {
				System.out.println("THU");
				break;
			}
			case 6: {
				System.out.println("FRI");
				break;
			}
			case 7: {
				System.out.println("SAT");
				break;
			}
			}
	}
}
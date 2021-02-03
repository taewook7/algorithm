import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] repository = new int[8];
        for(int i=0; i<repository.length; i++) {
            repository[i]=sc.nextInt();
        }
        String print ="";
        for(int i=0; i<repository.length; i++) {
            if(repository[0]==1) {
                if(repository[1] != i+1) {
                    print = "mixed";
                    break;
                }
                print = "ascending";
            } else if ( repository[0] == 8) {
                if(repository[i] + i != 8) {
                    print="mixed";
                    break;
                }
                print = "descending";
            } else {
                print ="mixed";
                break;
            }
        }
        System.out.println(print);
    }
}
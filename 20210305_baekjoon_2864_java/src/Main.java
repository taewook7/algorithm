import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        int aMin=0;
        int aMax=0;
        int bMin=0;
        int bMax=0;
        int abMin=0;
        int abMax=0;
        
        String bMinStr=Integer.toString(a);
        String bMaxStr=Integer.toString(a);
        String aMinStr=Integer.toString(b);
        String aMaxStr=Integer.toString(b);
        aMin=Integer.parseInt(aMinStr.replace('6', '5'));
        aMax=Integer.parseInt(aMinStr.replace('5', '6'));
        bMin=Integer.parseInt(bMinStr.replace('6', '5'));
        bMax=Integer.parseInt(bMinStr.replace('5', '6'));
        
        abMin=aMin+bMin;
        abMax=aMax+bMax;
        System.out.println(abMin+" "+abMax);
        
    }
}
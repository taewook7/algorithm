import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		String mbti = br.readLine();
//			if(mbti.charAt(0) == 'E' ) {
//				bw.write("I");
//			} else {
//				bw.write("E");
//			} 
//			if(mbti.charAt(1) == 'S') {
//				bw.write("N");
//			} else {
//				bw.write("S");
//			}
//			if(mbti.charAt(2) == 'T') {
//				bw.write("F");
//			} else {
//				bw.write("T");
//			}
//			if(mbti.charAt(3) == 'P') {
//				bw.write("J");
//			} else {
//				bw.write("P");
//			}
//			bw.flush();
//			bw.close();
//			br.close();
		String temp="";
		String MBTI = sc.next();
		if(MBTI.charAt(0) == 'E') {
			temp += "I";
		} else {
			temp +="E";
		}
		if(MBTI.charAt(1) == 'S') {
			temp += "N";
		} else {
			temp +="S";
		}
		if(MBTI.charAt(2) == 'F') {
			temp += "T";
		} else {
			temp +="F";
		}
		if(MBTI.charAt(3) == 'J') {
			temp += "P";
		} else {
			temp +="J";
		}
		System.out.println(temp);
	}
}
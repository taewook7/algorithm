import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(result(sc.next()));
		}
	}

	public static String result(String st) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			
			if (c == '(') {
				stack.push(c);
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		if(stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
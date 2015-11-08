import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		String str = sc.nextLine();
		System.out.println("The input string is: " + str);
		Stack<String> st = new Stack<String>();
		// methodPush(x, str);
		String[] strArray = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			st.push(strArray[i]);
		}
		System.out.println("The stack count: " + st.size());
	
		while(!st.empty()){
			System.out.print(st.pop() + " ");
		}
	}

}

import java.io.*;
import java.util.*;


public class Test{
	public static double operate(char op, double first, double second){
		//System.out.println(op + " "+first + " "+ second);
		if(op == '+'){
			return first + second;
		}
		else if (op == '-'){
			return first - second;
		}
		else if (op == '*'){
			return first * second;
		}
		else if (op == '/'){
			return first / second;
		}
		else{
			return second;
		}

	}

	public static void main(String argv[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int start = 0;
		char op = 's';
		double result = 0;
		while(scan.hasNextLine()){
			try{
				String now = scan.nextLine();
				char[] arr = now.toCharArray();
				for(int i = 0; i < arr.length; i++){
					if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/'){
						String tmp = now.substring(start, i);
						double num = Double.parseDouble(tmp);
						result = operate(op,result,num);
						op = arr[i];
						start = i+1;
					}
					if(i == arr.length-1){
						String tmp = now.substring(start, i+1);
						double num = Double.parseDouble(tmp);
						result = operate(op, result, num);
					}
				}
				System.out.println(result);
				start = 0;
				op = 's';
				result = 0;
			}
			catch(Exception e){
				System.out.println("error");
			}
		}
	}
}
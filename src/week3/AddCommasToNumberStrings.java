package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {

	private String addCommasToNumbericString (String digits) {
		String result = "";
		int A = digits.length();
		int nDigits = 0;
		
		for(int i = A-1; i>=0; i --) {
			result = digits.charAt(i) + result;
			nDigits++;
			
			if ((nDigits % 3) ==0){
				result = "," + result;
			}
		}
		return result;
	}

	public void run() {
		while (true) {
			String digits = readLine("Enter a numeric to: ");
			if (digits.length()==0) break;
			println(addCommasToNumbericString (digits));
			
		}
	}
}

	
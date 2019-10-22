public class Boggle {

	public static void main(String args[]) {
		String input = "zk";
		String response = rollChars(input);
		System.out.println(" Response After Roll is "+response);
		int number = 123;
		System.out.println(" Reverse of the Number "+ reverse(number));
		int result = toNumber("234");
		System.out.println(" The response is "+result);
	}
	
	private static String rollChars(String input) {
		StringBuilder response = new StringBuilder();
		char[] data = input.toCharArray();
		for(char element : data) {
			response.append((char)(findRollElement(element)));
		}
		return response.toString();
	}
	
	
	private static int findRollElement(char input) {
		if(input=='Z') {
			return 65;
		}
		if(input=='z') {
			return 97;
		}
		return(input+1);
	}
	
	private static int reverse(int input) {
		int reverse = 0;
		while(input>0) {
			reverse = reverse*10+input%10;
			input = input/10;
		}
		return reverse;
	}

	private static int toNumber(String input) {
		int result = 0;
		if(input==null || input.length()==0) {
			return 0;
		}
		for(char element : input.toCharArray()) {
			result = result*10+ (element-'0');
		}
		return result;
	}
}


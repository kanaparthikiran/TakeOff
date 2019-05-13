package Q1_01_Is_Unique;

public class QuestionA {
	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		
		char[] lset = new char[128];

		for (int i = 0; i < lset.length; i++) {
			System.out.print(lset[i]+" ");
		}
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(" Gayle here is it "+val);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
		System.out.println(" The Unique Characters are " + findAreUnique("aa"));
	}
	
	
	
	private static boolean findAreUnique(String test) {
		if(test!=null && test.length()>0) {
			char[] elements = test.toCharArray();
			int[] asciiList = new int[128];
			for(char element : elements) {
				asciiList[element]++;	
			}
			for(int asciiElement : asciiList) {
				if(asciiElement>1) {
					return false;
				}
			}
		}
		return true;
	}

}

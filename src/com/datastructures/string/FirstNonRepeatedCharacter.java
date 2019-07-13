package com.datastructures.string;

/**
 * 
 * @author kkanaparthi
 * 
 * This class finds the First Non Repeated
 * Character.
 * Initially a new Array is built to calculate
 * all the character counts.
 *
 */
public class FirstNonRepeatedCharacter {

	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] getArrayWithCounts(String input) {
		int [] charCountArray = new int[26];
		for(int i=0;i<input.length();i++) {
			charCountArray[input.charAt(i)-'a']++;
		}
		return charCountArray;
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	private char firstNonRepeatedChar(String input) {
		char elem = ' ';
		if(input!=null && input.length()>0) {
		int [] arrayWithCharCounts = getArrayWithCounts(input);
		for(int i=0;i<input.length();i++)  {
			System.out.println("input.charAt(i) "+input.charAt(i)+
					" arrayWithCharCounts[input.charAt(i)] "+
					arrayWithCharCounts[input.charAt(i)-'a']);
			if(arrayWithCharCounts[input.charAt(i)-'a']==1) {
				return input.charAt(i);
			}
		}
		}
		return elem;
	}
	
	
	 public static boolean canPermutePalindrome(String s) {
	        if(s==null||s.length()<2) {
	            return true;
	        }
	        int[] isPalindrome = new int[128];
	        for(int i=0;i<s.length();i++) {
	            isPalindrome[s.charAt(i)]++;
	        }
	        int countOdd = 0;
	        for(int countValue : isPalindrome) {
	        	if(countValue%2==1) {
	        		countOdd++;
	        	}
	        }
	        System.out.println(" countOdd "+countOdd);
	        return countOdd<=1;
	    }
	
	
	public static void main(String a[]) {
		FirstNonRepeatedCharacter firstNonRepeatedCharacter = 
				new FirstNonRepeatedCharacter();
		char c = firstNonRepeatedCharacter.
				firstNonRepeatedChar
				("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(" First Non Repeated Character "+ c);
		
		char nonRepPractice = firstNotRepeatingCharacter("abacc");
		
		System.out.println(" nonRepPractice "+ nonRepPractice);
		boolean canPermutate = canPermutePalindrome("abaaa");
		System.out.println(" Can permutate "+ canPermutate);
		String longestPalindrome = longestPalindromeSubString("abb");
		System.out.println(" longestPalindrome "+longestPalindrome);
		int reverse = reverseInteger(-23213424);
		System.out.println(" Reverse Integer "+reverse);
	}


	private static int reverseInteger(int number) {
		int reverse = 0;
		while(number!=0) {
			int temp = reverse*10+(number%10);
			if(temp/10!=reverse) {
				return 0;
			}
			reverse = temp;
			number /= 10;
		}
		return reverse;
	}
	private static String longestPalindromeSubString(String data) {
		String respone = null;
		if(data==null||data.length()<2) {
			return respone;
		}
		int length = data.length();
		int left = 0;
		int right = 0;
		boolean[][] isPalindrome = new boolean[length][length];
		for(int j=1;j<length;j++) {
			for(int i=0;i<j;i++) {
				boolean isInnerPalindrome = isPalindrome[i+1][j-1]||j-i<=2;
				isPalindrome[i][j] = true;
				if(isInnerPalindrome && data.charAt(i)==data.charAt(j)) {
					if(j-i>right-left) {
						right = j;
						left = i;
					}
				}
			}
		}
		return data.substring(left,right+1);
	}
	
	/**
	 * 
	 * @param s
	 * @return
	 */
    private static char firstNotRepeatingCharacter(String s) {
        char[] validationArray = new char[128];
        char returnValue  = ' ';
        if(!s.isEmpty()) {
            for(int i=0;i<s.length();i++) {
                validationArray[s.charAt(i)]++;
            }
        }
        for(int i=0;i<s.length();i++) {
            if(validationArray[s.charAt(i)]==1) {
                return s.charAt(i);
            }
        }
       return returnValue;   
    } 
    
    
    /**
     * 
     * @param input
     * @return
     */
	private int[] getCharCountArrayA(String input) {
		int [] resultArray = new int[128];
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				resultArray[input.charAt(i)]++;
			}
		}
		return resultArray;
	}
	
	
}



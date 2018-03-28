/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class StringReverse {

	/**
	 * 
	 */
	public StringReverse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String original = "HELLO-dfagfgffasdfdddddsafsfdsafasdfsdfadsfdsafasdfasdfsadfasdfasdfasdfsdfasdfsadfsadfasdfasdfasdfsadfasdfdsfasffqwfqrweqrqwefuwuigfuigiuegfuigeuifgiuewgfiugwuiegfiugwiufgiuwgfiuwgiufgqwiugfiugw	iufgwiuegfiuwgeiufgeiugfiuwegiufgwiuegfiuwegfiugwiufgiuwegfiuwebjhbjoudiqu	bdouybduoywbdouybwuydboweybdowebdyuwebfyubewyufebuyewbyuebcyubyuwebcuybuybuywuybcbebeuybcwuyebcuywbbuyycebuycbuybewycewbyucbyeuwyewyeyewcwcbcwebbbycbcbbcbbcbcbbucybwyucbuywbeyuebcuywcbyuwybeyuewyuwbecuyweyucyuwbcyubywbcyuweyucwbuycbcuybcyubcuybwyubcwuybcuywebcuyebcyuwbuybcuybewuybecybweyubcuywebuybcweuycbuycweuybuycbuyyebcyeycbuybuyuysuqsiuyg	yuqs	qgiyts	qtywdty	tydqwtd	qwdt	qfd	vd	qwdb	quydb	qydv	qyvdq	ggvdq	gwvd	qidv	wvdi	wdhgwqvdghwevdghi	vd	wgdhv	wghidvq	higdv	dvghi	qvdigqvdighqvdghqvwdgh	qvdgh	qdwvqihgwvdiqhgwvdihgq	dv	wgvdqghwivdighv	dhigqvwdihg	vqghwdvq	ghdv	hgqvghidqhlkminubuyoeyybwq	b	ueq	v	qogve	qqvq	odqv	hfhjf	hooqwnjwnqpknf	 fhu	fh	qbefhjbwqhjovfhj	qvjwvjwfhjqfv	jhqfv	gqyfqgh	goyu	q	wvwoqdqwvoufyvfqovyfoyfy	ffhvh	qvfhvfehjvfqhjvqfwfhvhwfh2q	ouyu3uyyhbhuewfuewbfhfbhjlwebhljbflhjBLHJBHJBHLJFBlhjfbaljhFBalhjblhjbclhjbHJLBCHJLBChjlsbcljhbclAHJBclhjbcljhbchjlsbchjlbHJLLBCHJbchjlSBCJLHasbcjlhaBSCJLHbchjlbashjlChjbshJLBCSjhcsvaCLJHBweuybueywbiubueuwnkjcbyuewbuh  uyd j chuYUCwuc uheuywejhw eudwewu uweu  w uuweue fwuu uweu ce uc uc  cw c   c we  e e ew ew e e ";
		System.out.println("Original String is  "+ original);
		StringReverse reverse = new StringReverse();
		String reverseString  = StringReverse.reverseString(original);
		System.out.println("The Response String is  "+ reverseString);
		
		reverseStringOne("TestNewLogic");
		
		System.exit(1);
		
		reverse.factorial(5);
		reverse.factorialRecursion(6);

		reverse.printFizBuzz(30);
		reverse  = null;
		System.out.println("The Reverse of the String is  "+  reverse.reverseString(original));
		
	     	Integer i1 = 127;
	     
	        Integer i2 = 127;
	 
	        System.out.println(i1 == i2);
	 
	        Integer i3 = 128;
	 
	        Integer i4 = 128;
	 
	        System.out.println(i3 == i4);
	        
	}

//	public String reverseString(String input) {
//		
//		reverseString(input);
//		
////		return new StringBuffer(input).reverse().toString();
//	}
	private int factorial(int n) {
		int fact = 1;
		for(int i=n;i>0;i--) {
//			if(n<=1) {
//				System.out.println(n);
//			} else  {
//				
//			}
	//		System.out.println("BEFORE n value is  "+fact);
			
			fact  = (fact)*(i);
			System.out.println("n value is  "+fact+" i is "+i);
		}
		System.out.println("Factorial is "+ fact);
		return n;
	}

	private int factorialRecursion(int n) {
		
		System.out.println("user entered n value is "+n);
		int result;
		if(n==0 || n==1) {
			System.out.println("n value become as "+n);
			return 1;
		}
		result = n * factorialRecursion(n-1);
		
		System.out.println("Factorial  Using Recursion is "+ result+"  n  "+n);

		return result;
		
	}

	
	
	private void printFizBuzz(int  n) {
		for(int i=0;i<n;i++) {
			
			if(i%3==0) {
				System.out.println("fiz");
			}
			if(i%5==0) {
				System.out.println("buzz");
			}
			if(i%15==0) {
				System.out.println("fizbuzz");
			}
			System.out.println(i);
		}
	}
	
	private static String reverseString(String inString) {
		if(inString==null || inString.length()<=0) {
			return inString;
		}
		System.out.println(" inString.charAt(0) Value at each Step is "
				+ inString.charAt(0)
		+" Also inString.substring(1)  "+inString.substring(1) +" inString "+inString);
		String eachStep = reverseString(inString.substring(1))+inString.charAt(0);
		System.out.println("At Each Step  "+eachStep);
		return eachStep;
	}
	
	private static String reverseStringOne(String inString) {
		if(inString==null || inString.length()==0) {
			return inString;
		} else {
			String reverseString = reverseStringOne(inString.substring(1))+inString.charAt(0);
			System.out.println("reverseStringOne Response "+reverseString);
			return reverseString;
		}
	}
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	 private static final Scanner scan = new Scanner(System.in);
	    
	    public static void main(String args[]) throws Exception {
//	        // read the string filename
//	        String filename;
//	        filename = scan.nextLine();
//	        
//		    String data = "burger.letters.com - - [01/Jul/1995:00:00:12 -0400] \"GET /shuttle/countdown/video/livevideo.gif HTTP/1.0\" 200 0";	
//	    	Map<String,List<String>> response = 
//	    			eligibleInputData(data);
//	    	System.out.println(" Response is "+response);
	    	int response = 
	    			myAtoi("   -42");
	    	System.out.println(" Response is "+response);
	    }

	    private static Map<String,List<String>> eligibleInputData(String data) {
            if(data==null||data.length()==0) {
                return null;
            }
            
            int a = 1/0;
            Map<String,List<String>> dataOutput = new HashMap<>();
            String[] parsedData = data.split("- -");
            String fileName = null;
            if(parsedData!=null||parsedData.length>2) {
                String requestType = 
                    parsedData[1].substring(parsedData[1].indexOf('"'),parsedData[1].lastIndexOf('"'));
                System.out.println(" requestType contains GET "+
                    requestType.contains("GET")+"  requestType "+requestType);
                String statusCode = 
                    parsedData[1].substring(parsedData[1].lastIndexOf('"')).split("\\s+")[1];
                String[] imagesTag = requestType.split("\\s+")[1].split("/");
                String isGiffile =  imagesTag[imagesTag.length-1];
                    System.out.println(" statusCode "+statusCode+" requestType "+
                requestType+" isGiffile "+isGiffile);
                fileName = "gifs_"+parsedData[0];
              //  dataOutput.add(fileName);
                if(dataOutput.containsKey(fileName)) {
                    List<String> innerListExisting =  dataOutput.get(fileName);
                    innerListExisting.add(isGiffile);
                    dataOutput.put(fileName,innerListExisting);
                } else {
                    List<String> innerList = new ArrayList<>();
                    innerList.add(isGiffile);
                    dataOutput.put(fileName,innerList);
                }
            }
            return dataOutput;
    }
	    
	    
	    public static int myAtoi(String str) {
	        if(str==null||str.length()==0||str.trim().length()==0) {
	            return 0;
	        }
	        String trimmedData = str.trim();
	        boolean isNegativeNumber = false;
	        String data = null;
	        if(trimmedData.charAt(0)=='-') {
	            isNegativeNumber = true;
	            if(trimmedData.length()>1) {
	                data = trimmedData.substring(1);
	            } else {
	                return 0;
	            }
	        } else if(trimmedData.charAt(0)=='+') {
	            data = trimmedData.substring(1);
	            if(trimmedData.length()>1) {
	                data = trimmedData.substring(1);
	            } 
	        } 
	        int number = 0;
	        if(data!=null && !data.isEmpty()) {
		        for(char element : data.toCharArray()) {
		            if(element<'0'||element>'9') {
		                return 0;
		            }
		            int temp = element-'0';
		            number = number*10+temp;
		            System.out.println(" Number before conversion is "+number);
		        }
	        }
	        if(isNegativeNumber) {
	            return -1*number;
	        }
	        return number;
	    }
}
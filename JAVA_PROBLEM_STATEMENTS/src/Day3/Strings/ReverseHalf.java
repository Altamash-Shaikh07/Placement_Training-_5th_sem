package Day3.Strings;

public class ReverseHalf {
    
    public static String reverseFirstHalf(String str) {
        int len = str.length();
        int halfLen = len / 2;
        String firstHalf = str.substring(0, halfLen);
        String secondHalf = str.substring(halfLen);
        
        String reversedFirstHalf = new StringBuilder(firstHalf).reverse().toString();
        
        return reversedFirstHalf + secondHalf;
    }

    public static void main(String[] args) {
        String str = "Harshvandhan";
        String result = reverseFirstHalf(str);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + result);
    }
}

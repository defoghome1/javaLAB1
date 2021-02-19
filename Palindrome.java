public class Palindrome {
	public static void main(String[]args) {
		for (int i=0;i<args.length;i++) {
			String s = args[i];
			if(isPalindrome(s)) 
				System.out.println(s+" palindrom");
			else 
				System.out.println(s+" ne palindrom");
		}
				
	}
	public static String reverseString(String s){
		String r="";
		for(int i=(s.length()-1);i>=0;i--)
			r += s.charAt(i);
		return r;
	}
	public static boolean isPalindrome(String s) {
		String r = reverseString(s);
		if(s.equals(r))
			return true;
		else
			return false;
	}
}
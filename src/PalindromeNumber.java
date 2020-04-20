
public class PalindromeNumber {
	
	public static void main(String args[]) {
		
		int palindrome = 5556555;
		
		System.out.println(isPalindrome(palindrome));
	}
	
	public static boolean isPalindrome(int x) {
		boolean aPalindrome = false;
		
		if(x < 0 || x == Integer.MAX_VALUE) {
			return aPalindrome;
		}
		
		int len = String.valueOf(x).length();
		String str = new String();
		String num = String.valueOf(x);
		
		if(len == 1) {
			aPalindrome = true;
		}
		
		for(int y = len - 1; y >= 0; y--) {
			str = str + num.charAt(y);
		}
		
		if(x == Integer.valueOf(str)) {
			aPalindrome = true;
		}
		
		return aPalindrome;
	}

}

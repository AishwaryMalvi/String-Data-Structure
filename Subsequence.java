package String;

public class Subsequence {
	
	public static boolean issubsequence(String str,String subseq) {
		int i=0,j=0;
		while(i<str.length()&&j<subseq.length()) {
			if(str.charAt(i) == subseq.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == subseq.length();
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(issubsequence("abcde","ace"));
	}

}

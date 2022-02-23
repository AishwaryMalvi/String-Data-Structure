package String;

import java.util.Set;

public class RemoveVowels {

	public static String removeVowels(String str) {
		Set <Character> vowels = 	Set.of('a', 'e', 'i', 'o', 'u');
		StringBuilder sb =new StringBuilder();
		char [] chararray = str.toCharArray();
		for(char ch: chararray) {
			if(!vowels.contains(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(removeVowels("aishwary malvi"));
	}

}

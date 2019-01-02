package program;

public class Stringues {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.replace('a', 'x');
		String s06 = original.replace("abc", "xy");
		String[] vect = original.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println(s01);
		System.out.println(s02);
		System.out.println(s03);
		System.out.println(s04);
		System.out.println(s05);
		System.out.println(s06);
		System.out.println(i);
		System.out.println(j);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
		

	}

}

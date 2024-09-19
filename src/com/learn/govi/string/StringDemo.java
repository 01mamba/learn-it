package com.learn.govi.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("=========String methods ==============");
		String s = " hello ";
		System.out.println("s.length()  :"+s.length());
		System.out.println("s.contains(\"he\")  "+s.contains("he"));
		System.out.println("s.isEmpty()  "+s.isEmpty());
		System.out.println("s.toUpperCase() "+s.toUpperCase());
		System.out.println("s.startsWith(\"h\"):  "+s.startsWith("h"));
		System.out.println("s.endsWith(\"\") "+s.endsWith(""));
		System.out.println("s.replace(\"ll\",\"LL\") "+s.replace("ll","LL"));
		System.out.println("s.trim()  "+s.trim());
		System.out.println("s.strip() "+s.strip());
		
		System.out.println("s.substring(0,3)"+s.substring(0,3));
		System.out.println("Arrays.toString(s.getBytes()): "+Arrays.toString(s.getBytes()));
		System.out.println("Arrays.toString(s.toCharArray()): "+Arrays.toString(s.toCharArray()));
		System.out.println("s.charAt(1): "+s.charAt(1));
		System.out.println("Arrays.toString(s.split(\"e\")): "+Arrays.toString(s.split("e")));
		System.out.println(s);
		
		
		
		System.out.println();
		System.out.println("=======String comparision================");
		System.out.println();
		
		
		String s2 = " hello ";
		System.out.println("s==s2: "+(s==s2));

		
		String s3 = new String(" hello ");
		System.out.println("s2==s3: "+(s2 == s3));
		System.out.println("s.equals(s3) "+s.equals(s3));
		
		System.out.println("s==s3.intern(): "+(s==s3.intern()));
		
		String firstName = "Govi";
		String firstName1 = "govi";
		System.out.println("firstName.equals(firstName1): "+(firstName.equals(firstName1)));
		System.out.println("firstName.equalsIgnoreCase(firstName1): "+(firstName.equalsIgnoreCase(firstName1)));
		
		
		System.out.println();
		System.out.println("My favourite book is \"The one thing\" by Gary Keller");
		System.out.println("Path to source code: D:\\Java\\sources");
		
		/**
		 * \t - tab
		 * \b - backspace
		 * \n - new line 
		 * \r carriage return 
		 * \' single quote 
		 * \" double quote
		 * \\ backslash
		 * \f form feed 
		 */
		
		System.out.println("this is \n new line ");

		System.out.println("tab\t space");
		System.out.println("carriage \r return, single quote \' double quote \" backslash \\  formfeed \f");
		
		String formattedone = "Hello %s! you have a %s!";
		String morning = "good morning";
		String formattedString = String.format(formattedone, firstName,morning);
		System.out.println(formattedString);
		
		
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random text that cotnains gmail addresses "+	"like this some-email@gmail.com. And some other random text.";
		
		Matcher m = p.matcher(sampleText);
		m.find();
		String gmailAddress = m.group();
		System.out.println(gmailAddress);
		
		String sampleText2 = "There are threee sentences in this string. Are you sure? Yes!";
		String[] sentences = sampleText2.split("[\\.?!]");
		System.out.println(Arrays.toString(sentences));
	}

}

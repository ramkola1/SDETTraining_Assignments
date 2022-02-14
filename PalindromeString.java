package JavaAssignment3;

import java.util.Arrays;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="trurt";
		char[] ch=str.toCharArray();
		int strlength=ch.length;
		char[] ch2=new char[strlength];
		int j=0;
		for(int i=strlength-1;i>=0;i--) {
			ch2[j]=ch[i];
			j++;
		}
		String str2 = String.valueOf(Arrays.copyOf(ch2, ch2.length));
		System.out.println(str);
		System.out.println(str2);
		if(str2.equals(str))
			System.out.println("Given String "+str+" is Palindrome");
		else
			System.out.println("Given String "+str+" is NOT Palindrome");
		
	}

}

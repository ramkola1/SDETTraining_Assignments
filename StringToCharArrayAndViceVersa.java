package JavaAssignment3;

import java.util.Arrays;

public class StringToCharArrayAndViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCD";
		char[] ch=str.toCharArray(); ///Changed String to Char Array
		int strlength=ch.length;
		System.out.println("Converting String to CharArray:");
		for(int i=0;i<strlength;i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//Reversing the string
		char[] ch2=new char[strlength];
		int j=0;
		for(int i=strlength-1;i>=0;i--) {
			ch2[j]=ch[i];
			j++;
		}
		String str2 = String.valueOf(Arrays.copyOf(ch2, ch2.length)); //Converting Char Array to String
		System.out.println("Converting CharArray to String:");
		System.out.println(str2);
	}

}

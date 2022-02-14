package JavaAssignment3;

import java.util.Arrays;

public class EachCharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="DevLabs Alliance Training";
		int index=0;
		char[] ch=str.toCharArray();
		System.out.println("Original String:");
		for (int x=0; x<ch.length;x++) {
			System.out.print(ch[x]);
		}
		System.out.println();
		int cnt=0;
		int j=0;
		for(int i=0; i<ch.length;i++) {			
			for(j=0;j<i;j++) {
				if (ch[i]==ch[j])
					break;				
			}
			if (j==i)
				ch[index++]=ch[i];
						
		}
		char[] ch1=Arrays.copyOf(ch, index);
		System.out.println("String after Duplicates Removal:");
		for (int x=0; x<ch1.length;x++) {
			System.out.print(ch1[x]);
		}
		System.out.println();
		for(int i=0; i<ch1.length;i++) {				
			for(j=0;j<str.length();j++) {
				char b=str.charAt(j);
				if (ch1[i]==b)
					cnt++;
			}
			System.out.println("Number of Occurence of "+ch1[i]+" is: "+cnt);	
			cnt=0;
		}
	}

}

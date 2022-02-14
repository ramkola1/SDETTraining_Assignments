package JavaAssignment3;

public class SubStringExistsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A brown fox ran away fast";
		String str2 = "brown";
		if(str.contains(str2))
			System.out.println("Given String '"+str+"' has '"+str2+"' string");
		else
			System.out.println("Given String '"+str+"' doesn't have '"+str2+"' string");
	}

}

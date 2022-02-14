package JavaAssignment3;

public class ThrowsArithmeticException {

	public void myMethod() throws ArithmeticException
	{
		int x = 2/0;
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsArithmeticException obj=new ThrowsArithmeticException();
		try {
		    obj.myMethod();
		  }
		  catch (ArithmeticException e) {
			  System.out.println("This method Throws Arithmetic Exception");
		  }
	}

}

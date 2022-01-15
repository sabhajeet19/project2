package pkg;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		int data = 100/0;
		System.out.println(data);
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
			System.out.println("Exception handled");
			
		}
		finally {
			System.out.println("Test case passed");
		}
		
			
		//}
		//String a = null;
		//System.out.println(a.charAt(1));

	}

}

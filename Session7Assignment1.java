
public class Session7Assignment1 {

	public static void main(String[] args) {
		int array[]={20,50,40,10,30};

	      try {
	         for(int i =7;i >=0; i--) {
	            System.out.println
	            ("The value of array is" +array[i]);
	         }
	      }
	      catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Array is out of Bounds"+e);
	      }
	      catch (ArithmeticException e) {
	         System.out.println ("Can't divide by Zero"+e);
	      }

	}

}

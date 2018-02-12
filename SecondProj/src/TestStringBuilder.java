/**
 * 
 */

/**
 * @author User
 *
 */
public class TestStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder (args[0]);
		String constant = "Studying";
		System.out.println("Given String:" + sb + "with length :" + sb.length());
		System.out.println("First three:" + sb.substring(0,3));
		System.out.println("Given String:" + sb.substring((sb.length()-3)));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print Studying:" + sb.substring(startOfConstant,endOfConstant));
		
		
		
		
	}

}

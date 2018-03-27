public class Calculate{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		char mathop =  arg[2].charAt(0);
		int dec = 43;
		char asc = (char) dec;
		System.out.println("ASCII; " + asc);
		System.out.println("first = " + first);
		System.out.println("second = " + second);
		System.out.println("mathop2 = " + arg[2]);
		System.out.println("mathop = " + mathop);
		
		
		int res = (int) first + (char) asc + (int) second;
		System.out.println("Res = " + res);
	}
}
import static java.lang.Math.*;
public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate...");
		if (args.length == 2) {
			// convertt string to numbers:
			float a = (Float.valueOf(args[0])).floatValue();
			float b = (Float.valueOf(args[1])).floatValue();
		
			// do some arithmetic:
			System.out.println("a + b = " + (a + b));
			System.out.println("a - b = " + (a - b));
			System.out.println("a * b = " + (a * b));
			System.out.println("a / b = " + (a / b));
			System.out.println("a % b = " + (a % b));
			
			//incriment dicriment
			int i = Integer.valueOf(args[0]);
			int j = Integer.valueOf(args[1]);
			i = i++ + ((i > 2)? i++: (i++ * i++)) + i++;
			System.out.println("i++ + ((i > 2)? i++: (i++ * i++)) + i++ = " + i);
			j = ((j > 2)? j++: (j++ * j++));
			System.out.println("((j > 2)? j++: (j++ * j++)) = " + j);
			
			int res = i++ + ++j;
			System.out.println("i++ + ++j = " + res);
			res = --i - j--;
			System.out.println("--i - j-- = " + res);
			res = ++i + j++;
			System.out.println("++i + j++ = " + res);
			res = i-- - --j;
			System.out.println("i-- - --j = " + res);
			
		} else if (args.length == 1){
			float a = (Float.valueOf(args[0])).floatValue();
			System.out.println("sqrt(a) = " + sqrt(a));
			System.out.println("pow(a,10) = " + pow(a,10));
			System.out.println("sin(PI/2) = " + sin(PI/2));
			System.out.println("cos(PI) = " + cos(PI));
			System.out.println("tan(a) = " + tan(a));
			System.out.println("log(a) = " + log(a));
			System.out.println("exp(a) = " + exp(a));
			System.out.println("round(E) = " + round(E));
			System.out.println("nop");
		} 
		else {
			System.out.println("This program " +
				"requires two command-line arguments.");
		}		
	}
}
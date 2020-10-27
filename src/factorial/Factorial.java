/**
 * 
 */
package factorial;

/**
 * @author mikael
 *
 */
public class Factorial {
	public static double factorial(Integer n) {
		double result = 1;
		if(n != 0) {
			result = n * factorial(n - 1);
		}
		return result;
	}
}

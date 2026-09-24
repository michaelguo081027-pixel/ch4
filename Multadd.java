public class Multadd{
	public static double multadd(double a, double b, double c){
		double result = a * b + c;
		return result;
	}
	
	public static double expSum(double x){
		return multadd(x, Math.exp(-x), Math.sqrt(1 - Math.exp(-x)));
	}
	
	public static void main(String[] args){
		// a=1.0, b=2.0, c=3.0: 1.0 * 2.0 + 3.0
		System.out.println(multadd(1.0, 2.0, 3.0));
		// a=cos(pi/4), b=1/2, c=sin(pi/4): sin(pi/4) + cos(pi/4)/2
		System.out.println(multadd(Math.cos(Math.PI/4), 0.5, Math.sin(Math.PI/4)));
		// a=1.0, b=log 10, c=log 20: log 10 + log 20
		System.out.println(multadd(1.0, Math.log(10), Math.log(20)));
		// try any float number for x
		System.out.println(expSum());
	}
}

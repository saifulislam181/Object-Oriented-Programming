package lecture5;

public class TestException1
{
	public static void main (String args[]) {
		int a = -10;
		float b = 0.0f;
		try {
            float c = a/b; // ArithmeticException: / by zero
            System.out.println(c);
            System.out.println(Float.POSITIVE_INFINITY);
        } finally {
            System.out.println("gfgf");
        }
        System.out.println(a);
		System.out.println(b);
		//System.out.println(c);
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}	

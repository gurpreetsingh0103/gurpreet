package assignment2;

public class Calculation {

	public int sum(int a, int b) 
	{
		int s;
		s=a+b;
		System.out.println("sum result\t"+s);
		return s;
		
	}
	
	public int sub(int a1, int b1)
	{
		int s;
		s=a1-b1;
		System.out.println("sub result\t"+s);
		return s;
	}
	
	public int mult(int a2, int b2)
	{
		int s;
		s=a2*b2;
		System.out.println("mult result\t"+s);
		return s;
	}
	
	public void div(int a3,int b3)
	{
		int s;
		s=a3/b3;
		System.out.println("(((((10+2)+2)-2)*2)/2)=\t"+s);
		
	}
	
	public static void main(String[] args) {
		
		
		Calculation calc=new Calculation();
		int sum_result= calc.sum(10,2);
		int sum_result1= calc.sum(sum_result, 2);
		int sub_result=calc.sub(sum_result1, 2);
		int mult_result=calc.mult(sub_result, 2);
	    calc.div(mult_result, 2);
		
		
		
	}
}

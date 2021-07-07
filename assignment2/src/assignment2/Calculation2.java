package assignment2;

public class Calculation2 {

	public int div(int a, int b)
	{
		int s;
		s=a/b;
		System.out.println("division result\t"+s);
		return s;
	}
	
	public int sub(int a1, int b1)
	{
		int s;
		s=a1-b1;
		System.out.println("sub result\t"+s);
		return s;
	}
	
	public int add(int a2, int b2)
	{
		int s;
		s=a2+b2;
		System.out.println("addition result\t"+s);
		return s;
	}
	
	public void mult(int a3, int b3)
	{
		int s;
		s=a3*b3;
		System.out.println("(((((10/2)-2)-2)+2)*2)=\t"+s);
		
	}
	
	public static void main(String[] args) {
		
		Calculation2 calc=new Calculation2();
		int div_result=calc.div(10, 2);
		int sub_result=calc.sub(div_result, 2);
		int sub_result1=calc.sub(sub_result, 2);		
		int add_result=calc.add(sub_result1, 2);
		calc.mult(add_result, 2);
	}
	
}

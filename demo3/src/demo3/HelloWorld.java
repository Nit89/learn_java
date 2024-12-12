package demo3;


class calculator{
	public int sum(int num1 ,int num2) {
		return num1+num2;
	}
	public int sum(int num1 ,int num2,int num3) //method overloading
	{
		return num1+num2+num3;
	}
	
}

public class HelloWorld {
  public static void main(String[] args) {
	calculator cl = new calculator();
	int result = cl.sum(4, 4);
	System.out.println(result);
}
}
 
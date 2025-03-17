import java.util.Scanner;

class calculation {
	
	int length, breadth;
	boolean flag;
	
	void setValues(int p, int q)
	{
		length=p;
		breadth=q;
	}
	
	void showArea()
	{
		System.out.println(length*breadth);
	}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		calculation obj = new calculation();
		System.out.println("Enter 2 numbers");
		int a= s.nextInt();
		int b= s.nextInt();
		obj.setValues(a, b);
		obj.showArea();
	
	
	
}
}
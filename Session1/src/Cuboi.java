class Cuboid1
{
	int l,b,h;
	Cuboid1()
	{
		l=1;
		b=3;
		h=6;
	}
	Cuboid1(int x)
	{
		l=x;
		b=x;
		h=x;
	}
	Cuboid1(int x,int y,int z)
	{
		l=x;
		b=y;
		h=z;
	}
	int Volume()
	{
		return l*b*h;
	}
	
}

public class Cuboi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid1 c=new Cuboid1();
		System.out.println(c.Volume());
		Cuboid1 c1=new Cuboid1(2);
		Cuboid1 c2=new Cuboid1(2,5,7);
		System.out.println(c1.Volume());
		System.out.println(c2.Volume());
		
	}

}

package ·ÖÊý;
import java.util.Scanner;
class Fraction {
	private int a;
	private int b;
	public Fraction(int a,int b)
	{
		for(int i=2;i<b;i++)
			{
				if(a%i==0&b%i==0)
				{
					a/=i;
					b/=i;
				}
			}
		this.a=a;
		this.b=b;
//		simp(this.a,this.b);
	}
	public double toDouble()
	{
		double b=0.0;
		b=(double)a/b;
		return b;
	}
	public Fraction plus(Fraction r)
	{
		int x=a*r.b+r.a*b;
		int y=b*r.b;
		return new Fraction(x,y);		
	}
	public Fraction multiply(Fraction r)
	{
		return new Fraction(a*r.a,b*r.b);
	}
	public void print()
	{
		if(a%b==0)
			System.out.println(a/b);
		else 
			System.out.println(a+"/"+b);
	}
//	public void simp(this.a,this.b)
//	{
//		for(int i=2;i<b;i++)
//		{
//			if(a%i==0&b%i==0)
//			{
//				this.a/=i;
//				this.b/=i;
//			}
//		}
//	}
}


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
package 素数和;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int i=1;
		int total=0;
		int n;
		int b=in.nextInt();
		int m=in.nextInt();
		int isPrime=1;
		for(n=2;i<=m;n++)
		{
		for(int x=2;x<n;x++)
			{if(n%x==0){
			isPrime=0;	
			break;}
			}
		if(isPrime==1)
			{
//			System.out.println(n+"是素数");
//			System.out.println(i);
			if(i>=b)
				total+=n;
			i++;
			}
		
		else if(isPrime==0)
//			System.out.println(n+"不是素数");
			isPrime=1;
		
		}
	System.out.println(total);
	}
}



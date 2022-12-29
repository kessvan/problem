package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class colEx1 {

	

	public static void main(String[] args)
	{
		ArrayList<colExa> ar=new ArrayList<colExa>();
		
		Scanner sc=new Scanner(System.in);
        
		System.out.println("Enter the number");
		
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Enter the cost");
			int co=sc.nextInt();
			System.out.println("Enter the name");
			String na=sc.next();
			System.out.println("Enter the intrest");
			int nam=sc.nextInt();
			
            colExa co1=new colExa(co,na,nam);
            
            ar.add(co1);

			
		}
		for(Object a:ar)
		{
			System.out.println(a);
		}
		
	}

}

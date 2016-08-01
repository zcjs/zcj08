package zcj;
/*
 *  (8分)判断101-200之间有多少个素数，并输出所有素数。	输出结果格式如下:	
 */

import org.omg.Messaging.SyncScopeHelper;

public class Testexam1 {
	public void tell(){
	int sum = 0;
	for(int i = 101; i < 201; i++)
	{
		boolean t = false;
		for(int j=2; j <= i; j++)
		{
			if(i%j == 0)//zc
			{
				if(i != j)
				{
					t = false;
					break;
				}
			}
			else
			{
				t = true;
			}
		}
		
		if(t)
		{
			sum= sum +1;
			//System.out.print(i+"\t");
		}
	}
	System.out.println("101到200之间的素数个数为：   "+sum +"分别是：   ");}
	
	public void  name() {
		int sum = 0;
		for(int i = 101; i < 201; i++)
		{
			boolean t = false;
			for(int j=2; j <= i; j++)
			{
				if(i%j == 0)//zc
				{
					if(i != j)
					{
						t = false;
						break;
					}
				}
				else
				{
					t = true;
				}
			}
			
			if(t)
			{
				sum= sum +1;
				System.out.print(i+"\t");
			}
		}
		//System.out.println(sum);
		
	}
public static void main(String[] args) {
	Testexam1 t = new Testexam1();
	t.tell();
	t.name();
}
}



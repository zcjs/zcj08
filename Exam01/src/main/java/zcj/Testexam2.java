package zcj;
/*
 * 	(8分)编程实现工资个人所得税计算程序：		
 */
import java.util.Scanner;

public class Testexam2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("请输入工资： ");
	int sal = scanner.nextInt();
	int sal1 = sal - 3500;
	if(sal1 <= 0)
	{
		System.out.println("所需要缴纳的税费为: 0");
	}
	else if(sal1>0 & sal1 <= 1500)
	{
		System.out.println("所需要缴纳的税费为: " + sal1*0.03);
	}
	else if(sal1>1500 & sal1 <= 4500)
	{
		System.out.println("所需要缴纳的税费为: " + (1500*0.03+(sal1-1500)*0.1));
	}
	else if(sal1>4500 & sal1<=9000)
	{
		System.out.println("所需要缴纳的税费为: " + (1500*0.03+3000*0.1)+(sal1-4500)*0.2);
	}
	else if(sal1>9000 & sal1<=35000)
	{
		System.out.println("所需要缴纳的税费为: " +((1500*0.03+3000*0.1+4500*0.2) + (sal1-9000)*0.25));
	}
	else if(sal1>35000 & sal1 <=55000)
	{
		System.out.println("所需要缴纳的税费为: " + ((1500*0.03+3000*0.1+4500*0.2+26000*0.25)+(sal1-35000)*0.3));
	}
	else if(sal1>55000 & sal1 <=80000)
	{
		System.out.println("所需要缴纳的税费为: " +((1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3)+(sal1-55000)*0.35));
	}
	else if(sal1>80000)
	{
		System.out.println("所需要缴纳的税费为: " +((1500*0.03+3000*0.1+4500*0.2+26000*0.25+20000*0.3+25000*0.35)+(sal1-80000)*0.45));
	}
}
}

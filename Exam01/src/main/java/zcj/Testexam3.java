package zcj;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Testexam3 {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	Scanner scan = new Scanner(System.in);
	System.out.println("输入日期：");
	String str = scan.nextLine();
	String[] s = str.split("-");
	if(s.length==3)
	{
		Date d1 = sdf.parse(s[0] + "-1-1");
		Date d2 = sdf.parse(str);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		int days = 0;
		while(c2.after(c1))
		{
			c1.add(Calendar.DATE,1);
			days++;
		}
		System.out.println(days+1);
	}
}
}

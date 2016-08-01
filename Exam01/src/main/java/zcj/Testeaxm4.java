package zcj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 * (8分)随机生成50个小于100的整数,放入List中,将List中的 数据除以10,
 * 以结果的整数值作为key放入Map中,得到如 {1=>[11,10,12],2=>[21,24,23]}的Map,
 * 再将Map中key对应的 数组进行排序(不允使用sort方法，需要自行编写排序方法), 
 * 得到如{1=>[10,11,12],2=>[21,23,24]}	
 * 输出的形式如下:	随机生成 50 个小于 100 的数,分别为:	xxx,xxxx,xxxx	
 * Map 中的数据为:	{1=>[11,10,12],2=>[21,24,23]}	
 * 排序后的 Map 为:	{1=>[10,11,12],2=>[21,23,24]}	
 */
public class Testeaxm4 {
public static void main(String[] args) {
	List<Integer> lists = null;
	lists = new ArrayList<Integer>();
	Random ran = new Random();
	for(int i=0; i<50; i++)
	{
		lists.add(ran.nextInt(100));
	}
	System.out.println(lists);
	Map<Integer,List<Integer>> map = new HashMap<Integer, List<Integer>>();
	List<Integer> list0 = new ArrayList<Integer>();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	List<Integer> list3 = new ArrayList<Integer>();
	List<Integer> list4 = new ArrayList<Integer>();
	List<Integer> list5 = new ArrayList<Integer>();
	List<Integer> list6 = new ArrayList<Integer>();
	List<Integer> list7 = new ArrayList<Integer>();
	List<Integer> list8 = new ArrayList<Integer>();
	List<Integer> list9 = new ArrayList<Integer>();
	for(int i =0; i < lists.size(); i++)
	{
		if(lists.get(i)/10 == 0)
		{
			list0.add(lists.get(i));
			
		}
		else if(lists.get(i)/10 == 1)
		{
			list1.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 2)
		{
			list2.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 3)
		{
			list3.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 4)
		{
			list4.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 5)
		{
			list5.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 6)
		{
			list6.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 7)
		{
			list7.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 8)
		{
			list8.add(lists.get(i));
		}
		else if(lists.get(i)/10 == 9)
		{
			list9.add(lists.get(i));
		}
	}
	System.out.println("----------------------------------------------------------------------------------------");
	//System.out.println(list2);
	map.put(0,list0);
	map.put(1,list1);
	map.put(2,list2);
	map.put(3,list3);
	map.put(4,list4);
	map.put(5,list5);
	map.put(6,list6);
	map.put(7,list7);
	map.put(8,list8);
	map.put(9,list9);
	System.out.println(map);
	Set<Integer> set = map.keySet();
	System.out.println("------------------------------------------------------------------------------------");
	Iterator<Integer> it = set.iterator();
	while(it.hasNext()){
		Integer li = it.next();
		List<Integer> ld = map.get(li);
		
	 for (int i = 0; i < ld.size()-1; i++) {
            for(int j = i+1; j<ld.size(); j++){
            	if(ld.get(j)<ld.get(i)){
    	        	int temp1=ld.get(i);
    	        	ld.set(i, ld.get(j));
    	        	ld.set(j, temp1);
                }
            }
        }
	 map.put(li, ld);
	
	}
	
	System.out.println(map);
	
}
}

package test;

import java.util.Date;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dto.AddressDto;
import dto.CustomerDto;
import serviceImpl.AddressImpl;
import serviceImpl.CustomerImpl;


public class CustomerTest {
	
	private static CustomerImpl customerImpl;
	private static AddressImpl addressImpl;
	
	
	public static void setUpBeforeClass() throws Exception {  
//			 Resource r = new FileSystemResource("appcon.xml");
//		        BeanFactory bf =new XmlBeanFactory(r);
		ApplicationContext bf= new ClassPathXmlApplicationContext("applicationContext.xml");
		customerImpl =(CustomerImpl) bf.getBean("customerService");  
		addressImpl=(AddressImpl) bf.getBean("addressService");
		
		
		
	}  
	public static AddressDto getAddress_a(int i){  
		AddressDto u = addressImpl.getAddress(i);  
		if(u != null){  
			System.out.println(u);  
		}
		return u;  
	}  
	public static void deleteCu(int i)
	{
		 customerImpl.deleteCustomer(i);
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        

		
		/*ApplicationContext ctx=null;
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService=(CustomerService) ctx.getBean("customerService");
		AddressService addressService=(AddressService) ctx.getBean("addressService");*/
//        
//        CustomerDto customerDto=new CustomerDto();
//        //添加数据
//        Scanner  sc1 = new Scanner(System.in);
//        String first_name = sc1.nextLine();
//        Scanner  sc2 = new Scanner(System.in);
//        String last_name = sc2.nextLine();
//        Scanner  sc3 = new Scanner(System.in);
//        String eamil_name = sc3.nextLine();
//        Scanner  sc4 = new Scanner(System.in);
//        String address_id = sc4.nextLine();
//       
//        
//        
//        
//        
//        customerDto.setStore_id(1);
//        customerDto.setFiest_name(first_name);
//        customerDto.setLast_name(last_name);
//        customerDto.setEmail(eamil_name);
//        customerDto.setAddress_id(2);
//       /* Date date=new Date();
//        DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time=format.format(date);*/
//        customerDto.setCreate_date(new Date());
//       
//        customerService.addCustomer(customerDto);
//        System.out.println("添加成功");
//        //查询数据
		try {
			setUpBeforeClass();
			testInsert();
			deleteuser();
			//outUser();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	 public static void testInsert() {  
         CustomerDto u = new CustomerDto();  
         
         u.setStore_id(1); 
         while(true){
         Scanner  sc = new Scanner(System.in);
         System.out.println("请输入first_name");
         String s = sc.nextLine();
         
         if(!(s.matches("[a-zA-Z]+"))){
         	System.out.println("请输入字符");
         }else{
         	u.setFiest_name(s);  
         	break;
         }
         	
         }
         
         while(true){
         Scanner  sc1 = new Scanner(System.in);
      	System.out.println("请输入last_name");
         String s1 = sc1.nextLine();
         if(!(s1.matches("[a-zA-Z]+"))){
         	System.out.println("请输入字符");
         }else{
         	u.setLast_name(s1);  
         	break;
         }
         
         }
         while(true){
         Scanner  sc2 = new Scanner(System.in);
         System.out.println("请输入email");
         String email = sc2.nextLine();
         if(!(email.matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")))
         {
         	System.out.println("邮箱格式为_@_.com");
         }
         else
         {
         	u.setEmail(email);
         	break;
         }
         }
         while(true){
	            Scanner  sc3 = new Scanner(System.in);
	            System.out.println("请输入address_id");
	            String s3 = sc3.nextLine();
	            int i = Integer.parseInt(s3);
	            AddressDto u1 = getAddress_a(i);

	            if(u1 == null){
	            	System.out.println("请输入存在的address_id");
	            }else{
	            	u.setAddress_id(i);
	            	break;
	            }
	            }
	            u.setCreate_date(new Date());
	            customerImpl.addCustomer(u);  
	        System.out.println("保存成功！");  
	        System.out.println("已保存的数据如下：");
	        System.out.println("ID:"+ u.getStore_id());
	        System.out.println("FirstName:" + u.getFiest_name());
	        System.out.println("LastName:" + u.getLast_name());
	        System.out.println("Email:" + u.getEmail());
	        AddressDto u1 = getAddress_a(u.getAddress_id());
	        System.out.println("Address:"+ u1.getAddress());
	    }
	 		public static void deleteuser(){
	 			
	 			Scanner  sc = new Scanner(System.in);
	 			System.out.println("请输入customer_id");
	 			String s  = sc.nextLine();
	 			int a = Integer.parseInt(s);
	 			deleteCu(a);
	 			System.out.println("删除成功");
	 		}
	
	 
         }

	 

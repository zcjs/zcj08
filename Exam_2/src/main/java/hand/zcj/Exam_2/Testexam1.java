package hand.zcj.Exam_2;
/*
 * 1使用程序从网上下载pdf,网址为 http://files.saas.hand-china.com/java/target.pdf,
	保存在本地, 编程时使用带缓冲的读写,将需要保证保存后的pdf文件能正常 打开.	
 */
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Testexam1 {
		 public static void main(String[] args) throws Exception {
			 InputStream in=new URL("http://files.saas.hand-china.com/java/target.pdf").openConnection().getInputStream();  
			 FileOutputStream f = new FileOutputStream("d:/pdf_2.pdf");//创建文件输出流
			 byte [] bb=new byte[1024];  //接收缓存
			 int len;
			 while( (len=in.read(bb))>0){ //接收
			   f.write(bb, 0, len);  //写入文件
			 }
			 f.close();
			 in.close();
		 }   
}

package hand.zcj.Exam_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
public static final String fileDir = "D:/";
	
	
	public static void main(String[] args) {
		
		String fileName = "pdf.pdf";
		String filePath = fileDir + fileName;
		System.out.println("send filePath = " + filePath);
		
		Socket socket = null;
		
		try {
			socket = new Socket(Server.IP, Server.PORT);
			if(socket != null){
				System.out.println("Connection succcessed !");
				
				sendFile(socket, filePath);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void sendFile(Socket socket, String filePath){
		DataOutputStream dos = null;
		BufferedInputStream bis = null; 

		byte[] bytes = new byte[1024];
		
		try {
			try {
				
				bis = new BufferedInputStream(new FileInputStream(new File(filePath)));
				dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
				
				
				//首先发送文件名     客户端发送使用writeUTF方法，服务器端应该使用readUTF方法
				dos.writeUTF(getFileName(filePath));
				
				//之后再发送文件的内容
				int length = 0;
				while((length = bis.read(bytes, 0, bytes.length)) > 0){
					dos.write(bytes, 0, length);
					dos.flush();
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				//使用完毕后，应关闭输入、输出流和socket
				if(bis != null) bis.close();
				if(dos != null) dos.close();
				if(socket != null) socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	private static String getFileName(String filePath){
		String[] parts = filePath.split("/");
		return parts[parts.length - 1];
	}

}

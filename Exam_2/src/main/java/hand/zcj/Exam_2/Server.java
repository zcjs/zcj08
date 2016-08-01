package hand.zcj.Exam_2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static final int PORT = 8880;				
	public static final String IP = "127.0.0.1"; 	

	public static void main(String[] args) {
		ServerSocket mServerSocket = null;
		Socket socket = null;
		try {
			//创建服务器端
			mServerSocket = new ServerSocket(PORT);
			System.out.println("Server is already created now ! Waiting for client to connect ...");

			//客户端连接服务器端	
			socket = mServerSocket.accept();
			System.out.println("One client connected to this server successfully !");

			//连接成功，开始传输文件
			receiveFile(socket);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void receiveFile(Socket socket) {

		FileOutputStream fos = null;
		DataInputStream dis = null;
		
		//buffer起缓冲作用，一次读取或写入多个字节的数据
		byte[] buffer = new byte[1024];

		try {
			try {
				//这里使用DataInputStream，可以调用它的readUTF方法来读取要传输的文件名，客户端使用writeUTF方法将文件名先传输过来
				dis = new DataInputStream(socket.getInputStream());
				
				//首先读取文件名
				String oldFileName = dis.readUTF();
				//文件路径采用与客户端相同的路径，文件名重新命名
				String filePath = Client.fileDir + genereateFileName(oldFileName);
				System.out.println("receive filePath = " + filePath);
				
				//利用FileOutputStream来操作文件输出流
				fos = new FileOutputStream(new File(filePath));
				
				int length = 0;
				
				
				while((length = dis.read(buffer, 0, buffer.length)) > 0){
					fos.write(buffer, 0, length);
					fos.flush();
				}
				
			} finally {
				//使用完毕后，应关闭输入、输出流和socket
				if(dis != null) dis.close();
				if(fos != null)	fos.close();
				if(socket != null) socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	private static String genereateFileName(String oldName){
		String newName = null;
		newName = oldName.substring(0, oldName.lastIndexOf(".")) + "-2" + oldName.substring(oldName.lastIndexOf("."));
		return newName;
	}
}

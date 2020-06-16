package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket ds=new DatagramSocket(10086);
		byte[] bys=new byte[1024];
		DatagramPacket dp=new DatagramPacket(bys,bys.length);
		ds.receive(dp);
		byte[] datas=dp.getData();
		String dateString=new String(datas);
		System.out.println("数据是："+dateString);
		ds.close();
	}

}

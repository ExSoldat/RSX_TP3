import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class SendUDP {
	private DatagramSocket s;
	
	public SendUDP(){}
	
	public SendUDP(DatagramSocket s) {
		this.s = s;
	}
	
	public void sendPacket(String m) {
		try {
			byte[] data = m.getBytes("UTF-8");
			DatagramPacket sendData = new DatagramPacket(data, data.length, s.getLocalAddress() ,s.getLocalPort());
			this.s.send(sendData);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//String testMessage = "Hello";
//byte[] data = testMessage.getBytes("UTF-8");
//DatagramPacket sendData = new DatagramPacket(data, data.length);
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ReceiveUDP {
	
	private DatagramSocket s;
	private InetAddress ad;
	private byte[] data = new byte[2048];

	public ReceiveUDP() {}
	
	public ReceiveUDP(DatagramSocket s) throws IOException {
		this.s = s;

	}
	public String receivePacket() {
		DatagramPacket p = new DatagramPacket(data, data.length);
		try {
			this.s.receive(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = new String(p.getData(), 0, p.getLength());
		return ("Message : " + s);
	}
}

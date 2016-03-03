import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket socket =  new DatagramSocket();
			ReceiveUDP rUDP = new ReceiveUDP(socket);
			SendUDP sUDP = new SendUDP(socket);
			sUDP.sendPacket("Bonjouuuur");
			System.out.println(rUDP.receivePacket());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

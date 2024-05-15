import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Client {

    public static void main(String[] args) throws Exception{
        
        DatagramSocket ds = new DatagramSocket();
        int i = 15;
        byte[] b = (i+"").getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b,b.length,ia,9999);//data,data length,ip address, port number
        //it accepts the data in byte array format
        //while sending the datagram packet we have to mention the port number and ip

        ds.send(dp); //data sent successfully
        //now check response from the server

        byte b1[] = new byte[1024];//to receive the info from server
        DatagramPacket dp1 = new DatagramPacket(b1,b1.length);//no need for other two parameters cause we are receiving
        ds.receive(dp1);

        String str = new String(dp1.getData());
        System.out.println("Result is " + str);

    }
}
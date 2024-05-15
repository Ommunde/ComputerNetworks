import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Server {
    public static void main(String[] args) throws Exception{
        
        ServerSocket ss = new ServerSocket(6666);
        //for connextion establishment
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = (String)dis.readUTF();
        System.out.println("Message is " + str);
        ss.close();
    }
}

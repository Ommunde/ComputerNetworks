import java.io.DataOutputStream;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) throws Exception{
        
        Socket s = new Socket("localhost", 6666);


        DataOutputStream dop = new DataOutputStream(s.getOutputStream());
        dop.writeUTF("Hello Server");
        dop.flush();
        s.close();
    }
}

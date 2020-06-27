import org.apache.xmlrpc.WebServer;

public class MyXmlRpcServer
{
     public static void main(String[] args)
     {
          MyXmlRpcHandler handler = new MyXmlRpcHandler();
     
          WebServer ws = new WebServer(Integer.parseInt(args[0]));
          
          ws.addHandler("MyXmlRpc", handler);
          
          ws.start();
     }
}

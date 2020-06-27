import org.apache.xmlrpc.XmlRpcClientLite;
import java.util.Vector;

public class MyXmlRpcClient
{
     public static void main(String[] args)throws Exception
     {
          String host = args[0];
          String port = args[1];
          String handler = "MyXmlRpc";
          
          Double X = new Double(Double.parseDouble(args[2]));
          String method = handler+"."+args[3];
          Double Y = new Double(Double.parseDouble(args[4]));
          
          String url = "http://"+host+":"+port+"/RPC2";
          
          XmlRpcClientLite client = new XmlRpcClientLite(url);
          
          Vector params = new Vector();
          params.add(X);
          params.add(Y);
          
          Double Z = (Double)client.execute(method, params);
          
          System.out.println(args[2] + " " + 
                             args[3] + " " + 
                             args[4] + " = " +
                             Z.doubleValue());
     }


} 
         

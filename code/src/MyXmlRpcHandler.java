import org.apache.xmlrpc.XmlRpcHandler;
import java.util.Vector;

public class MyXmlRpcHandler implements XmlRpcHandler
{
     Double Z;
     
     public Object execute(String method, Vector params)
     {
          Double X = (Double)params.elementAt(0);
          Double Y = (Double)params.elementAt(1);
          
          double x = X.doubleValue();
          double y = Y.doubleValue();
          
          if(method.equals("MyXmlRpc.add"))
          {
               Z = new Double(x+y);
          }
          else if(method.equals("MyXmlRpc.sub"))
          {
               Z = new Double(x-y);
          }
          else if(method.equals("MyXmlRpc.mult"))
          {
               Z = new Double(x*y);
          }
          else
          {
               Z = new Double(0);
          }
	  System.out.println(Z);
          return Z;
     }
}
               
               

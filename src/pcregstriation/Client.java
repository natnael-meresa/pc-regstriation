
package pcregstriation;
 import java.io.DataOutputStream;
 import java.io.ObjectInputStream;
 import java.net.Socket;


public class Client {
   Client(String alert){
  try {

     Socket socketConnection = new Socket("localhost", 9999);


     //QUERY PASSING
     
     DataOutputStream outToServer = new DataOutputStream(socketConnection.getOutputStream());
     String SQL= alert;
     outToServer.writeUTF(SQL);
     outToServer.flush();
    

  } catch (Exception e) {System.out.println(e); }
   }
}

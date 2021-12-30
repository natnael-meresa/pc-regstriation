
package pcregstriation;



import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Server extends JFrame{
	private JTextArea jta  = new JTextArea();
	public static void main(String[] args) {
		new Server();
	}
	public Server(){
		setLayout(new BorderLayout());
		add(new JScrollPane(jta),BorderLayout.CENTER);
		setTitle("Server");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		try{
			ServerSocket serverSocket = new ServerSocket(9999);
			jta.append("Server Started At " + new Date()+"\n");
			Socket socket = serverSocket.accept();
			DataInputStream inputFromClient = new DataInputStream(
				socket.getInputStream());
			DataOutputStream outputToclient = new DataOutputStream(socket.getOutputStream());
			while(true){
				String msg = inputFromClient.readUTF();
				StringTokenizer st = new StringTokenizer(msg ,"#"); 
                String name = st.nextToken(); 
                String last = st.nextToken();
                String id = st.nextToken();
                String serial = st.nextToken(); 
                 try{
                                                  File file = new File("since.txt");
                                                    PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
                                                    output.print(name+" ");
                                                    output.print(last+" ");
                                                    output.print(id+" ");
                                                    output.println(serial+" ");
                                                    output.close();
                                         }catch(Exception e){
                                             System.out.println(e);
                                         }
				jta.append("Alert suscsfuly inserted");

			}
		}
	catch(Exception ex){
				System.err.println(ex);
			}
		}
	}

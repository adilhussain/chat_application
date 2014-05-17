import java.io.*;
import java.net.*;

 public class SOCK_1_SERVER
 {
   //----------------------------------------
     public static void main(String[] args) throws Exception
      {
           SOCK_1_SERVER SERVER= new SOCK_1_SERVER();
		   SERVER.run();
	   }
	//----------------------------------------

    public void run() throws Exception
    {
        ServerSocket SERVSOCK = new ServerSocket(444);
		Socket SOCK = SERVSOCK.accept();
		InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
		BufferedReader BR = new BufferedReader(IR);
		
		String MESSAGE = BR.readLine();
		System.out.println(MESSAGE);
		
		if(MESSAGE!=null)
		 {
		    PrintStream PS = new PrintStream(SOCK.getOutputStream());
			PS.println(MESSAGE);
			PS.println("MESSAGE received");
		 }
	}
}
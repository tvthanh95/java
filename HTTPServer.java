import java.io.*;
import java.net.*;
import java.util.*;
public class myHTTPServer extends Thread
{
    static final String HTML_START = "<html>" +
       "<title>HTTP Server in Java</title>" +
       "<body>";
    static final String HTML_END = "</body>" + "</html>";
    Socket connectedClient = null;
    BufferedReader inFromClient = null;
    DataOutputStream outToClient = null;

    public myHTTPServer(Socket client)
    {
       connectedClient = client;
    }
    public void run()
    {
       System.out.println("The Client" + connectedClient.getInetAddress()
             + ": " + connectedClient.getPort() + "is connected");
       inFromClient = new BufferedReader(new InputStreamReader (connectedClient.getInputStram());
        outToClient = new DataOutputStream(connectedClient.getOutputStream());
        String requestString = inFromClient.readLine();
        String headerLine = requestString;

        StringTokenizer tokenizer = new StringTokenizer(headerLine);
        String httpMethod = tokenizer.nextToken();
        String httpQueryString = tokenizer.nextToken();

        StringBuffer responseBuffer = new StringBuffer();
        responseBuffer.append("<b> This is the HTTP Server Home Page...</b><BR>");
        responseBuffer.append("The HTTP Client request is ... <BR>");
        System.out.println("The HTTP request string is ...");
        while(inFromClient.ready())
        {
           responseBuffer.append(requestString + "<BR>");
           System.out.println(requestString);
           requestString = inFromClient.readLine();
        }
    }
}

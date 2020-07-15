package APItest.TermServerRestAPI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class Reader 
{
	HttpURLConnection conn;
   

	public Reader(HttpURLConnection connection)
	{
    	conn=connection;
	}
    
    public String read()
    {
    	try  
    	{  
    		InputStreamReader in = new InputStreamReader(conn.getInputStream());
    		BufferedReader br = new BufferedReader(in);

    		StringBuilder sb = new StringBuilder();
    		//String output = ""; //debug
    		String temp;
    		while ((temp = br.readLine()) != null) 
    		{
    			sb.append(temp).append("\n");
    			//output = output + temp; //debug
    		}
    		//System.out.println(output); //debug
    		return sb.toString();
    	}  
    	catch(IOException e)  
    	{  
    		e.printStackTrace();  
    	}
		return "";  
    }  

}

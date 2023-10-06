package genericlibrary;

import java.io.IOException;

public class DemoGenericLib
{
	public static void main(String[] args) throws IOException {
 FileLib f=new FileLib();
 String url = f.getPropertyData("url");
 String un = f.getPropertyData("username");
 String pwd = f.getPropertyData("password");
 System.out.println(url);
 System.out.println(un);
 System.out.println(pwd);
	}
 
 
 
	}



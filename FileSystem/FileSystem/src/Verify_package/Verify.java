package Verify_package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Verify {
	//private INode node;

	public static String verifyName(String name)
	{
		if (name == null || name.trim().isEmpty()) 
		{	System.out.println("Incorrect format of name");
			return null;
		}

	    Pattern p = Pattern.compile("[^A-Za-z0-9]");
	    Matcher m = p.matcher(name);
	    boolean b = m.find();
	    
	    if (b)
	    {
	    	System.out.println("There is a special character in name. Change name");
	    	return null;
	    }
		   
	    
	    if(name.length() < 12)
	    {	
	    	System.out.println("Name of Node is correct");
	    	return name;  
	    }
		else
		{	System.out.println("Name is too long");
			return null;
		}

			
		
	 }
}

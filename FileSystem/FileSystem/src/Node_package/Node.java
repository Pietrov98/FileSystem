package Node_package;

import java.util.ArrayList;
import java.util.List;

import Verify_package.Verify;

public abstract class Node implements INode{
	private String name;
	private INode parent;
	private static List<String> path = new ArrayList<String>();
	
	public void printPath()
	{
		INode helper = parent;
		if(helper != null)
		{
			path.add(helper.getName());
			helper = parent;
			helper.printPath();
		}
		else
		{
			//System.out.println(path.size());
			for(int i = path.size() - 1; i >= 0 ; i--)
			{
				System.out.print(path.get(i) + "\\");
			}
			path = new ArrayList<String>();
			System.out.println("");
		}
	}
	
	public String getName()
	{
		return this.name;
		
	}
	
	public void setName(String name)
	{
		String name1 = Verify.verifyName(name);
		if (name1 != null);
			this.name = name1;
	}
	
	public void setParent(INode node)
	{
		this.parent = node;
	}
	
	
}

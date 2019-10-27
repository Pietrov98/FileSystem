package Directory_package;

import java.util.ArrayList;
import java.util.List;

import File_package.File;
import Node_package.INode;
import Node_package.Node;

public class Directory extends Node{

	private List<INode> ListofNodes  = new ArrayList<INode>();
	private List<INode> ListofNodes_helper  = new ArrayList<INode>();
	public void printContent(int loop_counter)
	{
		if(ListofNodes.isEmpty() != true && loop_counter == 0)
			System.out.println("\n" + this.getName());
		for(int i = 0; i < ListofNodes.size(); i++)
		{
			
			if(ListofNodes.get(i) instanceof Directory)
			{	
				//System.out.print("- ");
				for(int j = 0; j <= loop_counter; j++)
					System.out.print("- ");
				loop_counter++;
				System.out.println(ListofNodes.get(i).getName() + " ");
				((Directory) ListofNodes.get(i)).printContent(loop_counter);
				loop_counter--;
			}
			else
			{
				for(int j = 0; j <= loop_counter; j++)
				System.out.print("- ");
				System.out.println(ListofNodes.get(i).getName() + " ");
				
			}
			
		}
	}
	
	public void add(INode node)
	{
		node.setParent(this);
		this.ListofNodes.add(node);
		System.out.println("Adding successful");;
	}
	
	public void remove(INode node)
	{
		if(this.ListofNodes.remove(node) == true)
			System.out.println("Removing successful");
	}
	
	public INode getByName(String name)
	{
		for(int i = 0; i < this.ListofNodes.size(); i ++)
		{
			if(this.ListofNodes.get(i).getName() == name)
			{
				System.out.println("Element of name " + name + " exist");
				return this.ListofNodes.get(i);
			}
		}
		System.out.println("Element doesn't exist");
		return null;
	}
	
}

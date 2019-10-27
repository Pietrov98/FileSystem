package Main_package;

import Directory_package.Directory;
import File_package.File;
import Node_package.INode;

public class Main {
	public static void main(String[] args)
	{
		INode root = new Directory();
		INode dir1 = new Directory();
		INode dir2 = new Directory();
		INode dir3 = new Directory();
		INode file1 = new File();
		root.setName("root");
		dir1.setName("dir1");
		dir2.setName("dir2");
		dir3.setName("dir3");
		file1.setName("file1");
		((Directory) root).add(dir1);
		((Directory) root).add(dir2);
		((Directory) dir2).add(dir3);
		((Directory) dir3).add(file1);
		((Directory) root).printContent(0); // musi byc 0 by wszystko ladnie wypisywalo
		//((Directory) root).remove(dir2);
		//((Directory) root).printContent(0);
		//System.out.println();
		//file1.printPath();
		//dir3.printPath();
		//System.out.println(((Directory) root).getByName(dir1.getName()));
	}
}

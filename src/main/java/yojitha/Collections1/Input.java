package yojitha.Collections1;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Input{
	public void main(String args[])
	{
		 List<Integer> li = new  ArrayList<Integer>();
		 li.add(1);
		 li.add(2);
		 li.add(3);
		 li.add(4);
		 li.add(5);
		 li.add(6);
		 li.add(7);
		 li.add(8);
		 li.add(9);
		 li.add(10);
		 Printlist(li);
	     System.out.println("enter the element you want to add");
	    Scanner sc = new Scanner(System.in);
	    int x=sc.nextInt();
	    Addelement(li,x);
	    System.out.println("enter the element you want to delete");
	    int w = sc.nextInt();
	    deleteelement(li,w);
	    
	
	}
	public void Addelement(List<Integer> li,int y)
	{
		li.add(y);
	}
	
	public  void Printlist(List<Integer> li)
	{		 
    ListIterator<Integer> i =li.listIterator();
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
	}
    public void  deleteelement(List<Integer> li,int y)
    {
        System.out.println(new Integer(y));
    }
	}


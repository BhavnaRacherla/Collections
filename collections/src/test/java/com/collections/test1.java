package com.collections;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;



public class test1 {
	private static Logger LOGGER=LogManager.getLogger(test1.class);
	@Test
	public void collection() {
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); 
		int c=0;
		Scanner s=new Scanner(System.in);
		do {
		LOGGER.info("Menu");
		LOGGER.info("1.Get element at position");
		LOGGER.info("2.Insert Element");
		LOGGER.info("3.Delete element at given position");
		LOGGER.info("4.Display");
		LOGGER.info("5.Exit");
		LOGGER.info("Enter choice");
		c=s.nextInt();
		switch(c) {
		case 1:LOGGER.info("Enter position to get element");
		       int p=s.nextInt();
		       int e=al.get(p-1);
		       LOGGER.info("Element at position "+ (p) +" is "+e);
		       break;
		case 2:LOGGER.info("Enter element to be inserted");
		       int e1=s.nextInt();
		       al.add(e1);
		       break;
		case 3:if(al.size()>0) {LOGGER.info("Enter position to delete element");
		       int p1=s.nextInt();
		       int e2=al.remove(p1-1);
		       LOGGER.info("Element deleted is "+e2+" at position "+(p1));}
		       else {
		    	   LOGGER.info("List is empty");
		       }
               break;
		case 4:if((al.size())>0) {
			    LOGGER.info("The list is:");
		
		       Iterator<Integer> it=al.iterator();
		       while(it.hasNext()) {
		    	   LOGGER.info(it.next());
		       }
		}
		else {
			  LOGGER.info("List is empty");
		}
		       break;
		case 5:System.exit(1);
		       
		       
			
		}
		}while(c!=5);
	}

}

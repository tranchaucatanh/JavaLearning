package mySweetProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class MySweetProgram {

	public static void main(String[] args){
			
	// create list
	LinkedList<String> namesList = new LinkedList<String>();
	
	// Insert at the end BOTTOM of the list QUEUE
	namesList.add("YOU");
	namesList.add("LOVE");
	namesList.add("ME");
	
	// Print YOU LOVE ME PRINT BOTTOM FIRST 
	// can use .pop() = removeFirst(); 
	// .remove() -> pass index to remove
	while(!namesList.isEmpty()) {
		System.out.print(namesList.remove() + " ");
	}
	
	// Print [] queue empty
	System.out.println(namesList);
	
	// Insert at the front  of the list STACK 
	namesList.push("Love");
	namesList.push("You");
	namesList.push("Much");
	
	for (String name : namesList) {
	System.out.print(name + " ");
	}
	
	// print Much You Love - LAST IN FIRST OUT FIRST 
} 
}

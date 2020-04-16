package mySweetProgram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;


public class MySweetProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// Reading file
		Scanner in = new Scanner(new File("pet.txt"));
		
		// create list
		List<String> petsList = new ArrayList<String>();
		
		//Read input to list
		while (in.hasNext()) {
			petsList.add(in.nextLine());
		} 
		
		// Simple loop
		for (int i=0; i<petsList.size(); i++) {
			System.out.println(petsList.get(i));
		}
		
		
		// Adding to ArrayList petsList
		petsList.add("Chicken");
		petsList.add("Snake");
		

		//  Range loop
		for (String pet: petsList) {
			System.out.println(pet);
		}

		
		// Using iterator // check listIterator
		Iterator<String> petEach = petsList.iterator();
		
		while(petEach.hasNext())
		{
			System.out.println(petEach.next());
		}
		
		// Using iterator for each 
		petsList.forEach((pet)->{System.out.println(pet);}); 
		
		
		in.close();
	}

}

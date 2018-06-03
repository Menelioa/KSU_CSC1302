/**
 * Lab_3 
 * CSC 1302 M-W 11:00-3:50
 * Menelio Alvarez 
 * 6/2/2018
 * */
package mod1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Lad_4_Menelio {

	public static void main(String[] args) {
		//create a file object to handle sampledata-io.txt
		File sampledata = new File("sampledata-io.txt");
		//create an array to hold data from sampledata-io.txt
		double[] data = new double[100];
		//create a scanner for reading sampledata using crtScanner method
		Scanner input = crtScanner(sampledata);
		//int for counting data entered into data
		int c=0;
		//while loop to populate array data from sampledata
		while(input.hasNext()) {
			double d = input.nextDouble();
			if(d==-1.0)break;
			data [c] = d; 
			c++;
		}
		//reverse data array
		data=reverseArray(data);
		//print out reversed array
		displayArray(data);
		
		//add to array with
		data=insertIntoArray(data);
		
		//print out edited array
		displayArray(data);
		
		//remove from 
		removeElementFromArray(data);
		//print out edited array
		displayArray(data);
	}
	//method for displaying and array
	private static void displayArray(double[] data) {
		for(int i=0; i < data.length;i++) {
			System.out.println("Position "+i+" = "+data[i]);
		}
	}	
	//Method for creating Scanner 
	private static Scanner crtScanner( File sampledata) {
		try {
			Scanner input = new Scanner(sampledata);
			return input;
		} catch (FileNotFoundException e) {
			System.out.println("Scanner threw exception");
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}
	//Method for reversing array
	private static double[] reverseArray(double[] data) {
		double [] reverse = new double[data.length];
		
		for(int i=0;i < reverse.length; i++) {
			reverse[i] = data[(data.length-1)-i];
		}
		
		return reverse;
	}
	//Method for inserting elements into a vacant space in an array
	private static double[] insertIntoArray(double[] data) {
		//while loop to check if array is full
		boolean space=false;
		int vacantSpace=0;
		for(int i=0; i<data.length;i++) {
			if(data[i]==0.0) {
				space=true;
				vacantSpace = i;
				break;
			}
		}
		//if no space print message and exit method
		if(!space) {
			System.out.println("Array is full");
			System.exit(0);
		}
		//scanner 
		Scanner console = new Scanner(System.in);
		//double for holding double enterd for user
		double d = 0.0;
		//int for holding index of inserted element
		int p = 0;
	
		
		//get user input
		System.out.println("enter in double");
		//loop to make sure user input is a double
		doubleLoop:
		while(true) {
			String t=console.next();
			try {
				d=Double.parseDouble(t);
				break doubleLoop;
			}catch(NumberFormatException e) {
				System.out.println("Please enter a double");
			}			
		}
		data[vacantSpace]=d;
		System.out.println("Element added");
		//return editedData
		return data;
	}
	//method for removing and element from an array
	private static double[] removeElementFromArray(double[] data) {
		//scanner for user input
		Scanner console = new Scanner(System.in);
		//int for index of element to be removed
		int p=0;
		//ask user for index of element to remove
		System.out.println("enter in int for position");
		//loop to make sure user input is an int
		indexLoop:
		while(true) {
			String t =console.next();
			try {
				p=Integer.parseInt(t);
				break indexLoop;
			}catch(NumberFormatException e) {
				System.out.println("Please enter an integer");
			}	
		}
		data[p]=0.0;
		System.out.println("Element removed");
		return data;
	}
	
	//Method for replacing an element in the array
	private static double[] replaceIntoArray(double[] data) {
		//scanner 
		Scanner console = new Scanner(System.in);
		//double for holding double enterd for user
		double d = 0.0;
		//int for holding index of inserted element
		int p = 0;
		//array for douplication + added element
		double[] editedData= new double[data.length];
		
		//get user input
		System.out.println("enter in double");
		//loop to make sure user input is a double
		doubleLoop:
		while(true) {
			String t=console.next();
			try {
				d=Double.parseDouble(t);
				break doubleLoop;
			}catch(NumberFormatException e) {
				System.out.println("Please enter a double");
			}			
		}
		System.out.println("enter in int for position");
		//loop to make sure user input is an int
		indexLoop:
		while(true) {
			String t =console.next();
			try {
				p=Integer.parseInt(t);
				break indexLoop;
			}catch(NumberFormatException e) {
				System.out.println("Please enter an integer");
			}	
		}
		
		//for loop for duplicating array + new element
		for(int i = 0; i <data.length;i++) {
			if(i < p) {
				editedData[i] = data[i];
			}else if(i==p) {
				editedData[i]= d;
			}else if(i > p){
				editedData[i] = data[i];
			}
		}
		//return editedData
		return editedData;
	}	
	
	
}
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PracticeTestAlpha {

	public static void main(String[] args) {
		//Scanner for user input 
		Scanner console = new Scanner(System.in);
		
		//ArrayList for questions
		ArrayList question = new ArrayList<String>();
		//ArrayList for answers
		ArrayList answer = new ArrayList<String>();
		//file for questions and its scanner
		File questionFile = new File("quistions.txt");
		//file for answers and its scanner
		File answerFile = new File("answer.txt");
		//main while loop
		int menu =0;
		loop:
		while(true) {
			//Main Menu
			System.out.println("Please select one of the following options \n"
						 + "1) Add quistion \n"
						 + "2) Take practice test \n"
						 + "3) Quit");
			menu=console.nextInt();
			console.nextLine();
			
			switch (menu) {
				case 1:
					addQuestion(questionFile, answerFile, console);
					break;
				case 2:
					takeTest( question, answer,questionFile, answerFile);
					System.out.println("\n Please press enter to return to the main menu");
					console.nextLine();
					break;
				case 3:
					break loop;
					
			}
		}
	}
	//method for creating Scanners
	public static Scanner createScanner(File file) {
		try {
			return new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//method for adding questions
	public static void addQuestion(File questionFile, File answerFile, Scanner console) {
		System.out.println("Please enter question number");
		int numQ = console.nextInt();
				   console.nextLine();
		System.out.println("Please Enter question");
		try(FileWriter fw = new FileWriter(questionFile, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(numQ+") "+console.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Please Enter answer to quistion");
		try(FileWriter fw = new FileWriter(answerFile, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(numQ+") "+console.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void takeTest(ArrayList question, ArrayList answer, File questionFile, File answerFile) {
		//create Scanner to populate arrayList
		Scanner inputQ = createScanner(questionFile);
		Scanner inputA = createScanner(answerFile);
		//populate arrayList with loop
		int i=0;
		while(inputQ.hasNextLine()&&inputA.hasNextLine()) {
			question.add(inputQ.nextLine());
			answer.add(inputA.nextLine());
		}
		//pick random int to pick question and answer
		int QAnum = 0;
		if(question.size()==answer.size()) {
			QAnum = (int)(Math.random() * question.size());
		}
		//print out Q
		
		System.out.println("Question: \n"+
							question.get(QAnum)+"\n"
							+ "Press enter to see answer.");
		new Scanner(System.in).nextLine();
		System.out.println("Answer:\n"+answer.get(QAnum));
	}
}
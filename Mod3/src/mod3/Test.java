/**
 * Mod3 Test
 * CSC 1302 M-W 11:00-3:50
 * Menelio Alvarez 
 * 6/16/2018
 * */
package mod3;

public class Test {

	public static void main(String[] args){
	//test for Person, Employee, Student, Staff, and Faculty
	Person person = new Person("Max", "Max@yahoo.com");
	Employee employee = new Employee("Max", "Max@yahoo.com",50000.00);
	Student student = new Student("Max", "Max@yahoo.com","FO");
	Staff staff = new Staff("Max", "Max@yahoo.com",50000.00,"Clerk");
	Faculty faculty = new Faculty("Bob", "Bob@yahoo.com",65000.00,"10:00-12:30");
	System.out.println("person = "+person.toString()+
						"\nemployee = "+ employee.toString()+ 
						"\nstudent = "+student.toString()+
						"\nstaff = "+staff.toString()+
						"\nfaculty = "+faculty.toString());
	
	//test CountWords
	try {
		CountWords countWords = CountWords.makeCountWords();
		
		System.out.println(countWords.count());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}

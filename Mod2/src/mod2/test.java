package mod2;

import java.sql.Date;

public class test {

	public static void main(String[] args) {
		
		//test Time class
		Time time = new Time();
		System.out.println("Current time using Time class");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		//add five minutes
		System.out.println("+5 mins");
		time.setTime(System.currentTimeMillis()+(60*1000*5));
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		//test TimeVideoTut Class
		TimeVideoTut time2 = new TimeVideoTut();
		System.out.println("Current time using TimeVideoTut class");
		System.out.println(time2.getHour()+":"+time2.getMinute()+":"+time2.getSeconds());
		//add five minutes
		System.out.println("+5 mins");
		time2.setTime(System.currentTimeMillis()+(60*1000*5));
		System.out.println(time2.getHour()+":"+time2.getMinute()+":"+time2.getSeconds());
		
		//Test MyInteger
		System.out.println("Test MyInteger class");
		MyInteger myInt = new MyInteger(15);
		System.out.println();
		System.out.println(myInt.isPrime());
		
		//Test PrimeFactor clas
		System.out.println("Test PrimeFactor class");
		PrimeFactor primeFactor = new PrimeFactor();
		primeFactor.findFactors();
		primeFactor.printOutStack();
		
		
	}

}

package simplej;
import java.util.*;

class UnderAgeException extends Exception{
	public String toString() {
		return "You are UnderAge";
	}
}
class OverAgeException extends Exception{
	public String toString() {
		return "You are OverAge";
	}
}
class Age{
	int age;
	
	void collectData() {
		System.out.println("Enter the age: ");
		Scanner sc= new Scanner(System.in);
		age = sc.nextInt();
		sc.close();
	}
	
	void verify() throws OverAgeException, UnderAgeException {
		if(age>18 && age<65) {
			System.out.println("Give the license");
		}
		else if(age<18) {
			UnderAgeException ua= new UnderAgeException();
			//System.out.println(ua.toString());
			throw ua;
		}
		else {
			OverAgeException oa= new OverAgeException();
			//System.out.println(oa.toString());
			throw oa;
		}
	}
}

class Check{
	void ageCheck() {
		Age a=new Age();
		a.collectData();
		try {
			a.verify();
		}
		catch(Exception e){
			System.out.println(e.toString());
			
		}
	}
}
public class ExampleExceptionHandling {
	public static void main(String[] args) {
		Check ch=new Check();
		ch.ageCheck();
	}
}

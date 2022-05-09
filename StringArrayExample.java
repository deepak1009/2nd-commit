package simplej;
import java.util.*;

public class StringArrayExample {  
    public static void main(String[] args) {  
    	Scanner sc= new Scanner(System.in);
    	
        String[] strArray = { "Ani", "Sam", "Joe" };  
        boolean x = false; //initializing x to false  
        int in = 0; //declaration of index variable  
        System.out.println("Enter the string to be searched: ");
        String s = sc.nextLine();  // String to be searched 
        System.out.println("String entered: "+ s);
        // Iteration of the String Array  
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
        sc.close();
        
    }  
}  

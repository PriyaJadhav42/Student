package arrayexample;

import java.util.Scanner;

public class InputFromUserInArray {
	public static void main(String[] args) {

		System.out.println("Enter the size of Array");

		Scanner sc = new Scanner(System.in);
       int size=sc.nextInt();
		
       int arr[]=new int[size];
       
       System.out.println("Enter Array Elements");
       
       for(int i=0;i<size;i++) {
    	   arr[i]=sc.nextInt();
       }
       
       System.out.println("Printing of Array Elemets by using normal for loop");
       int length = arr.length;
       for(int i=0;i<length;i++) {
    	System.out.println(arr[i]);
       }
       
       System.out.println("Array elements printing using foreach loop");
       
       for(int a:arr) {
    	   System.out.println(a);
       }
       
       
	}

}

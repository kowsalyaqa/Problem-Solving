package tests;

public class ArrayDemo {

	public static void main(String[] args) {
		//Declares an Array of Integers - Memory will not allocate
		int[] array;
		
		//Allocates memory for 10 Integers\
		array=new int[10];
		
		//Initialize First Element
		array[0]=100;
		
		//Initialize Second Element
		array[1]=200;
		
		//and Initialize till last Element 
		array[2]=300;
		array[3]=400;
		array[4]=500;
		array[5]=600;
		array[6]=700;
		array[7]=800;
		array[8]=900;

		System.out.println("Element at index 'o' :"+array[0]);
		System.out.println("Element at index '8' :"+array[8]);
		
		//If Element is non-initialized, Default value of the type of array will assigned.
		System.out.println("Non-intialized Element at index '9' :"+array[9]);
		
		//Another type of declaration of array
		int[] array1= {10,20,30,40,50,60,70,80,90};
		
		System.out.println(array1[2]);
		System.out.println(array1.length);
		
		for (int i : array1) {
			System.out.println(i);
		}      
	}

}

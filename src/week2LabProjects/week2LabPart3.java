package week2LabProjects;

public class week2LabPart3 {

	public static void main(String[] args) {
	//write a for loop that prints each number from 0 to 9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	//write a for loop that prints each number from 10 to 0 backwards
		for (int i = 10; i >=0; i--) {
			System.out.println(i);
		}
		
	//write a for loop that prints every other number from 0 to 100
		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		
	//write a for loop that iterates from  0 to 100 and prints "EVEN" if the number is even and "ODD" if it's odd
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println("ODD");
			} else System.out.println("EVEN");
		}
		
	//write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
	//divide each number by 3 and print the remainder to the console
		int i = 100;
		while (i > 0) {
			System.out.println(i + " " + (i % 3) );
			i --;
		}
				
			
		}
		
	}



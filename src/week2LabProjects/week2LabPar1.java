package week2LabProjects;

public class week2LabPar1 {

	public static void main(String[] args) {
		
		//create a variable named age and assign it a value of 14
		int age = 14;
		
		//print the boolean expression age >= 16 to the console and note the results.
		//change value of age to 18 and run again.
		
		System.out.println(age >= 16);
		age =17;
		System.out.println(age >= 16);
		
		//using a conditional, print "You can drive" if age is great than or equal to 16
		// and "You cannot drive" otherwise
		// change the value of age and rerun the result
		boolean hasLicense = true;
		 
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
			
		//add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need for
		//hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		

		//create two new variables - costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		//or if thirstLevel is great than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		
		double costOfMilk = 2.99;
		int thirstLevel = 8;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following based on the following conditions:
		//if there are 0 cookies remaining, print "Sad Face"
		//if there are there are less than 2 cookies, print "Yes!"
		//if there are less than 5 cookies, print "Whoohoooo!"
		//if there are 5 or more cookies, print "Jackpot!"
		
		int numberOfCookies = 29;
		int numberOfChildren = 6;
		
		if (numberOfCookies % numberOfChildren == 0){
			System.out.println("Sad Face");
			} else if (numberOfCookies % numberOfChildren < 2) {
				System.out.println("Yes!");
			} else if (numberOfCookies % numberOfChildren < 5) {
				System.out.println("Whoohoooo!");
			} else {
				System.out.println("Jackpot!");
			}
		}
}



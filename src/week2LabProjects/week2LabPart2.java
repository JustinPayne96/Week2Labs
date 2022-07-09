package week2LabProjects;

public class week2LabPart2 {

	public static void main(String[] args) {
	
	//create a variable called loyaltyMemberStatus and assign the value "SILVER"
	//create a variable called loyaltyMemberDiscount and assign the value 0.0
	//using a switch, set the value of loyaltyMemberDiscount based on the following loyaltyMemberStatus scale
	//"SILVER" is 0.10, "GOLD" is 0.15, and "PLATINUM" is 0.25
		
	String loyaltyMemberStatus = "SILVER";
	double loyaltyMemberDiscount = 0.0;
	
	switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = .1;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
	}
	System.out.println(loyaltyMemberDiscount);
	
	
	//create a variable called billTotal and assign a value
	//create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
	//if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
	
	
	double billTotal = 600.00;
	double adjustedTotal = (billTotal - (billTotal * loyaltyMemberDiscount));
	System.out.println(adjustedTotal);

	if (adjustedTotal > 500)
		if (loyaltyMemberStatus == "SILVER") {
			loyaltyMemberStatus = "GOLD";
		} else if (loyaltyMemberStatus == "GOLD") {
			loyaltyMemberStatus = "PLATINUM";
		}

		System.out.println(loyaltyMemberStatus);


	//create two variable: username and password
	//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
	//otherwise, print "access denied"
	
	String username = "Tommy123";
	String password = "12345";
		
	if (username.equals("Tommy123"))	{
		if (password.equals ("12345")) 
	 System.out.println("Login Successful");
	} else {
		System.out.println("Access Denied");
	}

}
}

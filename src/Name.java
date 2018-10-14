
public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	/*public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
	}*/
	
	public Name(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	
	
	

	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	
	public String getFAndLName() {
		return firstName + " " + lastName;
	}
	
	public String getLastCommaFirst() {
		return lastName + ", " + firstName;
	}

	
	//Initials of Competitors
	public char getInitPeriodFirst() {
		return firstName.charAt(0);
	}
	public char getInitPeriodLast(){
			return lastName.charAt(0);
	}

	//lecture
	public String getFullName() {	
		String result = firstName + "";
				if (!middleName.equals("")) {
			result += middleName + " ";
		} 
		result += lastName; //+= means 'add RHS to LHS' - same as result = result + middleName + "";
		return result;
		
		
	}
		
		
		
		
}
	


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
	public Name() {
		
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
	public void setNameSurname(String name_sname) {
		//nujno podelit name_sname na name i sname
		String[] s = name_sname.split(" ");
		this.firstName = s[0].trim();
		this.lastName = s[1].trim();
		
	}
		
		
		
		
}
	

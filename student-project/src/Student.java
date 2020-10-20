
public class Student {
	private String firstName;
	private String lastName;	

	public Student(String fName, String lName) {
		if (fName == "") {
			firstName = "Unknown";
		} else {
			firstName = fName;
		}
		if (lName == "") {
			lastName = "Unknown";
		} else {
			lastName = lName;
		}
	}
	
	/*
	 *  @return first name
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 *  @return last name
	 */
	public String getLastName() {
		return lastName;
	}
}

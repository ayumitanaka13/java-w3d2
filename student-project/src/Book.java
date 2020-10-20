
public class Book {
//	public String bookTitle; --> Unknown
//	public String firstName; --> John
//	public String lastName;	--> Doe
//	public int publishedYear; --> 1900 
	
//	public Book(String title, String fName, String lName, int year) {
//		bookTitle = title;
//		firstName = fName;
//		lastName = lName;
//		publishedYear = year;	
//	}
	
	private String bookTitle;
	private String firstName;
	private String lastName;	
	private int publishedYear;
	
	public Book (String title, String fName, String lName, int year) {
		if (title == "") {
			bookTitle = "Unknown";
		} else {
			bookTitle = title;
		}
		if (fName == "") {
			firstName = "John";
		} else {
			firstName = fName;
		}
		if (lName == "") {
			lastName = "Doe";
		} else {
			lastName = lName;
		}
		if (year < 1900) {
			publishedYear = 1990;
		} else {
			publishedYear = year;
		}
	}
	
	/*
	 *  @return title
	 */
	public String getTitle() {
		return bookTitle;
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
	/*
	 *  @return year
	 */
	public int getYear() {
		return publishedYear;
	}
}

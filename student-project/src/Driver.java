
public class Driver {

//	public static void main(String[] args) {
//		Student student1 = new Student("", "");
//		Student student2 = new Student("Jane", "Dew");
//
//		System.out.println(student1.getFirstName() + " " + student1.getLastName());
//		System.out.println(student2.getFirstName() + " " + student2.getLastName());
		
		public static void main(String[] args) {
			Book book1 = new Book("Harry Potter", "", "", 2000);			
			Book book2 = new Book("", "Ayumi", "Tanaka", 2020);
			Book book3 = new Book("Travell in Japan", "Taro", "Yamada", 1600);
			
			// String is object
			String studentName = null;
			System.out.println(book1.getTitle() + " by " + book1.getFirstName() + " " + book1.getLastName() + " was published in " + book1.getYear());
			System.out.println(book2.getTitle() + " by " + book2.getFirstName() + " " + book2.getLastName() + " was published in " + book2.getYear());
			System.out.println(book3.getTitle() + " by " + book3.getFirstName() + " " + book3.getLastName() + " was published in " + book3.getYear());
	}
}

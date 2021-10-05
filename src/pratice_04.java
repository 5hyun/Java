import java.util.Scanner;
class Book {
	String title, author, year;
	
	public Book(String title, String author, String year) { 
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public Book(String title, String author) { 
		this(title, author, "발간년도미상");
	}
	/*public Book(String title, String author, String year) { 
		this.title = title;
		this.author = author;
		this.year = year;
	}
	
	public Book(String title, String author) { 
		this.title = title;
		this.author = author;
		this.year = "발간년도미상";
	}*/
	
}
public class pratice_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book [] book = new Book[2]; 
		
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			System.out.print("발간년도>>");
			String year = scanner.nextLine();
			
			if(year == "")
				book[i] = new Book(title, author);
			else
				book[i] = new Book(title, author, year); 
		}
		for(int i=0; i<book.length; i++)
			System.out.print("(" + book[i].title + ", " + book[i].author + ", " + book[i].year + ")");
	}
}